package homework8;

import java.util.Random;
import java.util.Scanner;

public class HW20220321 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// 7-3
		System.out.print("정수 a : ");
		int a = sc.nextInt();
		System.out.print("정수 b : ");
		int b = sc.nextInt();
		System.out.print("정수 c : ");
		int c = sc.nextInt();
		med(a,b,c);
		
		// 7-4
		System.out.println("1부터 x까지의 합을 구하자.");
		System.out.print("x의 값 : ");
		int num1 = sc.nextInt();
		sumUp(num1);

		// 7-6
		System.out.print("몇 월입니까?(1~12) : ");
		int num2 = sc.nextInt();
		printSeason(num2);
		
		// 7-7
		System.out.println("왼쪽 아래가 직각인 이등변 삼삭형을 표시 합니다.");
		System.out.print("단수는 : ");
		int num3 = sc.nextInt();
		putStart(num3);
		
		// 7-8
		
		System.out.println("난수 생성합니다.");
		System.out.print("하한값 : ");
		int num4 = sc.nextInt();
		System.out.print("상한값 : ");
		int num5 = sc.nextInt();
		int res = random(num4, num5);
		System.out.println("생성한 난수는 "+res+"입니다.");
	}  // main End
	
	// 7-3
	public static void med(int a, int b, int c) {
		int no1 = 0;
		int no2 = 0;
		if(a > b && a > c) {   //a가 최대값
			no1 = b;
			no2 = c;
		}else if(b > c) {  // b가 최대
			no1 = a;
			no2 = c;
		}else {  // c가 최대
			no1 = a;
			no2 = b;
		}
		
		if(no1 > no2) {
			System.out.println("중간값은 "+no1+"입니다.");
		}else {
			System.out.println("중간값은 "+no2+"입니다.");
		}
	}  // med End
	
	// 7-4
	public static void sumUp(int n) {
		int sum = 0;
		for(int i=1; i <= n; i++) {
			sum +=i;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}  // sumUp End
	
	// 7-6
	public static void printSeason(int n) {
		int no = n/3;
		if(n < 1 || n > 12) {
			return;
		}else if(no == 1) {
			System.out.println("해당 "+n+"월의 계절은 봄입니다.");
		}else if(no == 2) {
			System.out.println("해당 "+n+"월의 계절은 여름입니다.");
		}else if(no == 3) {
			System.out.println("해당 "+n+"월의 계절은 가을입니다.");			
		}else{
			System.out.println("해당 "+n+"월의 계절은 겨울입니다.");						
		}
	}  // printSeason End
	
	// 7-7
	private static void putStart(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}  // putStart End
	
	// 7-8
	private static int random(int n1, int n2) {
		Random r = new Random();
		int result = n1;
		if(n2 <= n1) {
			return result;
		}
		result = r.nextInt(n2-n1+1)+n1;		
		return result;
	}
	
}
