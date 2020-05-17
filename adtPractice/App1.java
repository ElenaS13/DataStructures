package adtPractice;

public class App1 {

	public static void main(String[] args) {
		Counter myCounter = new Counter("myCounter");
		myCounter.increment();
		myCounter.increment();
		
		System.out.println(myCounter.getCurrentValue());

	}

}
