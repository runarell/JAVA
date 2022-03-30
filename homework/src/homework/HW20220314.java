package homework;

import java.util.Scanner;

public class HW20220314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 4-22
		
//		for(int i=1;i<6; i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<6; i++) {
//			for(int j=1;j < 6-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//4-25
//		System.out.print("2이상의 정수 입력 : ");
//		int num1 = sc.nextInt();
//		String ms = "소수입니다.";
//		
//		for(int i=2; i<Math.sqrt(num1); i++) {
//			if(num1%i==0) ms = "소수가 아닙니다."; break;	
//		}
//		System.out.println(ms);
		
		//4-26
//		System.out.print("몇 개를 더할까요?");
//		int 	num2 = sc.nextInt();
//		int 	sum  = 0;
//		for(int i=0;i<num2;i++) {
//			System.out.print("정수 입력 : ");
//			sum += sc.nextInt();
//		}
//		System.out.println("합계는 "+sum+"입니다.");
//		System.out.println("평균은 "+String.format("%.2f", ((double)sum/num2))+"입니다.");
			
		//4-27
		System.out.print("몇 개를 더할까요?");
		int 	num3  = sc.nextInt();
		int 	sum2  = 0;
		int		cont1 = 0;
		for(int i=0;i<num3;i++) {
			System.out.print("정수 입력 : ");
			int no = sc.nextInt(); 
			if(sum2+no > 1000) {
				System.out.println("합계가 100을 넘었습니다.");
				System.out.println("마지막 값을 무시합니다.");
				break;
			}
			sum2+=no;
			cont1++;
		}
		System.out.println("합계는 "+sum2+"입니다.");
		System.out.println("평균은 "+String.format("%.2f", ((double)sum2/cont1))+"입니다.");
		
		//4-28
//		System.out.println("정수를 더합니다.");
//		System.out.print("몇 개를 더할까요?");
//		int 	num4 = sc.nextInt();
//		int 	sum3 = 0;
//		int		cont2 = 0;
//		for(int i=0;i<num4;i++) {
//			System.out.print("정수 입력 : ");
//			int no = sc.nextInt();
//			if(no < 0) {
//				System.out.println("음수는 더하지 않습니다.");
//				continue;
//			}
//			sum3 += no;
//			cont2++;
//		}
//		System.out.println("합계는 "+sum3+"입니다.");
//		System.out.println("평균은 "+String.format("%.2f", ((double)sum3/cont2))+"입니다.");


		
	}
}
