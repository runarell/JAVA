package javaClass1;

import java.util.HashSet;

public class Exam8 {
	// Set 컬랙션
	/*
동일한 타입 묶음 이라는 특징은 그대로 갖고 있지만 
인덱스 정보를 포함하지 않음 즉 집합의 개념과 같은 컬렛션이다.
인덱스가 없으므로 데이터를 중복해서 저장하면 중복되는 데이터 중 특정 데이터를 꺼낼 방법이 없다. 
즉 set은 동일한 데이터의 중복을 허용하지 않는다.
	 */
	

	public static void main(String[] args) {
		//HashSet
		HashSet hSet1 = new HashSet();
		
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("다");
		System.out.println(hSet1);
		
		HashSet hSet2 = new HashSet();
		
		hSet2.add("나");
		hSet2.add("다");
		System.out.println(hSet2);
		
		hSet2.addAll(hSet1);
		System.out.println(hSet2);
		
		hSet2.remove("나");
		System.out.println(hSet2);
		
		hSet2.clear();
		System.out.println(hSet2);
		
		// 헤시 코드의 개념 - 개체의 해시코드는 객체가 저장된 주소와 관련된 값으로 실제 번지 값이 아님
		//				객체가 저장된 번지를 기준으로 생성된 정수형 고유값이 바로 해시코드 이다.
		
		A a = new A(3);
		A b = new A(3);
		System.out.println(a == b);		 // 두 객체의 해시코드가 동일한지 비교
		System.out.println(a.equals(b)); // 두 객체를 비교
		
		String c = "하이";
		String d = new String("하이");
		System.out.println(c == d);		 // 두 객체의 해시코드가 동일한지 비교
		System.out.println(c.equals(d)); // 두 객체를 비교
	}
}

class A{ 
	int data;
	public A(int data) {
		this.data = data;
	}
}