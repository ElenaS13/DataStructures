import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("First String: ");
		String firstString = in.next();
		
		
		System.out.print("Second String: ");
		String secondString = in.next();
		
		System.out.print("Third String: ");
		String thirdString = in.next();
		in.close();
		
		if(firstString.compareTo(secondString) < 0 && firstString.compareTo(thirdString) < 0) {
			System.out.println(firstString);
			if(secondString.compareTo(thirdString) < 0){
				System.out.println(secondString);
				System.out.println(thirdString);
			}
			else {
				System.out.println(thirdString);
				System.out.println(secondString);
			}
		}
		else if(firstString.compareTo(secondString) > 0 && secondString.compareTo(thirdString) < 0) {
			System.out.println(secondString);
			if(firstString.compareTo(thirdString) < 0) {
				System.out.println(firstString);
				System.out.println(thirdString);
			}
			else {
				System.out.println(thirdString);
				System.out.println(firstString);
			}
		}
		else {
			System.out.println(thirdString);
			if(firstString.compareTo(secondString) < 0) {
				System.out.println(firstString);
				System.out.println(secondString);
			}
			else {
				System.out.println(secondString);
				System.out.println(firstString);
			}
		}
		
		System.exit(0);

		

	}

}
