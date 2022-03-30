package homework;

import java.util.Scanner;

public class HW20220310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		// 3-15
		System.out.print("정수 입력1 : "); int num1 = sc.nextInt();
		System.out.print("정수 입력2 : "); int num2 = sc.nextInt();
		System.out.print("정수 입력3 : "); int num3 = sc.nextInt();
		int sub = num1;
		int[] arr = {num2, num3};
		for(int e : arr) {
			if (e < sub) {
				sub = e;
			}
		}
		System.out.println("최소값은 "+sub+"입니다.");
		
		//3-21
		System.out.print("몇 월입니까?: "); int month = sc.nextInt();
		int season = month/3;
		if( month < 0 || month > 12) {
			System.out.println("그런 월은 없습니다.");
		}else if( season == 1) {
			System.out.println("봄");
		}else if( season == 2) {
			System.out.println("여름");
		}else if( season == 3){
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		//4-2 
		while(true) {
			System.out.print("3자리 양의 정수(100~999)입력 : "); int num4 = sc.nextInt();
			if( num4 < 100 || num4 > 999) {
				System.out.println("3자리 양의 정수가 아닙니다 다시 입력하세요!");
				continue;
			}else {
				System.out.println("입력한 값은 "+num4+"입니다.");
				break;
			}
		}
		
		//4-14
		System.out.print("1부터 n까지의 합을 구합니다. n의 값 : "); int num5 = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num5; i++) {
			sum += i;
		}
		System.out.println("1부터 "+num5+"까지의 합은 "+sum+"입니다.");
		
		// 4-21
		System.out.print("정방형을 표시합니다.\n단수는 : "); int num6 = sc.nextInt();
		for(int i=1; i<=num6; i++) {
			for(int j=1; j<=num6; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
