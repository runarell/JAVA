package javaClass1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Exam6 {
/*
Linked List 연결 리스트
List<E>의 모든 동통 특징을 다 가지고 있다.
(동질 자요, 동적 할당, 추가/변경/삭제 동일한 메서드 사용)

1. LinkedList<E>는 객체를 생성시 저장용량을 지정할 수 없다.
2. 내부적으로 데이터를 저장하는 방식이 좀 다르다. 
	모든 데이터가 서로 연결된 형태로 관리 된다는 점
*/
	public static void main(String[] args) {
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		
		// 1. add(v)
		linkedlist1.add(3);
		linkedlist1.add(4);
		linkedlist1.add(5);
		System.out.println(linkedlist1.toString());
		// 2. add(i, v) - 위치 지정 삽입
		linkedlist1.add(1, 6);  // (index, value)
		System.out.println(linkedlist1.toString());
		// 3. addAll(v)
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(linkedlist1);
		System.out.println(aList2.toString());
		//4. addAll(i, v)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1,aList2);
		System.out.println(aList3.toString());
		//5. set()
		aList3.set(1, 5);
		System.out.println(aList3.toString());
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
		System.out.println(aList3.isEmpty());
		//9. size  개수 확인
		System.out.println(aList3.size());
		//10. get index로 가져오기
		System.out.println(aList2.get(0));
		System.out.println(aList2.get(1));
		System.out.println(aList2.get(2));
	}
}

/*
 
*/
