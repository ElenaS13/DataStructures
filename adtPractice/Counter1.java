package adtPractice;

public class Counter1 {
	// adt - capable of performing operations on data 
	
	private String name = null;
	private int value = 0;
	
	public Counter1(String str) {
		this.name = str;
	}
	
	public void increment() {
		value++;
	}
	
	public int getCurrentValue() {
		return value;
	}
	
	public String toString() {
		return name + " :" + value;
	}
	
	

}
