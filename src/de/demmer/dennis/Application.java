package de.demmer.dennis;

import java.util.LinkedList;
import java.util.Queue;

public class Application {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("test1");
		queue.add("test2");
		queue.add("test3");
		queue.add("test4");
		queue.add("test5");

		while(true) {
			queue.add("test");
			queue.poll();
			System.out.println(queue.size());
		}
		
		
		
		

	
		
	}
}
