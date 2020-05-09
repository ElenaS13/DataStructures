import java.util.Scanner;

public class TestNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a floating-point number: ");
		double firstNumber = in.nextDouble();
		
		System.out.print("Enter another floating-point number: ");
		double secondNumber = in.nextDouble();
		in.close();
		
		if(Math.abs(firstNumber - secondNumber) <= 0.01) {
			System.out.println("They are the same up to two decimal places.");
		}
		else {
			System.out.println("They are different.");
		}
		
		
		
		
		

	}

}
