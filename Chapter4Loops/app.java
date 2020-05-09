package Chapter4Loops;

public class app {

	public static void main(String[] args) {
		Counter count1 = new Counter("First");
		
		count1.increment();
		count1.increment();
		count1.increment();
		
		System.out.println(count1.getCurrentValue());

	}

}
