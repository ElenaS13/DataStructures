
public class linearSearch {

	public static void main(String[] args) {
		System.out.println(linearSearch(new int[] {2,3,5,7,8,9,23,234}, 234));
		
		

	}
	
	public static int linearSearch(int[] a, int x) {
		for(int i = 0; i <a.length; i++ ) {
			System.out.println(a.length);
			if(a[i] == x) {
				return i;
			}
		}
		return -1; 
	}

}
