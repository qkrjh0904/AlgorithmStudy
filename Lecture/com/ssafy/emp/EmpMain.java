package com.ssafy.emp;

import java.util.Scanner;

public class EmpMain {
	Scanner s = new Scanner(System.in);
	EmpMgr mgr = EmpMgrImpl.getInstance();

	public static void main(String[] args) {
		EmpMain m = new EmpMain();
		int num = 0;
		while (true) {
			num = m.menu();
			if (num == 0)
				break;
			switch (num) {
			case 1:
				m.insert();
				break;
			case 2:
				m.search();
				break;
			case 3:
				m.searchNum();
				break;
			case 4:
				m.searchName();
				break;
			case 7:
				m.save();
				break;
			case 8:
				m.load();
				break;
			}
		}
	}

	public int menu() {
		int result = 0;
		System.out.println("==================================");
		System.out.println("========== 직원 관리 프로그램 ===========");
		System.out.println("==================================");
		System.out.println("1. 직원 등록");
		System.out.println("2. 직원 목록 보기");
		System.out.println("3. 직원 검색(사번으로 검색)");
		System.out.println("4. 직원 검색(이름으로 검색)");
		// ...
		System.out.println("7. 직원 정보 파일 저장");
		System.out.println("8. 직원 정보 파일로 부터 읽어오기");
		System.out.println("0. 종료");
		System.out.println("원하는 번호를 선택 하세요.");
		result = s.nextInt();
		return result;
	}

	public void insert() {
		System.out.println("직원 정보를 입력하세요. 형식:사번 이름 나이 부서");
		String sabun = s.next();
		String name = s.next();
		int age = s.nextInt();
		String dept = s.next();
		Employee emp = new Employee(sabun, name, age, dept);
		mgr.insert(emp);
	}
	
	public void save() {
		mgr.save();
		System.out.println("저장완료");
	}
	
	public void load() {
		mgr.load();
		System.out.println("읽기완료");
	}

	public void search() {
		System.out.println(">>>>>>>>  직원 목록 보기 ");
		mgr.search();
	}

	public void searchNum() {
		System.out.println(">>>>>>>>  직원  검색 (사번으로 검색) ");
		System.out.println("검색하고자하는 사번을 입력하세요.");
		// 구현하세요
	}

	public void searchName() {
		System.out.println(">>>>>>>>  직원  검색 (이름으로 검색) ");
		System.out.println("검색하고자하는 이름을 입력하세요.");
		// 구현하세요.
	}
}