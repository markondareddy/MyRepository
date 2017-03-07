package com.test;

import java.util.Hashtable;
import java.util.Map;		

public class IndexOfExample {
	public static void main(String args[]) {
		String s1 = "C:/Program Files/Java/jre1.8.0_111/bin";
		int from = s1.indexOf("jre");
		System.out.println(from);
		int till = s1.indexOf("bin");
		System.out.println(till);
		System.out.println(s1.substring(from, till - 1));

		/*
		 * C:\Program Files\Java\jre1.8.0_111\bin\java
		 * 
		 * <script language="javascript"> <![CDATA[ version =
		 * project.getProperty("jvm.junit.version"); from =
		 * version.indexOf("jre"); till = version.indexOf("bin"); version =
		 * version.substring(from, till-1);
		 * project.setProperty("jvm.junit.version",version); ]]> </script>
		 */

		Hashtable<String,Integer> map=new Hashtable<String,Integer>();
		map.put("markonda1", 101);
		map.put("markonda2", 102);
		map.put("markonda3", 103);
		map.put("markonda4", 104);
		map.put("markonda5", 105);
		map.put("markonda6", 106);
		map.put(null, 101);
		map.put(null, 108);
		System.out.println(map);
		
		for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		

	}
}