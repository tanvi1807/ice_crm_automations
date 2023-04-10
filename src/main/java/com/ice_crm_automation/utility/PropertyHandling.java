package com.ice_crm_automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling 
{
	Properties properties;
	
	public PropertyHandling()
	{
		try 
		{
			String filepath= System.getProperty("user.dir")+"/config.properties";
			FileInputStream file= new FileInputStream(filepath);
			properties= new Properties();
			properties.load(file);
		}catch(IOException e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public String getProperty(String key)
	{
		String value=properties.getProperty(key);
		System.out.print(value);
		return value;
	}
}
