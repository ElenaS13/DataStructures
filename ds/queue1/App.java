package ds.queue1;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(102);
		myQueue.insert(10);
		myQueue.insert(108);
		myQueue.insert(50);
		myQueue.insert(1000);
		myQueue.view();
		

	}

}
