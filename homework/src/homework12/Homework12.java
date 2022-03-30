package homework12;

import java.util.Scanner;

public class Homework12 {

	public static void main(String[] args) {

		int N = 17;
		int K = 4;		
		int result = Greedy(N, K);  			// n과 k를 받아 나눈 횟수를 출력
		System.out.println("실행 횟수" + result);	// 반환값 출
	}

	static int Greedy(int n, int k) {
		int result = 0;			// 반환값 초기화
		while(n != 1) {			// 반복 실행 n이 1이면 더이상 나누어지지 않음
			if(n%k == 0) {		// n이 k로 나누어지면
				n = n/k;		// n을 k로 나눈 값을 대입
			}else {				// n이 k로 나누어 떨어지지 않으면
				n--;			// n 을 1 줄인다.
			}
			result++;			// 한 사이클시 횟수 카운터 
		}
		return result;			// 반복문이 끝나면 반환값 반환
	}
}
