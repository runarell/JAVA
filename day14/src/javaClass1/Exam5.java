package javaClass1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exam5 {
/*
객체 생성 방법 
Arrays.asList() 메서드를 사용한 정적 컬랙션 객체 생성은 내부적으로는
배열을 먼저 생성하고 이것을 List<E>로 랩핑wrapping 즉 포장만 해 놓는다.
따라서 내부 구조는 배열과 동일하므로 컬렉션 객체인데도 크기 변경이 불가능하다.
구현 클래스로 객체를 생성했을 때와 달리 데이터의 추가 삭제가 불가능해진다.
단 크기를 변셩하지 않는 데이터의 변경은 가능하다. 따라서 고정된 개수의 데이터를
저장하거나 활용할때 사용된다.
*/
	public static void main(String[] args) {
		// Array.asList() 메서드를 사용한 정적 컬랙션 객체 생성
//		List<Integer> aList1 = Arrays.asList(1,2,3,4);
//		aList1.set(1, 7); //1 7 3 4
//		aList1.add(5);	// 오류 
//		aList1.remove(0);
		
//		List<Integer> aList1 = new ArrayList<>();
//		List<Integer> aList2 = new ArrayList<>(30);
//		List<Integer> aList3 = new Vector<>();
//		List<Integer> aList4 = new Vector<>(30);		
//		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkdeList<>(30); 저장용량 지정 불가
		
		// ArrayList<E> 클래스의 주요 메서드 활용-방법
		List<Integer> aList1 = new ArrayList<>();
		// 1. add(v)
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		// 2. add(i, v) - 위치 지정 삽입
		aList1.add(1, 6);  // (index, value)
		System.out.println(aList1.toString());
		// 3. addAll(v)
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2.toString());
		//4. addAll(i, v)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1,aList2);
		System.out.println(aList3.toString());
		//5. set()
		aList3.set(1, 5);
		System.out.println("set "+aList3.toString());
		//6. remove()
		aList3.remove(1);
		System.out.println(aList3.toString());
		//6. remove()
		aList3.remove(new Integer(2));
		System.out.println(aList3.toString());
		//7. clear()
		aList3.clear();
		System.out.println(aList3.toString());
		//8. isEmpty()  
		true
		System.out.println("isEmpty "+aList3.isEmpty());
		System.out.println("=============");
		//9. size  개수 확인
		System.out.println(aList3.size());
		//10. get index로 가져오기
		System.out.println(aList2.get(0));
		System.out.println(aList2.get(1));
		System.out.println(aList2.get(2));
		
		//Quiz  aList2.toString()
		for(int i=0; i<aList2.size();i++) {
			System.out.println((i+1)+"번째 : "+aList2.get(i));
		}
		
		
		
		
	}

}
