import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String first = in.next();
		System.out.print("Enter your significant other's name: ");
		String second = in.next();
		
		//Compute and display the inscription
		String initials = first.substring(0,1) + "&" + second.substring(0,1);
		System.out.print(initials);
		
		

	}

}
