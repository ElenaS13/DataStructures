
public class recursiveBinarySearch {

	public static void main(String[] args) {
		System.out.println(recursiveBinarySearch(new int [] {1,3,4,5,6,7,8,923,45}, 0, 8, 3));

	}
	
	public static int recursiveBinarySearch(int [] a, int p, int r, int x) {
		if(p>r) {
			return -1;
		} else {
			int q = (p+r)/2;
			if(a[q] == x) {
				return q;
			} else if(a[q] > x) {
				return recursiveBinarySearch(a, p, q-1, x);
			} else {
				return recursiveBinarySearch(a, q+1, r, x);
			}
			
		}
		
	}

}
