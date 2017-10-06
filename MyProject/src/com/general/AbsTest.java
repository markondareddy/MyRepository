package com.general;

import java.util.ArrayList;
import java.util.List;

public class AbsTest {

	public String getListAsCsvString(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for (String str : list) {
			if (sb.length() != 0) {
				sb.append(",");
			}
			sb.append(str);
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		List<String> li1 = new ArrayList<String>() {
			{
				this.add("animal");
				this.add("nuts");
				this.add("java");
			}
		};

		AbsTest mtc = new AbsTest();
		System.out.println(mtc.getListAsCsvString(li1));
		List<String> li2 = new ArrayList<String>() {
			{
				this.add("java");
				this.add("unix");
				this.add("c++");
			}
		};
		System.out.println(mtc.getListAsCsvString(li2));

	}
}
