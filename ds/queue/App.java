package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		
		myQueue.insert(100);
		myQueue.insert(4);
		myQueue.insert(77);
		myQueue.insert(67);
		myQueue.insert(333);
		myQueue.insert(3353);
		myQueue.insert(339993);
		myQueue.view();

	}

}
