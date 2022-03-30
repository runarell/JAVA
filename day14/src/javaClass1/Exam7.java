package javaClass1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exam7 {
	public static void main(String[] args) {
		// ArrayList와 LinkedList 성는 비교(추가/삭제/검색)
		
		ArrayList aList = new ArrayList();
		LinkedList linkedlist = new LinkedList();
		
		long startTime = 0;
		long endTime = 0;
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			aList.add(0,1);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 시간 = "+((endTime-startTime)/1000000) ); //432
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			linkedlist.add(0,1);
		}
		endTime = System.nanoTime();
		System.out.println("linkedlist 시간 = "+((endTime-startTime)/1000000)); //3
		
		//============================
//		startTime = System.nanoTime();
//		for(int i=0; i<100000; i++) {
//			aList.get(i);
//		}
//		endTime = System.nanoTime();
//		System.out.println("ArrayList 시간 = "+((endTime-startTime)/10000) ); //70
//		
//		startTime = System.nanoTime();
//		for(int i=0; i<100000; i++) {
//			linkedlist.get(i);
//		}
//		endTime = System.nanoTime();
//		System.out.println("linkedlist 시간 = "+((endTime-startTime)/10000)); //430369
		
		//==========================
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 시간 = "+((endTime-startTime)/10000) ); //44476
		
		startTime = System.nanoTime();
		for(int i=0; i<100000-1; i++) {
			linkedlist.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("linkedlist 시간 = "+((endTime-startTime)/10000)); //360
	}
}
