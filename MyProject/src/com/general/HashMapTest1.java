package com.general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest1 {

	public static void main(String[] args) {

		Map<Key, String> cityMap = new HashMap<Key, String>();
		cityMap.put(new Key(1, "NY"), "New York City");
		cityMap.put(new Key(2, "ND"), "New Delhi");
		cityMap.put(new Key(3, "NW"), "Newark");
		cityMap.put(new Key(4, "NP"), "Newport");

		System.out.println("Size of the cityMap Object is :" + cityMap.size());

		Iterator<Entry<Key, String>> it = cityMap.entrySet().iterator();
		while (it.hasNext()) {

			Key k = (Key) it.next().getKey();
			System.out.println(k.getIndex() + " " + k.getName());

			// System.out.println(it.next().getKey().index + " "
			// + it.next().getKey().Name);
		}
		System.out.println("size of :" + cityMap.size());

	}

}

class Key {
	int index;
	String Name;

	Key(int index, String Name) {
		this.index = index;
		this.Name = Name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
