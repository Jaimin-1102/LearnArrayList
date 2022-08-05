package com.jaimin.collections;
import java.util.Scanner;
import java.util.*;

public class LearnArrayList {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		String[] name = new String[3];
//		
//		for(int i=0;i<name.length;i++) {
//			name[i] = sc.next();
//		}
//		
//		for(String Stu_name: name) {
//			System.out.println("Student_name: " + Stu_name);
//		}
		
//		ArrayList<String> Student_name= new ArrayList<> ();
//		Student_name.add("Jaimin Rana");
//		Student_name.add("Faizan Sopariwala");
//		
//		System.out.println(Student_name);
		
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		list.add(3);
		System.out.println(list);
		
		List<Integer> newList = new ArrayList();
		newList.add(190);
		newList.add(200);
		
		list.addAll(newList);
		list.add(2,23);
		
		System.out.println(list);
		System.out.println(list.get(4));
		
		list.remove(Integer.valueOf(200));
		System.out.println(list);
		
		list.set(2, 1000);
		System.out.println(list.contains(2));
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println("The element: " + list.get(i));
		}
		
		System.out.println();
		
		for(Integer element: list) {
			System.out.println("Foreach Element: " + element);
		}
		
		System.out.println();
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator: " + it.next());
		}
	}
}
