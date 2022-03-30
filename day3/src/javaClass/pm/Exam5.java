package javaClass.pm;

import java.util.Random;
import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		//가위가위보
		
//		Scanner sc = new Scanner(System.in);
////		사용자 입력
//		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력 >");
//		int n = sc.nextInt();
////		컴 입력
//		Random rand = new Random();
//		int cn = (int)(Math.random()*3 +1);
////		결과
//		System.out.println("당신은 "+n );
//		System.out.println("컴퓨터는 "+cn );
		
//		System.out.println( 3%cn+1 );
//		if(cn == n) { // 비김
//			System.out.println("비겼습니다.");
//		}else if((3%cn+1 == n) { // 나의 승리
//			System.out.println("당신이 이겼습니다.");
//		}else { //컴 승리
//			System.out.println("당신이 졌습니다.");
//		}
//		가위 바위 1 /바위 보 1/ 보 가위 2
		
//		Scanner sc = new Scanner(System.in);
////		사용자 입력
//		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력 >");
//		int n = sc.nextInt();
////		컴 입력
//		Random rand = new Random();
//		int cn = (int)(Math.random()*3 +1);
////		결과
//		System.out.println("당신은 "+n );
//		System.out.println("컴퓨터는 "+cn );
//		System.out.println("당신은 "+n );
//		System.out.println("컴퓨터는 "+cn );
//		int no = 3%cn+1;	
//		switch(no) {
//		case 0:
//			System.out.println("비김");
//			break;
//		case 1:
//			System.out.println("이김");
//			break;
//		default:
//			System.out.println("Game Over");		
//		}
		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("a 입력1");
//		int a = sc.nextInt();
//		System.out.print("b 입력2");
//		int b = sc.nextInt();
		
//		if(a == b) {
//			System.out.println("같다");
//		}else if(a >b) {
//			System.out.println("a가 크다");
//		}else {
//			System.out.println("b가 크다");
//		}
//		String str = (a==b)? "같다": (a>b)? "a가 크다.":"b가 크다.";
//		System.out.print( str );
		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("a 입력1"); int a = sc.nextInt();
//		System.out.print("b 입력2"); int b = sc.nextInt();
//		System.out.print("c 입력3"); int c = sc.nextInt();

//		String str = "";
//		if(a<b && a<c) {
//			str = a+" a";
//		}else if(b < c) {
//			str = b+" b";
//		}else {
//			str = c+" c";
//		}
//		System.out.println(str + "가 작다");
		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("a 입력1"); int a = sc.nextInt();
//		System.out.print("b 입력2"); int b = sc.nextInt();
//		System.out.print("c 입력3"); int c = sc.nextInt();
//		String str = "";
//		str = (a<b && a<c)? a+"a": (b < c)? b+" b": c+" c";
//		System.out.println(str + "가 작다");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("a 입력1"); int a = sc.nextInt();
//		System.out.print("b 입력2"); int b = sc.nextInt();
//		System.out.print("c 입력3"); int c = sc.nextInt();
//		
//		int t;
//		if(a<b) { t=a; a=b; b=t; }
//		if(b<c)	{ t=b; b=c; c=t; }
//		if(a<b) { t=a; a=b; b=t; }
//		System.out.print(""+a + b + c);
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		do{
//			System.out.print("세자리의 정수 입력>>"); 
//			num = sc.nextInt();
//		}while(num < 100 || num > 1000);
//		System.out.print("입력값은 "+num);
		
		Scanner sc = new Scanner(System.in);
		//난수발생
		Random rend = new Random();
		int quNum = 10 + rend.nextInt(90);
		System.out.print(quNum); 
		int num;
		do{
			System.out.print("정수 입력>>"); 
			num = sc.nextInt();
			if(num < quNum) {
				System.out.println("더 큰 숫자 입니다."); 
			}else if(num > quNum) {
				System.out.println("더 작은 숫자 입니다.");
			}
		}while(num != quNum);
		System.out.print(quNum+"정답입니다.");
		
	}
}
