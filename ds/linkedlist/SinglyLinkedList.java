package ds.linkedlist;

public class SinglyLinkedList{
	
	// represents a node of the singly linked list
	class Node {
		int data;
		Node next;
		
		
		public Node(int data) {
		
			this.data = data;
			this.next = null;
		}
		
	}
	
	// represent the head and the tail of the singly linked list
	
	public Node head = null;
	public Node tail = null;
	
	
	// addNode() will add a new node to the list
	
	public void addNode(int data) {
		
		// create a new node 
		Node newNode = new Node(data);
		
		// check if the list is empty 
		
		if(head == null) {
			// if list is empty, both head and tail will point to the new node
			head = newNode;
			tail = newNode;
			
		} else {
			
			//newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode will become new tail of the list 
			tail = newNode;
		}
		
	}
	
	// display() will display all the nodes present in the list 
	public void display() {
		// Node current will point to the head
		
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		System.out.println("Nodes of singly linked list: ");
		while(current != null) {
			// print each node by incrementing pointer  
			System.out.println(current.data + " ");
			current = current.next;
			
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList sList = new SinglyLinkedList();
		
		// add nodes to the list 
		
		sList.addNode(1);
		sList.addNode(3);
		sList.addNode(5);
		sList.addNode(8);
		
		// displays the nodes present in the list
		
		sList.display();
	}
	
	
	

}
