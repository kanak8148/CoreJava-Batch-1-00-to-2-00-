package in.co.rays.queue;

import java.util.PriorityQueue;

import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		Queue q = new PriorityQueue();

		q.add(89);
		q.add(89);
		
		
		q.remove();

		System.out.println(q);

	}
}