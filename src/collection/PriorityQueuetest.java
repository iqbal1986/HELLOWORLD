package collection;
import java.util.*;
public class PriorityQueuetest {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.offer("Chair");
		q.offer("table");	
		q.offer("paperweight");
		
		System.out.printf("%s",q);
		System.out.println();
		System.out.printf("%s",q.peek());
		System.out.println();
		
		q.poll();
		System.out.printf("%s",q);
	}
}
