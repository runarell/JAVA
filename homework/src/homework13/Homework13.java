package homework13;

import java.util.Scanner;

public class Homework13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 스캔 객체 생성
		System.out.print("여행지 크기 입력 : ");
		int n = sc.nextInt();					// 정사각형의 여행지 크기
		System.out.print("이동 횟수 입력 : ");
		int tr = sc.nextInt();					// 동선 횟수
		String trpPlant = trpComp(tr);			// 동선 문자열 입력 함수
		String destination = dest(trpPlant, n); // 목적지 주소 입력 함수
		System.out.println(destination);
	}

	private static String dest(String tp, int n) {
		String[] drc = tp.split(" ");	// 입력값 문자로 나누어 배열화
		String result = "";				// 반환값 초기화
		int X = 1;						// X축 변수
		int Y = 1;						// Y축 변수
		
		for(String s : drc) {			// 동선 반복문
			if("L".equals(s)) {			// 왼쪽이동
				if( X != 1 ) X--;
			}else if("R".equals(s)) {	// 오른쪽 이동
				if( X != n ) X++;
			}else if("U".equals(s)) {	// 위로 이동
				if( Y != 1 ) Y--;
			}else { // "D".equals(s)	// 아래로 이동
				if( Y != n ) Y++;
			}
			System.out.println(X + "//" + Y );
		}
		result = Y+" "+X;
		return result;
	}

	private static String trpComp(int tr) {
		Scanner sc = new Scanner(System.in);// 스캔 객체 생성
		String result = "";					// 반환값 초기화
		
		int i = 0;
		while(i <tr) {
			System.out.print("왼쪽 : L / 오늘쪽 : R / 위 : U / 아래 : D");
			String st = sc.next().toUpperCase(); // 문자 입력
			String str = "LRUD";			// 입력된 값을 확인 할 스트링열
			
			if(st.length() > 1) {			// 문자를 많이 입력하면
				System.out.println("너무 많이 입력했습니다.\n다시 입력하세요.");
			}else if(str.contains(st)) {	// 입력값이 맞으면
				result += st+" ";			// 문자열에 추가
				i++;						// 반복문 다음으로 넘어가기 위한 변수 ++
			}else {							// 잘못된 입력시 실행
				System.out.println("입력이 잘못되었습니다.\n 다시 입력하세요.");
			}
		}
		System.out.println("모든 입력이 완료되었습니다.");
		return result;						// 반복문으로 입력된 값 반환
	}

}
