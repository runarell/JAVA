package homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW20220316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 6-8
		System.out.print("요소 수 :");
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for(int i=0; i<arr1.length; i++) {
			System.out.print("arr["+i+"] = ");
			arr1[i] = sc.nextInt();
		}
		System.out.print("찾을 숫자 :");
		int num2 = sc.nextInt();
		int result1 = -1;
		for(int i=0; i<arr1.length; i++) {
			if (arr1[i] == num2) {
				result1 = i;
				break;
			}
		}
		if(result1 < 0) {
			System.out.println("그 값은 없습니다.");
		}else {
			System.out.println("그 값은 a["+result1+"]에 있습니다.");			
		}
		
		// 6-11
		System.out.print("요소 수 :");
		int num3 = sc.nextInt();
		int[] arr2 = new int[num3];
		for(int i=0; i<arr2.length; i++) {
			System.out.print("arr["+i+"] = ");
			arr2[i] = sc.nextInt();
			if(i > 0 && arr2[i] == arr2[i-1] ) {
				System.out.println("중복된 값입니다.\n 다시 입력하세요.");
				i--;
			}
		}
		System.out.println( Arrays.toString(arr2) );
		
		// 6-12
		System.out.print("요소 수 :");
		int num4 = sc.nextInt();
		int[] arr3 = new int[num4];

		for(int i=0; i<arr3.length; i++) {
			System.out.print("arr3["+i+"] = ");
			int no = sc.nextInt();
			if( search(arr3, no) ) {
				System.out.println("중복된 값입니다.\n 다시 입력하세요.");
				i--;
			}else {
				arr3[i] = no;
			}
		}
		System.out.println(Arrays.toString(arr3));
		
		//6-13
		int[] arr4 = {22,57,11,32,91,68,70};
		System.out.println(Arrays.toString(arr4));
		int[] arr5 = shuffle(arr4);
		System.out.println(Arrays.toString(arr5));
		
		
		// 6-14
		int[] arr6 = {22,57,11,32,91,68,70};
		System.out.println(Arrays.toString(arr6));
		int[] arr7 = reverseArr(arr6);
		System.out.println(Arrays.toString(arr7));
	}
	
	//6-12
	public static boolean search( int[] arr, int no ) {
		for(int i=0;i<arr.length; i++) {
			if(arr[i] == no) {
				return true;
			}
		}
		return false;
	}
	
	//6-13
	public static int[] shuffle(int[] arr) {
		Random r = new Random();
		int cont = 20;
		
		for(int i=0;i<cont;i++) {
			int idx1 = r.nextInt(arr.length);
			int idx2;
			int shf = 0;
			do {
				idx2 = r.nextInt(arr.length);
			}while(idx1 == idx2);
			shf 	  = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = shf;		
		}	
		return arr;
	}
	
	//6-14
	public static int[] reverseArr(int[] arr) {
		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			result[i] = arr[arr.length-1-i];
		}
		return result;
	}
	
}
