package com.interview.model;

import java.util.*;

public class AttributeParser {
	Map<String, DataType> attributeDataTypeLookup = new HashMap<>();

	static AttributeParser instance = null;

	public static AttributeParser getInstance() {
		if (instance == null) {
			instance = new AttributeParser();
		}
		return instance;
	}

	private AttributeParser() {

	}

	public void parseAttribue(Map<String, String> attributeLookup) throws ColumnIsNotValidException {
		// Parse data type
		for (String k : attributeLookup.keySet()) {
			String value = attributeLookup.get(k);
			if (!attributeDataTypeLookup.containsKey(value)) {// if not found then define
				if (value.equals("TRUE") || value.equals("true") || value.equals("FALSE") || value.equals("false")) {
					attributeDataTypeLookup.put(k, DataType.getDataType("TRUE"));
				}
				// Do for all if not defined
				else if (value.equals(".")) {// double
					attributeDataTypeLookup.put(k, DataType.getDataType("DOUBLE"));
				}
			} else {// found then validate

			}

		}
	}

	public boolean isAllAttrbuteDefined(Map<String, String> attributeValueLookup){
		//Parse data type
		for (String attribute: attributeValueLookup.keySet()) {
			if (!attributeDataTypeLookup.containsKey(attribute)) {
				return false;
			}
		}
		return true;
	}
