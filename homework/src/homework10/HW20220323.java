package homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HW20220323 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 7-18
//		int[] arr1 = arrMack();
//		int[] arr1 = {1,3,4,7,9,11};
//		System.out.print("삭제할 요소의 인덱스 : ");
//		int num1 = sc.nextInt();
//		arr1 = arrRmv(arr1, num1);
//		System.out.println(Arrays.toString(arr1));
		
		// 7-19
//		int[] arr2 = {1,3,4,7,9,11};
//		int num2 = 1;
//		int num3 = 3;
//		arr2 = arrRmvN(arr2, num2, num3);
//		System.out.println(Arrays.toString(arr2));
		
		// 7-20
//		int[] arr3 = {1,3,4,7,9,11};
//		int num4 = 2;
//		int num5 = 99;
//		arr3 = aryIns(arr3, num4, num5);
//		System.out.println(Arrays.toString(arr3));
		
		//7-21
//		int[] arr4 = {1,2,3,4,5,6,7};
//		int[] arr5 = {5,4,3,2,1};
//		ArrayList<int[]> arr6 = aryExchng(arr4, arr5);
//		arr4 = arr6.get(0);
//		arr5 = arr6.get(1);
//		System.out.println(Arrays.toString(arr4));
//		System.out.println(Arrays.toString(arr5));
		
		// 7-22
		int[] arr6 = {11,22,33,44,55};
		int[] arr7 = arrayClone(arr6);		
		arr6[1] = 99; 
		System.out.println(Arrays.toString(arr6));
		System.out.println(Arrays.toString(arr7));
		
	}
	//=====
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
	// 7-18
	static int[] arrRmv(int[] arr, int n) {
		int[] result = new int[arr.length];
		int j = 0;
		for(int i=0;i<result.length;i++) {
			if(j == n) j++;
			if(j == result.length) j--;
			result[i] = arr[j];
			j++;				
		}
		return result;
	}
	
	// 7-19
	static int[] arrRmvN(int[] arr, int n1, int n2) {
		int[] result = new int[arr.length];
		int j = 0;
		for(int i=0;i<result.length;i++) {
			if(j == n1) j+=n2;
			if(i == n1+n2-1)j=i;
			result[i] = arr[j];
			j++;
		}		
		return result;
	}
	
	//7-20
	static int[] aryIns(int[] arr, int n1, int n2) {
		int[] result = new int[arr.length+1];
		int j = 0;
		for(int i=0;i<result.length;i++) {
			if(i == n1) {
				result[i] = n2;				
			}else {
				result[i] = arr[j];
				j++;
			}
		}		
		return result;
	}
	
	// 7-21
	static ArrayList<int[]> aryExchng(int[] arr1, int[] arr2) {
		ArrayList<int[]> result = new ArrayList<>();
		int arrlen = arr1.length<arr2.length?arr1.length:arr2.length;
		int vd = 0;
		for (int i=0; i<arrlen; i++) {
			vd 		= arr1[i];
			arr1[i] = arr2[i];  
			arr2[i] = vd;  
		}
		result.add(arr1);
		result.add(arr2);
		return result;
	}
	
	// 7-22
	static int[] arrayClone(int[] arr) {
		int[] result = new int[arr.length];
		for(int i=0;i<result.length;i++) {
			result[i] = arr[i];
		}
		return result;
	}

}
