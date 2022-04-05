package com.interview.service;

import java.util.*;
import com.interview.model.*;
import com.interview.repository.*;

public class DataStoreService {

	static DataStoreService instance = null;
	static AttributeParser attributeParserInstance = null;
	TreeMap<String, List<String>> treeMapLookupForSecondaryIndex = new TreeMap<>();

	public static DataStoreService getInstance() {
		if (instance == null) {
			instance = new DataStoreService();
		}
		return instance;
	}

	private DataStoreService() {

	}

	public void addData(Map<String, Map<String, String>> dataLokup) throws ColumnIsNotValidException{
		Map<String, Map<String, String>> keyValueLookup = KeyValueDAO.getInstance().getKeyValueLookup();
		for (String k: dataLokup.keySet()) {
			if (k.equals("Key")) {//Need to define "key" as constant
				keyValueLookup.put("Key", dataLokup.get("Key"));
			} else if (k.equals("Attribute")) {
				keyValueLookup.put("Attribute", dataLokup.get("Attribute"));
			} else {//Value , check if data type is defined, if not then defined first time and validate next time for any insert, if conflict datatype then throw exception
				if (attributeParserInstance.isAllAttrbuteDefined(dataLokup.get(k))) {//if not define then define and if define then validate
					attributeParserInstance.parseAttribue(dataLokup.get(k));
					if () {//if secondary column
						maintainSecondaryColumn(k, dataLokup.get(k));
					}
				}
			}
		}

		
		
	}

	public void maintainSecondaryColumn(String key, Map<String, String> dataLokupCellValue) {
		List<String> keyList = null;
		// population_level-> High - {‘delhi’,’jakarta’}
		// Here key is High (that is value)
		// Value is list of key i.e. {‘delhi’,’jakarta’}
		for (String k : dataLokupCellValue.keySet()) {
			String value = dataLokupCellValue.get(k);
			if (!treeMapLookupForSecondaryIndex.containsKey(value)) {// if no list then make it new list
				keyList = new ArrayList<>();
			} else {
				keyList = treeMapLookupForSecondaryIndex.get(value);

			}
			keyList.add(key);
			treeMapLookupForSecondaryIndex.get(value).addAll(keyList);
		}

	}

	public List<String> serchFromSecondarIndex(String filter) {

		return treeMapLookupForSecondaryIndex.get(filter);

	}

}
