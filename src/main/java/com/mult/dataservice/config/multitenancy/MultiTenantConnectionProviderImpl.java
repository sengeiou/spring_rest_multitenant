package com.mult.dataservice.config.multitenancy;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.hibernate.engine.jdbc.connections.spi.AbstractMultiTenantConnectionProvider;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

@Component
public class MultiTenantConnectionProviderImpl extends AbstractMultiTenantConnectionProvider {

	private static final long serialVersionUID = -9089779460372967461L;
	private HashMap<String, ConnectionProviderImpl> connProviderMap = new HashMap<String, ConnectionProviderImpl>();
	
	public MultiTenantConnectionProviderImpl() {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser
					.parse(new FileReader("/root/playground/TamlMultiTenantDs/src/main/resources/configprops.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray datasources = (JSONArray) jsonObject.get("data_sources");
			for (int i = 0; i < datasources.size(); i++) {
				JSONObject object = new JSONObject();
				object = (JSONObject) datasources.get(i);
				connProviderMap.put((String) object.get("tenantId"), new ConnectionProviderImpl(
						new DataSourceUtil((String) object.get("username"), (String) object.get("password"), (String) object.get("url"), (String) object.get("driverClassName"))));
			
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

	}


	@Override
	protected ConnectionProvider getAnyConnectionProvider() {
		return connProviderMap.get("default_tenant");

	}

	@Override
	protected ConnectionProvider selectConnectionProvider(String tenantId) {
		ConnectionProvider connectionProvider = connProviderMap.get(tenantId);
		if (connectionProvider == null) {
			connectionProvider = new ConnectionProviderImpl(getDefaultDataSourceUtil());
		}
		return connectionProvider;

	}

	protected DataSourceUtil getDefaultDataSourceUtil() {
		return new DataSourceUtil("postgres","postgres","jdbc:postgresql://localhost:5432/default_tenant","org.postgresql.Driver");
	}

}
