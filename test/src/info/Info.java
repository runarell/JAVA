package info;

import java.util.Arrays;

public class Info {

	public static void main(String[] args) {
		// 배열, 반복문, 조건
		// 주석, 클래스, 객체
		
		//Q1  //Q2
		print pr = new print();
		int[] a = {1,3,4,5,7};
		
		for(int i=0;i<a.length-1;i++) {
			int[] arr = pr.groupSum(a[i], a[i+1]);					
			System.out.println( Arrays.toString(arr) );
		}
	}
}

class print{
	public int[] groupSum(int n1, int n2) {
		int sum = n1 + n2;
		int[] resrlt = new int[2];
		
		if( sum%2 != 0 ) {
			resrlt[0] = n1;
			resrlt[1] = n2;
		}
		return resrlt;
	}
}


interface I1 {
	public void i1();
}
interface I2{
	public void i2();
}
interface I3 extends I2{  // 인터페이스도 인터페이스 상속 가능
	public void i3();
}
class Cl1 implements I1, I3{  // 인터페이스 상속(다중 가능) 
	public void z(){}  // 반드시 구현해야함
	public void i1() {};
	public void i2() {};	// I3가 상속 받은 I2도 구현해야함 
	public void i3() {};
} 

