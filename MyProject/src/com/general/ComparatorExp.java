package com.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1(101, "Vijay", 23));
		al.add(new Student1(106, "Ajay", 27));
		al.add(new Student1(105, "Jai", 21));

		System.out.println("Sorting by Name...");

		Collections.sort(al, new NameComparator());
		Iterator<Student1> itr = al.iterator();
		while (itr.hasNext()) {
			Student1 st = (Student1) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator());
		Iterator<Student1> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student1 st = (Student1) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}

class Student1 {
	int rollno;
	String name;
	int age;

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}

class AgeComparator implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Student1 s1 = (Student1) o1;
		Student1 s2 = (Student1) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Student1 s1 = (Student1) o1;
		Student1 s2 = (Student1) o2;

		return s1.name.compareTo(s2.name);
	}
}