package com.general;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("pathi", 1);
		map.put("ram", 10);
		map.put(null, 3);
		map.put("pathi", 1);
		map.put("yui", null);
		System.out.println(map);
		map.put("ddfgf", null);

		for (Map.Entry m : map.entrySet()) {

			System.out.println("Key:" + m.getKey() + "    Value: " + m.getValue());

		}
	}

}
