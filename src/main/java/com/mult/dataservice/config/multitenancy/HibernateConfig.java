package com.mult.dataservice.config.multitenancy;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource(value = { "classpath:application.properties" })
@ComponentScan({ "com.mult.dataservice" })
public class HibernateConfig {

	Logger Log = Logger.getLogger(HibernateConfig.class);
	
	@Autowired
	private Environment environment;
	
	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setMultiTenantConnectionProvider(multiTenantConnectionProvider());
		sessionFactory.setCurrentTenantIdentifierResolver(currentTenantIdentifierResolver());
		sessionFactory.setPackagesToScan(new String[] { "com.mult.dataservice" });
		sessionFactory.setHibernateProperties(hibernateProperties());

		return sessionFactory;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

	@Bean(name = "transactionManager")
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
	}

	@Bean
	public CurrentTenantIdentifierResolver currentTenantIdentifierResolver() {
		return new CurrentTenantIdentifierResolverImpl();
	}

	@Bean
	public MultiTenantConnectionProvider multiTenantConnectionProvider() {
		MultiTenantConnectionProviderImpl multImpl = new MultiTenantConnectionProviderImpl();
		multImpl.selectConnectionProvider(currentTenantIdentifierResolver().resolveCurrentTenantIdentifier());
		return multImpl;
	}

	@SuppressWarnings("serial")
	Properties hibernateProperties() {
		return new Properties() {
			{
				setProperty("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
				setProperty("hibernate.dialect", environment.getProperty("hibernate.dialect"));
				setProperty("hibernate.globally_quoted_identifiers", "true");
				setProperty("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
				setProperty("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
				setProperty("hibernate.multiTenancy", "DATABASE");
				setProperty("hibernate.tenant_identifier_resolver",
						"com.mult.dataservice.config.multitenancy.CurrentTenantIdentifierResolverImpl");
				setProperty("hibernate.multi_tenant_connection_provider",
						"com.mult.dataservice.config.multitenancy.MultiTenantConnectionProviderImpl");

			}
		};
	}

}
