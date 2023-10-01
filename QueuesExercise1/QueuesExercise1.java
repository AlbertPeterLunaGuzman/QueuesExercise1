package QueuesExercise1;
import java.util.*;
public class QueuesExercise1 {
								//test Define
									public static void println(String string) {
										System.out.println(string);
									}
									public static void print(String string) {
										System.out.print(string);
									}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> list = new LinkedList<Integer>();
		
		int[] ar = {2, 5, 8, 1, 9, 3, 6, 7, 4};
		
		//Add the int elements into the Queue
		for(int i = 0; i < ar.length; i++) {
			list.offer(ar[i]);
		}
	
		//Print the size of the Queue
			println("Size of the Queue: " + list.size());
			
			print("");
			
		//Print the front elements of the Queue
			front(list);
			
			rear(list);
			
			list.poll();
			front(list);
			
			list.offer(10);
			list.offer(11);
			
			print("\nPrint all of the elements of the Queue: ");
			recurPrint(list);
		}
		
		public static void recurPrint(Queue<Integer> e) {
			if(e.isEmpty()) {
				return;
			} else {
				Integer element = e.poll();
					print(Integer.toString(element) + " ");
				recurPrint(e);
			}
		}
	
	public static Integer front(Queue<Integer> e) {
		Integer size = e.size();
			if(e.isEmpty()) {
				return 0;
			} else {
				Integer[] a = e.toArray(new Integer[0]);
					println("\nFront: " + a[0]);
				return a[0];	
			}
	}
	
	public static Integer rear(Queue<Integer> e) {
		Integer size = e.size();
		Integer rearElement = size - 1;
			if(e.isEmpty()) {
				return 0;
			} else {
				Integer[] a = e.toArray(new Integer[0]);
					println("rear: " + a[rearElement]);
				return a[rearElement];
			}
	}

}	
