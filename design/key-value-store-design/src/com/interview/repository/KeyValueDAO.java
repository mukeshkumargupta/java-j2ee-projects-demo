package com.interview.repository;

import java.util.*;

import com.interview.model.*;

public class KeyValueDAO {
	private Map<String, Map<String, String>> keyValueLookup = new HashMap<>();

	static KeyValueDAO instance = null;

	public static KeyValueDAO getInstance() {
		if (instance == null) {
			instance = new KeyValueDAO();
		}
		return instance;
	}

	private KeyValueDAO() {

	}

	public Map<String, Map<String, String>> getKeyValueLookup() {
		return keyValueLookup;
	}

	public void setKeyValueLookup(Map<String, Map<String, String>> keyValueLookup) {
		this.keyValueLookup = keyValueLookup;
	}

}
