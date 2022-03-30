package homework7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW20220317 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// 6-15
		int ck = 1;		// 탈출키값
		// 답안지
		String[] arr1 = {"January", "February", "March", "April","MAy", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자 입력");
		do {
			String str ="";  // 정답처리 문자열		
			int mon = r.nextInt(12)+1; // 이번에 맞출 값
			
			System.out.print(mon+"월 : ");
			String aswer = sc.nextLine();sc.nextLine(); // 스케너 개행문자 오류 정정
			if( aswer.equals(arr1[mon-1]) ) {
				str = "정답입니다.";
			}else {
				str = "틀렸습니다.";				
			}
			do{
				System.out.print(str+" 다시한번? 1...YES/0...NO : ");
				ck = sc.nextInt();
				System.out.println("");				
			}while(ck!=1 && ck!=0);		
		}while(ck == 1);
		System.out.print("종료");	
		
		//6-16
		// 답안지
		String[] arr2 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		String[] arr3 = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		int ck2 = 1;		// 탈출키값
		do {
			String str ="";  // 정답처리 문자열		
			int idx = r.nextInt(arr2.length)+1; // 이번에 맞출 값
			System.out.println("정답 : "+ arr2[idx] );
						
			System.out.print(arr3[idx]+" : ");
			String aswer = sc.next(); //sc.nextLine(); // 스케너 개행문자 오류 정정
			
			if( aswer.equals(arr2[idx]) ) {
				str = "정답입니다.";
			}else {
				str = "틀렸습니다.";				
			}
			do{
				System.out.print(str+" 다시한번? 1...YES/0...NO : ");
				ck2 = sc.nextInt();			
			}while(ck2!=1 && ck2!=0);		
		}while(ck2 == 1);
		System.out.print("종료");	
		
		// 6-18
		int no1 = 4;
		int no2 = 3;
		int[][] arr4 = ArrMake(no1, no2);
		int[][] arr5 = ArrMake(no2, no1);
		int[][] answer = new int[arr4.length][arr5[0].length];
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i].length; j++) {
				for(int k=0; k<arr4[i].length; k++) {				
					answer[i][j] += arr4[i][k]*arr5[k][j];
				}
			}
		}
		for(int[] arr:answer) {
			System.out.println(Arrays.toString(arr));
		}
		
		// 7-1		
		System.out.print("정수 x : ");
		int num1 = sc.nextInt(); 
		System.out.println("singOf(x)는 "+singOf(num1)+"입니다.");
		
		// 7-2
		System.out.print("정수a : ");
		int a = sc.nextInt();
		System.out.print("정수b : ");
		int b = sc.nextInt();
		System.out.print("정수c : ");
		int c = sc.nextInt();
		
		min(a,b,c);
		
		
	}
	
	// 6-18 
	public static int[][] ArrMake(int a, int b){
		Scanner sc = new Scanner(System.in);		
		int[][] arr = new int[a][b];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {			
				System.out.print("arr4["+i+"]["+j+"] : ");
				arr[i][j] = sc.nextInt();	
			}
		}	
		return arr;
	}
	public static int singOf(int no){
		int result;
		
		if(no >0) {
			result = 1;
		}else if(no <0) {
			result = -1;
		}else {
			result = 0;
		}
		
		return result;
	}
	
	public static void min(int a, int b, int c){
		int no;
		
		if(a<b && a<c) {
			no = a;						
		}else if(b<c) {
			no = b;			
		}else {
			no = c;
		}
		
		System.out.println("최소값은 "+no+"입니다.");
	}

}
