import java.util.Scanner;

public class P3_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Write the first number: ");
		int firstNumber = input.nextInt();
    
		System.out.print("Write the second number: ");
		int secondNumber = input.nextInt();
    
		System.out.print("Write the third number: ");
		int thirdNumber = input.nextInt();
		input.close();
		
		if(firstNumber <= secondNumber && secondNumber <= thirdNumber || 
				firstNumber >= secondNumber && secondNumber > thirdNumber) {
			System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber + " - In order");
		}
		else {
			System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber + " - Not in order");
		}
	}
} 
