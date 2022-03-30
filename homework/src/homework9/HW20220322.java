package homework9;

import java.util.Random;
import java.util.Scanner;

public class HW20220322 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 7-9
//		readPlusInt();
		
		// 7-10
//		mathQuez();
		
		// 7-15
//		int[] arr1 = arrMack();
//		sumof(arr1);
		
		// 7- 16
//		int[] arr2 = arrMack();
//		int num1 = minOf(arr2);
//		System.out.println("가장 작은 값 : "+num1);
		
		// 7-17
		int[] arr3 = arrMack();
		System.out.print("찾는 값 : ");
		int num2 = sc.nextInt();
		int idx1 = linearSearch(arr3, num2);
		int idx2 = linearSearchR(arr3, num2);
		
		if(idx1 == idx2) {
			System.out.println("찾는 값은 x["+idx1+"]에 있습니다.");			
		}else {
			System.out.println("해당 값의 요소가 여러 개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 x["+idx1+"]에 있습니다.");			
			System.out.println("가장 뒤에 위치한 값은 x["+idx2+"]에 있습니다.");			
		}
		
	}
	// 7-9
	static void readPlusInt() {
		Scanner sc = new Scanner(System.in);
		boolean k = true;
		do {
			int no;
			String str ="";
			
			do {
				System.out.print("양의 정수값 : ");
				no = sc.nextInt();
			}while(no <= 0);
			int stp = (int)( Math.log10(no)+1 );

			for(int i=0;i<stp;i++) {
				int num = (int)( no/( Math.pow(10, i)));
				str += ( num%10 );
			}
		
			System.out.println("반대로 읽으면 "+str+"입니다.");
			
			System.out.print("다시 한 번?<Yes...1/NO...0> : ");
			int num2 = sc.nextInt();
			if(num2 == 0) {
				k = false;
			}
		}while(k);
	}
	
	// 7-10
	static void mathQuez() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		boolean k = true;
		do {
			int reg = 3;
			
			int answer = r.nextInt(900)+100;
			String formula = answer+"";
			
			for(int i=1; i <reg; i++) {
				int no = r.nextInt(900)+100;
				if(r.nextBoolean()) {
					answer += no;
					formula += "+"+no; 
				}else {
					answer -= no;
					formula += "-"+no;
				}	
			}
			System.out.print( formula+" = ");
			int ans = sc.nextInt();
			if(ans == answer) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");			
			}			
			System.out.print("다시 한 번?<Yes...1/NO...0> : ");
			int num2 = sc.nextInt();
			if(num2 == 0) {
				k = false;
			}	
		}while(k);
	}
	
	// 7-15
	static int[] arrMack() {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int[] result = new int[n];
		
		for(int i=0;i<result.length; i++) {
			System.out.print("arr["+i+"]:");
			result[i] = sc.nextInt();
		}
		return result;
	}
	
	static void sumof(int[] arr) {
		int sum = 0;
		for(int n : arr) {
			sum+=n;
		}
		System.out.println("모든 요소의 합은 "+sum+"입니다.");
	}
	
	// 7-16
	static int minOf(int[] arr) {
		int min = arr[0];
		for(int i=1;i<arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		return min;
	}
	// 7-17
	private static int linearSearch(int[] arr, int no) {
		for(int i=0;i <arr.length;i++) {
			if(arr[i] == no) {
				return i;						
			}
		}
		return 0;
	}
	private static int linearSearchR(int[] arr, int no) {
		for(int i=arr.length-1; i >= 0;i--) {
			if(arr[i] == no) {
				return i;			
			}
		}
		return 0;
	}

}

