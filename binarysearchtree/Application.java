package binarysearchtree;

public class Application {

	public static void main(String[] args) {
		

		BTS tree = new BTS();
		tree.insert(10, "Ten");
		tree.insert(20, "Twenty");
		tree.insert(15, "Fifteen");
		
		System.out.println(tree.findMin());
		System.out.println(tree.findMax());
		
		

	}

}
