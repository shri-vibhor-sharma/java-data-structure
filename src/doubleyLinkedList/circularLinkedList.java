package CircularLinkedList;

import singleyLinkedList.Node;

public class circularLinkedList {
	private Node first;
	private Node last;
	
	public circularLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst (int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			last = newNode;
		}
		newNode.next = first; //new node is pointing to old first
		first = newNode;
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			first = newNode;
		}else {
			last.next = newNode; //the last value of new node will point to new node 
			last = newNode; // we make the new node we crated to be the last node in the list
		}
	}
	
	public int deleteFirst(){
		int temp = first.data;
		if(first.next==null){
			last = null;
					}
		first = first.next; //first will point to old's next value
		return temp;
	}
	
	
	public void displayList(){
		Node current = first;
		while(current != null){
		current.displayNode();
		current = current.next;
		}
	}

}
