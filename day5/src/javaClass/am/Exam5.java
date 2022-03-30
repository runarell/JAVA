package javaClass.am;

public class Exam5 {
	public static void main(String[] args) {
		// 문자열 연산
//		String str1 = "안녕"+"하세요"+"!";
//		System.out.println(str1);
//		
//		String str2 = "방갑";
//		str2 +="습니다";
//		str2 +="!";
//		System.out.println(str2);
		
		// String 객체는 내용을 변경할 수 없기 때문에  
		// 메모리에는 각각의 객체가 매번 생성이 된다.
		// "안녕"+"하세요" 붙을 때 객체 생성
		// "안녕하세요" + "!" 객체 생성
		// 마지막으로 객체의 위치값이 저장된다.
		
		// 문자열 관련 메서드 정리
		String str1 = "Hello Java"; //빈칸도 글짜로 카운터
		String str2 = "안녕하세여! 방갑습니다.";//한글 영어 모두 한 문자당 1개로 카운터
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("====================");
		
		// charAt() 문자열 검색
		System.out.println(str1.charAt(1)); // 인덱스 1위치의 문자
		System.out.println(str2.charAt(1)); // 인덱스 1위치의 문자
		
		//indexOf() 글자가 위치한 인덱스 반환 lastIndexOf()
		System.out.println(str1.indexOf('a')); //앞에부터 첫번째 a의 인덱스
		System.out.println(str1.lastIndexOf('a')); //뒤에부터 첫번째 a의 인덱스
		
		// 문자열로 변환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		// concat() 문자열을 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		// 대소문자 변환
		
		String str6 = "Jaca Study";
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		
		// replace 문자열 변경
		System.out.println(str6.replace("Study","공부"));
		
		// substring
		System.out.println(str6.substring(0,5)); //0부터 5미만 슬라이싱
		
		// trim 여백 제거
		System.out.println("     austin     ".trim()); //0부터 5미만 슬라이싱
		
		// 문자열의 내용비교
		// : 문자열 비교시 == 사용X // equals() 사용
		System.out.println( str1.equals(str2) );
		
		
//		SHA-256 알고리즘
		//암호 알고리즘
		
		String str7 = new String("Java");
		String str8 = new String("Java");
		String str9 = new String("java");
		
		// 문자가 저장된 주소값 비교
		System.out.println(str7 == str8);
		System.out.println(str8 == str9);
		System.out.println(str7 == str9);
		// 문자 자체를 비교
		System.out.println( str7.equals(str8) );
		System.out.println( str8.equals(str9) );
		System.out.println( str7.equals(str9) );
		System.out.println( str7.equals(str9) );
		
		// 대소문자 구분없이
		System.out.println( str7.equalsIgnoreCase(str9) );
	}
}










