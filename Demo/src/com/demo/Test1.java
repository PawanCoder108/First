package com.demo;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {

		Map<String,String> map=new HashMap<>();
		map.put("10", "Pawan");
		map.put("11", "Hari");
		map.put("12", "Raju");
		map.put("13", "Pankaj");
		map.forEach((k,v)->System.out.println(k+":"+v));};
		
		
	}

