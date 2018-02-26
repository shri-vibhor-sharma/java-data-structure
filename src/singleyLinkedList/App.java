package singleyLinkedList;

public class App {

	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertBegining(1);
		sll.insertBegining(2);
		sll.insertBegining(3);
		sll.insertBegining(4);
		sll.insertBegining(5);
		sll.insertAfter(99,2);
		sll.insertLast(100);
		sll.betterinsertLast(101);
		sll.displayList();
		
	}

}
