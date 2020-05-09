import java.util.Scanner;

public class DiscountedPrice {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("What is the original price: ");
		int originalPrice = in.nextInt();
		int discountedPrice;
		
		if(originalPrice >100)
		{
			discountedPrice = originalPrice - 20; 
		}
		else 
		{
			discountedPrice = originalPrice - 10;
		}
		
        System.out.println("Discounted price is: " + discountedPrice);
	}

}
