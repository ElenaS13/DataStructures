package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack myStack = new Stack(3);
//		
//		myStack.push(20);
//		myStack.push(30);
////		myStack.push(80);
////		myStack.push(89);
//		
//		while(!myStack.isEmpty()) {
//			long value = myStack.pop();
//			System.out.println(value);
//		}
//		

		System.out.println(reverseString("Hello"));
	}
	
	public static String reverseString(String str) {
		int stackSize = str.length(); // get the max size of the stack
		Stack theStack = new Stack(stackSize); // we make the stack
		for(int j=0; j < str.length(); j++) {
			char ch = str.charAt(j); //getting a char from the input string
			theStack.push(ch);
		}
		
		String result = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			result = result +ch; //appending to the output
		}
		
		return result;
	}
	
	
	

}
