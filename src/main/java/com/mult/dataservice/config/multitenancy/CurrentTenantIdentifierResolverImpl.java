
package com.mult.dataservice.config.multitenancy;


import org.apache.commons.lang3.StringUtils;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

import com.mult.dataservice.util.TenantContextHolder;

@Component
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

	private static final String DEFAULT_TENANT_ID = "default_tenant";
	
	@Override
	public String resolveCurrentTenantIdentifier() {
        System.out.println("Inside resolver!!!!");
		String tenant = TenantContextHolder.getTenant();
		
		return StringUtils.isNotBlank(tenant) ? tenant : DEFAULT_TENANT_ID;
	}

	@Override
	public boolean validateExistingCurrentSessions() {
		return true;
	}

}
