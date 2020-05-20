package ds.circularlinkedlist;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	
	
    private boolean isEmpty() {
		
		return first == null;
	}
	
	
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		} else {
			newNode.next = first; 
			first = newNode; 
		}
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
			
		} else {
		last.next = newNode;
		last = newNode;
	}

	}
	
	public int deleteFirst() {
		int temp = first.data;
		
		if(first.next == null) {
			last = null;
		} else {
			first = first.next;
			
		}
		return temp;
		
		
		
	}
	
	
	
	

}
