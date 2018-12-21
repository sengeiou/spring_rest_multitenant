package com.mult.dataservice.config.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

@Configuration
@EnableResourceServer
public class OAuthResourceServer extends ResourceServerConfigurerAdapter {

	@Autowired
	private CustomAccessTokenConverter customAccessTokenConverter;

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.tokenServices(tokenServices());
	}

	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		converter.setAccessTokenConverter(customAccessTokenConverter);
		converter.setSigningKey("123");
		return converter;
	}

	@Bean
	@Primary
	public RemoteTokenServices tokenServices() {

		final RemoteTokenServices tokenService = new RemoteTokenServices();
		tokenService.setCheckTokenEndpointUrl("http://localhost:8080/multi-ds/oauth/check_token");
		tokenService.setClientId("api-root-client");
		tokenService.setClientSecret("secret");
		tokenService.setAccessTokenConverter(accessTokenConverter());
		return tokenService;
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).and().requestMatchers()
		.antMatchers("/**").and().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/api/**").permitAll()
		.antMatchers(HttpMethod.GET, "/api/**").access("#oauth2.hasScope('read')")
		.antMatchers(HttpMethod.PATCH, "/api/**").access("#oauth2.hasScope('write')")
		.antMatchers(HttpMethod.POST, "/api/**").access("#oauth2.hasScope('write')")
		.antMatchers(HttpMethod.PUT, "/api/**").access("#oauth2.hasScope('write')")
		.antMatchers(HttpMethod.DELETE, "/api/**").access("#oauth2.hasScope('write')").antMatchers("/admin/**")
		.access("hasRole('ROLE_ADMIN')");
	}
}
