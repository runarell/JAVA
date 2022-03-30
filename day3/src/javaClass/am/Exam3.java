package javaClass.am;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
//		for (int i=0;i<5; i++) {
//			for(int j=0;j<5;j++) {
//				if(j==3) continue;
//				System.out.println(i+", "+j);
//			}
//		}
		
//		for(int i =10; i>0;i-=2) {
//			System.out.println(i);
//		}
//		
//		int i=10;
//		while(i > 0) {
//			System.out.println(i);
//			i-=2;
//		}
		
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<5; j++) {
//				
//			}
//		}
		//1
//		out:
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<5; j++) {
//				if(i==3 && j==2) break out;
//				System.out.println(i+" "+j);
//			}
//		}
		//2
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<5; j++) {
//				if(i==3 && j==2) {
//					i=100; 
//					break;
//				}
//				System.out.println(i+" "+j);
//			}
//		}
		// 메뉴 선택
//		1> 빅맥 2> 타코  3>백반
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1>빅맥 2>타코  3>백반 0종료\n");
			System.out.print("원하는 메뉴를 선택하세요>>");
			int no = sc.nextInt();
			if(no == 1) {
				System.out.println("백맥을 선택하셨습니다.");
				continue;
			}else if(no == 2) {
				System.out.println("타코를 선택하셨습니다.");
				continue;
			}else if(no == 3) {
				System.out.println("백반을 선택하셨습니다.");
				continue;
			}else if(no == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("잘못 입력하셨습니다.");
			
		}
		
		
		
		
	}
}
