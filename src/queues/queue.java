package queues;

public class queue {
	private int front, rear, maxsize, nitems;
	private long[] queueArray;

	public queue(int size) {
		this.maxsize = size;
		queueArray = new long[size];
		front = 0;
		rear = -1;
		nitems = 0;
	}

	public void insert(long j) {
		if(rear==maxsize-1){							//circular queue
			System.out.println("Cannot insert list is already full."); //overwritting the old values in the list
			rear=-1;
			
		}
		rear++;
		queueArray[rear] = j;
		nitems++;
		
	}

	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print(" ]");
	}

	public long remove() {
		long temp = queueArray[front];
		front++;
		if (front == maxsize) {
			front = 0;
		}
		nitems--;
		return temp;
	}

	public long peekFront() {
		return queueArray[front];
	}

	public long peekRear() {
		return queueArray[rear];
	}

	public boolean isEmpty() {
		if (nitems==0) {
			return true;
		} else
			return false;
	}

	public boolean isFull() {
		if (nitems==maxsize) {
			return true;
		} else
			return false;
	}

}
