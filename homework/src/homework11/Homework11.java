package homework11;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework11 {

	public static void main(String[] args) {
		// 7-23
		int[] arr1 = {1,5,4,8,5,5,7};
		int num1 = 5;
		int[] arr2 = arraySrchIdx(arr1, num1);
		System.out.println(Arrays.toString(arr2));
		
		// 7-24
		int[] arr3 = {1,3,4,7,9,11};
		int num2 = 2;		
		arr3 = arrayRmvof(arr3, num2);
		System.out.println(Arrays.toString(arr3));
		
		//7-25
		int[] arr4 = {1,3,4,7,9,11};
		int idx1 = 1;		
		int num3 = 3;		
		arr4 = arrayRmvOfN(arr4, idx1, num3);
		System.out.println(Arrays.toString(arr4));
		
		//7-26
		int[] arr5 = {1,3,4,7,9,11};
		int idx2 = 1;		
		int num4 = 99;	
		arr5 = arrayInsOf(arr5, idx2, num4);
		System.out.println(Arrays.toString(arr5));

		// 7-27
		int[][] arrs1 = {{1,2,3},{4,5,6}};
		int[][] arrs2 = {{6,3,4},{5,1,2}};
		int[][] arrs3 = {{0,0,0},{0,0,0}};
		
		boolean addMt = addMatrix(arrs1, arrs2, arrs3);
		for(int[] arr: arrs3) {
			System.out.println(Arrays.toString(arr));			
		}
		
	}

	//7-27
	private static boolean addMatrix(int[][] arrs1, int[][] arrs2, int[][] arrs3) {
		boolean result = false;
		if(arrs1.length != arrs2.length) return result;;
		if(arrs1[0].length != arrs2[0].length) return result;;
		for(int i=0; i<arrs1.length;i++) {
			for(int j=0; j<arrs1[i].length;j++) {
				arrs3[i][j] = arrs1[i][j]+arrs2[i][j];
			}
		}
		return result;
	}




	//7-23
	private static int[] arraySrchIdx(int[] arr, int n) {
		ArrayList<Integer> list = new ArrayList<>(); 
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i] == n) list.add(i);
		}
		int[] result = new int[list.size()];
		for(int i=0;i<list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	//7-24
	private static int[] arrayRmvof(int[] arr, int n) {
		int[] result = new int[arr.length-1];
		int j =0;
		for(int i=0; i<result.length; i++) {
			if(j==n) j++;
			result[i] = arr[j];
			j++;
		}
		return result;
	}
	
	// 7-25
	private static int[] arrayRmvOfN(int[] arr, int idx, int n) {
		int[] result = new int[arr.length-n];
		int j =0;
		for(int i=0; i<result.length; i++) {
			if(j==idx) j+=n;
			result[i] = arr[j];
			j++;
		}
		return result;
	}
	
	// 7-26
	private static int[] arrayInsOf(int[] arr, int idx, int n) {
		int[] result = new int[arr.length+1];
		int j =0;
		for(int i=0; i<result.length; i++) {
			if(i==idx) {
				result[i] = n;
			}else {
				result[i] = arr[j];
				j++;				
			}
		}
		return result;
	}

}
