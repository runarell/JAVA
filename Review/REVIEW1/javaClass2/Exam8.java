package javaClass2;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam8 {
    public static void main(String[] args) {
       HashSet<Integer> A = new HashSet<Integer>();
    //    HashSet<Integer> B = new HashSet<Integer>();
    //    A.contains(B);
    //    A.addAll(B);
    //    A.retainAll(B);
    //    A.removeAll(B);
        Iterator hi = a.iterator();        //
        while(hi.hasNext()){               //
            System.out.println(hi.next()); //
        }
        boolean a = true;

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

        HasMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("String", int);  // 형식으로 값 부여
        //getKey getvalue

    }
}
