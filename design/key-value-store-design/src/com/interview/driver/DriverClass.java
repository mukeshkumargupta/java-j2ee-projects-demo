package com.interview.driver;

import java.util.*;

import com.interview.service.DataStoreService;

public class DriverClass {
	public static void main(String[] args) {
		System.out.println("Drive class called");
		try {
			Map<String, Map<String, String>> keyValueLookup = new HashMap<>();
			Map<String, String> columnHeaderAttribute = new HashMap<>();
			columnHeaderAttribute.put("Value", "Value");
			keyValueLookup.put("Key", columnHeaderAttribute);
			
			Map<String, String> attributeName = new HashMap<>();
			attributeName.put("Lat", "Lat");//suppose double
			attributeName.put("Lon", "Lon");//suppose double
			attributeName.put("Population", "Population");//Suppose String 
			attributeName.put("FreeFood", "FreeFood");//Suppose boolean
			keyValueLookup.put("Attribute", attributeName);
			
			Map<String, String> attributeValue = new HashMap<>();
			attributeName.put("Lat", "1.5");//suppose double
			attributeName.put("Lon", "2.5");//suppose double
			attributeName.put("Population", "1 million");//Suppose String 
			attributeName.put("FreeFood", "TRUE");//Suppose boolean
			keyValueLookup.put("Delhi", attributeValue);
			
			DataStoreService dataStoreServiceInstance = DataStoreService.getInstance();
			dataStoreServiceInstance.addData(keyValueLookup);
			//Test case
			
			//1. Try to add header again and again, it should fail
			//2. Try to add boolean for string data type it should fail
			//3 Search data with filter
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
