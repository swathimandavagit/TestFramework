package com.test.TestFramework.Common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationLoader {
	
	// Generic keys
		public static final String BROWSER = "browser";
		public static final String environment = "environment";
	
	//Create an object of Properties class
	private Properties properties = new Properties();
	
	protected ConfigurationLoader() throws IOException {
		InputStream is = ClassLoader.getSystemResourceAsStream("ConfigProperties.properties");
		properties.load(is);
	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}
}
