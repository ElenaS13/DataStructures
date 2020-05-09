import java.util.Scanner;

public class ReadInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Write a number: ");
		int number = in.nextInt();
		in.close();
		
		if(number <0) {
			System.out.println("The number is negative");
			
		}
		else if(number ==0) {
			System.out.println("The number is equal to 0");
		}
		else {
			System.out.println("The number is positive");
		}
		

	}

}
