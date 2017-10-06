package com.general;

import java.util.HashMap;
import java.util.Map;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class MapExample {

	Map<Character, Integer> count(String name) {

		char[] ch = name.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : ch) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}
		}

		return map;
	}

	public static void main(String[] args) {

		MapExample m = new MapExample();

		Map<Character, Integer> mapp = m.count("madam");

		System.out.println(mapp);

	}

}