import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueueExample {

	public static void main(String[] args) {
	

		//Creating a stack using linked list
		
		Queue<String> newQueue = new LinkedList<>();
		
		
		//Adding elements to the queue
		
		newQueue.add("Sruthi");
		newQueue.add("Laxman");
		newQueue.add("Swetha");
		newQueue.add("Venkat");
		
		System.out.println("The new Queue" + newQueue);
		
		//Removing the element from the queue using remove method
		String name = newQueue.remove();
		System.out.println("Removed from the new queue " + name + ", the altered waiting queue" + newQueue);
		
		
		//Removing the element from the queue using poll method
		
		name = newQueue.poll();
		System.out.println("Removed from the new queue " + name + ", the altered waiting queue" + newQueue);
		
		
		//Check if the queue is empty
		System.out.println("Is the new Queue empty? " +newQueue.isEmpty());
		
		//Finding the size of the queue
		System.out.println("What is the queue size " + newQueue.size());
		
		
		//Check if the Queue contains an element
		 name = "Swetha";
		 
		 if(newQueue.contains(name))
		 {
			 System.out.println("The queue contains " + name);
		 }
		 else 
		 {
			 System.out.println("The waiting queue doesnt contain " + name);
		 }
		 
		 //Iterating the queue using Java 8 foreach method
		 
		 System.out.println("Iterating over a Queue using for each");
		 
		 newQueue.forEach(names -> {
			 
			 System.out.println(names);
		 });
		 
		System.out.println("Iterating a queue using iterator");
		
		Iterator<String> newIterator = newQueue.iterator();
		
		while(newIterator.hasNext())
		{
			String newname = newIterator.next();
			System.out.println(newname);
		}
		
		System.out.println("Iterating a queue using forEachremaing method");
		
		 
		newIterator = newQueue.iterator();
		newIterator.forEachRemaining(names ->{
			System.out.println(names);
		});
		 
		System.out.println("Iterating a queue using for-each loop");
		for (String myName : newQueue ){
			System.out.println(myName);
		}
	}
	
	

}
