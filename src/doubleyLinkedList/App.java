package CircularLinkedList;

public class App {

	public static void main(String[] args) {
		circularLinkedList mylist = new circularLinkedList();
		mylist.insertFirst(1);
		/*mylist.insertFirst(2);
		mylist.insertFirst(3);
		mylist.insertFirst(4);
		mylist.insertFirst(5);
		mylist.insertLast(99); */
		System.out.println(mylist.deleteFirst());
		mylist.insertLast(100);
		mylist.displayList();
	}

}
