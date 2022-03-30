package javaClass.pm;

import am.A;

public class Exam5 {

	public static void main(String[] args) {
		// package & import
/*
패키지는 비슷한 목적으로 생성된 클래스 파일들을 모아둔 폴더를 의미
1개의 프로젝트에 1개 또는 여러개의 패키지를 생성할 수 있다.
패키지를 아예 생성하지 않아도 문제는 없다. 하지만 사용을 권장
패키지를 생성하면 클래스를 만들때 첫번째 줄에 반듯시 'package 패키지명;'이
명시되어야 한다.

피키지 사용의 장점
클래스가 저장되는 공간 분리로 클래스명의 충돌을 방지할 수있다.

 // 임포트
임포트는 다른 패키지의 클래스를 사용하기 위한 목적인 문법이다.
코드상 패키지 선언 다음 줄에 위치한다. 
일반적으로 자바가 동작할때 자신이 속한 패키지 내부에 위치한 클래스만 사용 가능.
다른 패키지지에 있는 클래스를 사용하는 방법은 2가지
1.  클래스의 풀네임을 사용하는 방법 
- '패키지명.클래스명' 
- 같은 클래스 내의 타클래스 사용법 A a = new A()
- 다른 패키지 내의 타클래스 사용법 am.A a = new am.A();
	// 다른 패키지의 클래스를 사용하려면 그 클래스는 
	     접근 제어자가 public이 선언 되어야함     
2. 임포트 사용
실제로 프로그램을 작성하다 보면 자신이 작성한 클래스 보다 다른 클래스들을 
훨신 더 많이 가져다가 사용하게 된다. 
그때마다 페키지명을 풀네임으로 사용하는 것은 비효율적!
그래서 import를 사용하는것

// 여러개 클래스 임포트 
import am.*
임포트는 마치 자신의 내부에 있는 것 처럼 사용하는 것
사실 import 되는 대상은 .java 가 아니고 컴파일이 완료된 .class
*/
//		javaClass.am.A a = new javaClass.am.A();
//		
//		System.out.println(a.m);
//		System.out.println(a.n);
//		a.print();
//		
//		A c = new A();
//		System.out.println(c.m);
//		System.out.println(c.n);
//		a.print();
	}
}
