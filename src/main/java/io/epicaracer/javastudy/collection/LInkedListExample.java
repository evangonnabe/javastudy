package io.epicaracer.javastudy.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LInkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LikedList 걸린 시간 : " + (endTime - startTime) + " ns");

	}
}
