package algo.linearSearch;

public class App {

	public static void main(String[] args) {
		
		int[] myArray = {8, 9, 99};
		int searchMe = 5;
		
		System.out.println(linearSearch(myArray, searchMe));
		

	}
	
	public static int linearSearch(int[] a, int x) {

		for(int i =0; i<a.length; i++) {
			if(a[i] ==x) {
				return i;
			}
		}
		
		return -1;
		
	}

}
