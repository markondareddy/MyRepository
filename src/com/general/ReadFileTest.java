package com.general;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadFileTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		InputStream is = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;

		is = new FileInputStream("");
		bis = new BufferedInputStream(is);
		String temp = null;
		while ((temp = dis.readLine()) != null) {
			System.out.println(temp);
		}

	}

}
