package com.ssafy.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionTest {
	
	public CollectionTest() {
		Integer[] data = { 3, 4, 5, 7, 2, 9, 4 };
		
		Arrays.sort(data, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(data));

		
	}

	public static void main(String[] args) {
		new CollectionTest();

		
		// Boxing
		int a = 10; // 기본형
		Integer a1 = new Integer(a); // 기본형에 해당하는 객체를 레퍼클래스
		Integer a2 = a; // auto Boxing(자바 5.0부터 적용)
		// unBoxing
		int b = a1.intValue();
		int b1 = a1; // auto unBoxing(자바 5.0부터 적용)
	}

}
