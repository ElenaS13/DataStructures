package ds.singlyLinkedList;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		
		myList.insertFirst(100);
		myList.insertFirst(234);
		myList.insertFirst(334);
		myList.insertFirst(45);
		
		myList.displayList();

	}

}
