package linkedlistPractice;

public class App2 {

	public static void main(String[] args) {
		
		System.out.println(binarySearch(new int[] {1,2,3,4,5,6,7,12,17}, 12));

	}
	
	public static int binarySearch(int [] a, int x) {
		int p =0;
		int r = a.length -1;
		
		while(p <= r) {
			int q = (p+r)/2;
			if(x <a[q]) r = q-1;
			else if(x > a[q]) p = q+1;
			else return q; 
		}
		return -1;
	}

}
