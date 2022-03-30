package homework;

import java.util.Random;
import java.util.Scanner;

public class HW20220308 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 2-11
		System.out.println("한 자리 양의 정수 : " + (r.nextInt(8)+1) );
		System.out.println("한 자리 음의 정수 : " + -(r.nextInt(8)+1) );
		System.out.println("두 자리 양의 정수 : "+ (r.nextInt(89)+10) );
		
		//2-14
		System.out.print("성 : ");
		String fName = sc.nextLine();
		System.out.print("이름 : ");
		String sName = sc.nextLine();
		
		System.out.println("안녕하세요. "+ fName + sName +"씨.");
		
		// 3-3
		System.out.print("변수 A : ");
		int A = sc.nextInt();
		System.out.print("변수 B : ");
		int B = sc.nextInt();
		if( A%B == 0) {
			System.out.println("B는 A의 약수이다.");
		}else {
			System.out.println("B는 A의 약수가 아니다.");
		}
		
		// 3-5
		System.out.print("정수 값 : ");
		int num1 = sc.nextInt();
		String str1 = "0";
		if(num1 > 0) {
			str1 = "양수";
		}else if(num1 < 0) {
			str1 = "음수";
		}
		System.out.println(num1 + " 값이 "+ str1 +"입니다.");
		
		// 3-7
		System.out.print("변수 a : "); int a = sc.nextInt();
		System.out.print("변수 b : "); int b = sc.nextInt();
		String str2 = "";
		if(a == b) {
			str2 = "a와 b가 같다";
		}else if(a > b) {
			str2 = "a가 크다";
		}else {
			str2 = "b가 크다";
		}
		System.out.println(str2);
		
	}

}
