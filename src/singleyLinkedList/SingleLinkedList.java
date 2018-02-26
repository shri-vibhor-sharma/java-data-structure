package singleyLinkedList;

public class SingleLinkedList {
	private Node first;
	private Node last;

	public boolean isNull(){
		return(first == null);
	}
	public void insertBegining(int data){
		Node newNode = new Node();
		newNode.next =	first;
		newNode.data = data;
		first = newNode;
		
	}
	public Node deleteFirst(){
		Node temp = first;
		first = first.next;
		return temp;
	}
	public void displayList(){
		Node current = first;
		while(current != null){
		current.displayNode();
		current = current.next;
		}
	}
	public void insertAfter(int data, int after){
		Node current = first;
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
				
		while (current != null){
			System.out.println("current ka data hai "+current.data);
			if(current.data==after){
			Node temp = current.next;
			current.next = newNode;
			newNode.next = temp;
			break;
			}
			current = current.next;
		}
	}
	
	public void insertLast(int data){
		Node node = new Node();
		node.data = data;
		Node current = first;
		while (current.next != null){
			current = current.next; //iterate till you find the next node
		}
		current.next = node;
	}
	public void betterinsertLast (int data){
		Node node = new Node();
		node.data = data;
		last.next = node;
	}
}
