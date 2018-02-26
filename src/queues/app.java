package queues;

public class app {
	public static void main (String args[]){
		queue myQueue = new queue(5);
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.insert(4);
		myQueue.insert(5);
		myQueue.insert(887);
		myQueue.insert(99);
		myQueue.view();
		System.out.println(myQueue.peekFront());
		System.out.println(myQueue.peekRear());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.peekFront());
	}

}
