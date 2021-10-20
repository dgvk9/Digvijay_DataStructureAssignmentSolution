package com.greatlearning.ques1;

import java.util.LinkedList;
import java.util.Queue;

public class OrderOfConstruction {
	
	private Queue<Integer> queue = new LinkedList<>();
	
	public void orderOfConstruction(int[] floors) {
		
		int size = floors.length;
		for(int i=0; i<floors.length; i++) {
			System.out.println("Day: " + (i+1) );
			if(floors[i] == size) {
				System.out.print(size + " ");
				size--;
				while(queue.contains(size)) {
					System.out.print(size + " ");
					size--;
				}
				
			}else {
				queue.add(floors[i]);
			}
			System.out.println();
		}
		
	}

}
