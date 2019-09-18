package com.ssafy.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();

		if (list.add(new Student("사", 27, 30)))
			System.out.println("등록됨");
		list.add(new Student("나", 27, 100));
		list.add(new Student("다", 26, 90));
		list.add(new Student("바", 25, 80));
		list.add(new Student("가", 24, 70));
		list.add(new Student("마", 23, 60));
		list.add(new Student("라", 22, 50));

		Collections.sort(list);		//기본이 이름순
		
		/*Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				String name1 = o1.getName();
				String name2 = o2.getName();
				int type = name1.compareTo(name2);
				return type;
			}

		});*/
		

		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}
	}

}
