package linkedlistPractice;

public class SinglyLinkedList {
	Node head = null;
	Node tail = null;
	
	public void addNode(int data) {
		//create a new node
		Node newNode = new Node(data);
		
		// checks if the list is empty
		
		if(head == null) {
			// if the list is empty, both head and tail will point to the new node
			
			head = newNode;
			tail = newNode;
			
			
		} else {
			//newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode will become new tail of the list 
			tail = newNode;
		}
	}
	
	public void display() {
		
		// Node current will point to head
		
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		} else {
			System.out.println("Nodes of this linkedlist are: ");
			while(current != null) {
				// print each node by incrementing pointer 
				System.out.println(current.data + " ");
				current = current.next;
			}
		}
		
	}

}
