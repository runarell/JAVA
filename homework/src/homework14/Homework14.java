package homework14;

import java.util.Scanner;

public class Homework14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 스캔 객체 생성
		System.out.println("좌표값 입력 (a~h+1~8) : ");
		String location = sc.nextLine();		// 좌표값 입력
		byte b = kightLoot(location);			// 경우의 수 반환 ( 최대값이 8 ) 
		System.out.println("위치 "+location+"에서의 경우의 수는 "+b);
	}

	private static byte kightLoot(String tp) {
		// 아스키 번호를 이용한 범위값 [0]:97~104 [1]:49~56 => 1~8값으로 변경
		byte row = (byte) (tp.charAt(0) - 96); 		// 범위 숫자 치환 : a~h => 아스키번호 97~104 => 1~8
//		byte col = (byte) (tp.charAt(1) - 48); 		// 범위 숫자 치환 : 1~8 => 아스키번호 49~56 => 1~8
		byte col = Byte.parseByte(tp.split("")[1]);	// 문자열추출 => String => Byte치환 =>  1~8
		byte[] loadNum = {row, col};  				// 반복문을 위해 좌표값 배열에 삽입
		byte[] calcul = {-2, 2};  	  				// 반복문을 위해 +-2 배열에 삽입
		byte count = 0;								// 경우의 수를 카운터 할 변수( 변수의 최대 값은 8 )

		byte i=0, j=1;			// 행과 열은 교차로 쓰임loadNum[1],loadNum[0] / loadNum[0],loadNum[1]  
		while(i<2) {			// 행 변환과 열 변환을 교차할 반복문 ( 행+-2,열+-1/열+-2,행+-1 )
			for(int k=0; k<2; k++) {  // 첫 범위 +-2 를 반복
				byte as = (byte)(loadNum[i]+calcul[k]); // 첫 범위 계산 +-2
				if(as>= 1 && as <= 8) {					// 첫 범위가 안이면 실행  
					if(loadNum[j]-1 >= 1) count++; 	// -1 범위 확인 1이상  카운터+        
					if(loadNum[j]+1 <= 8) count++; 	// +1 범위 확인 8이하  카운터+
				}
			}
			i++; j--; // 행렬 교차 loadNum[0],loadNum[1] => loadNum[1],loadNum[0]
		}
		return count; // 계산값 반환
	}

}
