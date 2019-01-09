package com.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<String,Student> map=new HashMap<>();
		Student s1=new Student(101);
		//s1.setSid(101);
		s1.setName("Pawan");
		
		Student s2=new Student(102);
		//s2.setSid(102);
		s2.setName("Chandan");
		map.put(s1.getName(), s1);
		map.put(s2.getName(), s2);
		System.out.println();
		
	}

}

class Student{
	int sid;
	String name;
	
	
	
	public Student(int sid) {
		super();
		this.sid = sid;
	}
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}