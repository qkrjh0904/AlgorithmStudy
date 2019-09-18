package com.ssafy.emp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmpMgrImpl implements EmpMgr {
	static private EmpMgrImpl empMgrImp = null;
	ArrayList<Employee> list = null;

	private EmpMgrImpl() {
		list = new ArrayList<>();
	}

	public static EmpMgrImpl getInstance() {
		if (empMgrImp == null) {
			empMgrImp = new EmpMgrImpl();
		}
		return empMgrImp;
	}

	@Override
	public void insert(Employee emp) {
		list.add(emp);
	}

	@Override
	public void search() {
		for (Employee emp : list)
			System.out.println(emp);

	}

	@Override
	public void save() {
		ObjectOutputStream oos = null; // 객체 직렬화
		try {
			oos = new ObjectOutputStream(new FileOutputStream("emp.dat"));
		} catch (IOException e) {
			System.out.println(e);
		}
		if (oos != null) {
			for (Employee emp : list) {
				try {
					oos.writeObject(emp);
				} catch (IOException e) {
					System.out.println(e);
				}
			}
			try {
				oos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

	@Override
	public void load() {
		// 기존 리스트의 모든 정보를 날리고 파일에서 불러와서 리스트에 추가하기
		if (list != null) {
			list.clear();
		} else {
			list = new ArrayList<>();
		}

		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("emp.dat"));
			Employee emp = null;
			try {
				while(true) {
					emp = (Employee)ois.readObject();
					if(emp==null)
						break;
					list.add(emp);
				}				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					System.out.println(e);
				}
			}
		}
	}

}
