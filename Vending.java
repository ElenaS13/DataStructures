import java.util.Scanner;

public class Vending {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int PENNIES_PER_DOLLAR = 100;
    final int PENNIES_PER_ORDER = 25;

    System.out.print("Enter bill value: ");
    int billValue = in.nextInt();
    System.out.print("Enter item price in pennies: ");
    int itemPrice = in.nextInt();

    //Computer change due 

    int changeDue = PENNIES_PER_DOLLAR * billValue - itemPrice;
    int dollarCoins = changeDue /PENNIES_PER_DOLLAR;
    changeDue = changeDue % PENNIES_PER_DOLLAR;
    int quarters = changeDue / PENNIES_PER_ORDER;

    //Print change due 
    System.out.printf("Dollar coins: %6d", dollarCoins);
    System.out.println();
    System.out.printf("Quarters: %6d", quarters);
    System.out.println();

  }
}