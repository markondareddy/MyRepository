package com.general;

public class StringTest {

	public static void main(String[] args) {

		String s1="welcome";
		String s2="welcome";
		String s3=new String("welcome");
		String s4=new String("welcome");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1==s2)
			System.out.println(true);
		else
			System.out.println(false);
		
		if(s4==s3)
			System.out.println(true);
		else
			System.out.println(false);
		
		
		
		/*
		
		Emp e = new Emp("abc", 5);
		Emp e1 = new Emp("abc", 5);
		Emp e2 = new Emp("abc2", 7);
		if(e.equals(e1))
			System.out.println(true);
		else
			System.out.println(false);*/

	}

}

class Emp {
	private String name;
	private int age;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	Emp(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}

}