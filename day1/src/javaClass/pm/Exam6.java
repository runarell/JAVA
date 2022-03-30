package javaClass.pm;

public class Exam6 {
	public static void main(String[] args) {
		
		// 문자 저장 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3'; // 숫자 아닌 문자 3
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		char value4 = 65;
		System.out.println(value4);
		
		char value5 = '\u0065';
		System.out.println(value5);
	
//1		main{
//2		int a = 3;
//3			{
//4				int = b;
//5				b=5;
//6			}
//7			int c = 7
//8		}
		
//	quiz2
//		1. byte a = 3;
//		2. byte b = 5;
//		3. byte c = 130;     // int c = 130;
//		4. byte d = a+b;     // int d = a+b, 
//		5. long e = 100;     // long e = 100L
//		6. float f =3.5;     // float f =3.5f;
		
//		quiz3
//		1. System.out.println( (int)5.6 + 3.5 );
//		2. System.out.println( (int)5.6 + (int)3.5 ); 
//		3. System.out.println( (int)(5.6 + 3.5) ); 
//		4. System.out.println( ( 7/4 ); 
//		5. System.out.println( (double) 3/2 );
//		6. System.out.println( (double)(3/2) ); 	
//		1. 8.5
//		2. 8
//		3. 9
//		4. 1.75
//		5. 1.5
//		6. 1.5		
		System.out.println( (int)5.6 + 3.5 );
		System.out.println( (int)5.6 + (int)3.5 ); 
		System.out.println( (int)(5.6 + 3.5) ); 
		System.out.println( 7/4 ); 
		System.out.println( (double) 3/2 );
		System.out.println( (3/2) ); 
		
	}
}
