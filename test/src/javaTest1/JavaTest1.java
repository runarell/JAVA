package javaTest1;
import java.util.Arrays;
public class JavaTest1 {
	public static void main(String[] args) {
		int[] arrNum = {3,3}; 	// 탐색할 배열			{2,7,11,15}; {3,2,4}; {3,3};
		int target = 6;					// 탐색할 두수의 합의 값      	 9			  6		   6
		
		System.out.print("nums = "+Arrays.toString(arrNum));
		System.out.println(", target = "+target);
		int[] idxarr = new int[2];		// 값을 담을 숫자형 배열 생성
		
		Numbers no = new Numbers();		// class Numbers 인스턴스 생성
		idxarr = no.sum(arrNum, target);// class Numbers의 sum메소드 실행 후 
										// 반환값을 idxarr에 삽입
		
		// 결과 값 배열을 화면에 출력 ( Arrays.toString()으로 배열을 바로 출력 )
		System.out.println( "Output: "+Arrays.toString(idxarr) ); 
		
	}	// main End
}	// JavaTest1Class End

class Numbers{								// 계산 메서드를 만들 class 생성
	int[] sum(int[] arr, int n) {			// 숫자배열과 숫자를 받고 / 숫자 배열 반환하는 메서드 생성
		int[] result = new int[2];			// 반환값은 인덱스 2개를 담을 숫자 배열
		for(int i=0; i<arr.length-1;i++) {	// 배열의 숫자의 합을 확인할 반복문
			int sum = arr[i] + arr[i+1];	// 이번 순서의 인덱스 합을 구한다.
			if( sum == n ) {				// 인덱스 합과 비교할 숫자와 비교
				result[0] = i;				// result[0] 배열에 i값을 넣기
				result[1] = i+1;			// result[1] 배열에 i값을 넣기
				return result;				// result값을 반환
			}			
		}
		return null;						// 만약 실패시 null값을 반환
	}
}	// NumversClass End




//정수 배열 nums와 정수 대상이 주어지면 대상에 맞도록 두 숫자의 인덱스를 반환합니다.
//각 입력에 정확히 하나의 솔루션이 있다고 가정하고 동일한 요소를 두 번 사용하지 않을 수 있습니다.
//어떤 순서로든 답변을 반환할 수 있습니다.
				
