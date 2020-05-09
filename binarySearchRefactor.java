
public class binarySearchRefactor {

	public static void main(String[] args) {
		
		System.out.println(binarySearchRefactor(new int[] {1,2,3,5,7,9,12,34,56}, 56));
		
		

	}
	
	public static int binarySearchRefactor(int[] a, int x) {
		
		var start = 0;
		var end = a.length -1;
		
		while (start <= end) {
			
			int midpoint = (start+end)/2; 
			if(x > a[midpoint]) {
				start = midpoint + 1;
			} else if(x < a[midpoint]) {
				end = midpoint -1; 
				
			} else return midpoint; 
		}
		
		return -1; 
	}

}
