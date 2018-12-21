package com.mult.dataservice.config.multitenancy;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

public class ConnectionProviderImpl implements ConnectionProvider {

	private static final long serialVersionUID = 4310251762958162428L;

	private BasicDataSource basicDataSource = new BasicDataSource();

	public ConnectionProviderImpl(DataSourceUtil dataSourceUtil) {
		basicDataSource.setUrl(dataSourceUtil.getUrl());
		basicDataSource.setDriverClassName(dataSourceUtil.getDriverClassName());
		basicDataSource.setUsername(dataSourceUtil.getUsername());
		basicDataSource.setPassword(dataSourceUtil.getPassword());
		basicDataSource.setInitialSize(1);
		basicDataSource.setMaxTotal(10);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean isUnwrappableAs(Class arg0) {
		return false;

	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		return null;
	}

	@Override
	public void closeConnection(Connection arg0) throws SQLException {
		arg0.close();

	}

	@Override
	public Connection getConnection() throws SQLException {
		return basicDataSource.getConnection();

	}

	@Override
	public boolean supportsAggressiveRelease() {
		return false;

	}

	public BasicDataSource getBasicDataSource() {
		return basicDataSource;
	}

	public void setBasicDataSource(BasicDataSource basicDataSource) {
		this.basicDataSource = basicDataSource;
	}
	

}
