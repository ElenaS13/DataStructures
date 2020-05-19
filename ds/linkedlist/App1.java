package ds.linkedlist;

public class App1 {

	public static void main(String[] args) {
		Node nodeA = new Node(); 
		nodeA.data =4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeB.data = 7;
		
		Node nodeD = new Node();
		nodeB.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
//		
//		System.out.println(nodeA);
//		System.out.println(nodeB);
//		System.out.println(nodeC);
//		System.out.println(nodeD);
		
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
		System.out.println(listLength(nodeC));
		System.out.println(listLength(nodeD));
		
		
		
		
		
	}
	
	public static int listLength(Node aNode) {
		int length = 0;
		
		Node currentNode = aNode;
		
		while(currentNode != null ) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}


}