package com.interview.model;

public enum DataType {
	BOOLEAN, DOUBLE, INT, STRING;
	
	public static DataType getDataType(String dataType) {
		for (DataType type : DataType.values()) {
			if (type.name().equals(dataType)) {
				return type;
			}
		}
		return null;
	}
}
