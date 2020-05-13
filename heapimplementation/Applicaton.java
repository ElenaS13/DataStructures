package heapimplementation;

public class Applicaton {

	public static void main(String[] args) {
		
		
		Heap newHeap = new Heap(10);
		newHeap.insert(109);
		newHeap.insert(103);
		newHeap.insert(104);
		newHeap.insert(1044);
		
		newHeap.insert(12);
		newHeap.insert(11);
		newHeap.insert(1);
		
		newHeap.displayHeap();
		

	}

}
