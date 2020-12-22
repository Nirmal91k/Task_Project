package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	private Properties url;
	private Properties username;
	private Properties password;

	public Properties init_prop() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}

	public String getApplicationUrl() {
		String url = prop.getProperty("base_url");
		return url;
	}

	public String getUsername() {
		String username = prop.getProperty("LoginUserName");
		return username;
	}

	public String getPassword() {
		String password = prop.getProperty("LoginPassword");
		return password;
	}

}
