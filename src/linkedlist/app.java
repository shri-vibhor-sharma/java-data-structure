package linkedlist;

public class app {
	public static void main (String args[]){
		System.out.println("hurrah !");
		Node nodeA = new Node();
		nodeA.value = 1;
		
		Node nodeB = new Node();
		nodeA.value = 2;
		
		Node nodeC = new Node();
		nodeA.value = 3;
		
		Node nodeD = new Node();
		nodeA.value = 4;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		System.out.println("length of the list is -->"+listSize(nodeA));
	}
	public static int listSize(Node nodeI){
		Node currentNode = nodeI;
		int length = 0;
		while (currentNode != null){
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}

}
