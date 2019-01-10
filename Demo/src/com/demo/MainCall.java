package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainCall {

	public static void main(String[] args) {

		Person p1= new Person("Pawan",25);
		Person p2= new Person("Teja",29);
		Person p3= new Person("Ranjan",20);
		Person p4= new Person("Hari",55);
		Person p5= new Person("Pankaj",45);
		
		/*List<Person> person= new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
		person.sort(Comparator.comparing(Person ::getAge).reversed());
		person.forEach(people -> System.out.println(people));*/
		City london=new City("London");
		City paris=new City("Paris");
		City newyork=new City("New York");
		
		Map<City,List<Person>> map=new HashMap<>();
		/*List<Person> list=new ArrayList<>();
		list.add(p1);
		list.add(p2);
		map.put(c1, list);
		map.get(c1);*/
		map.putIfAbsent(paris, new ArrayList<>());
		map.get(paris).add(p1);
		map.computeIfAbsent(london, city->new ArrayList<>()).add(p2);
		System.out.println("People from  :"+map.getOrDefault(paris, Collections.EMPTY_LIST));
		System.out.println("People from  :"+map.getOrDefault(london, Collections.EMPTY_LIST));
		System.out.println("1111111111111111111111111111111");
		
	}

}
