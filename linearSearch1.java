
public class linearSearch1 {

	public static void main(String[] args) {
		linearSearch(new int [] {1,3,5,6,7,8,45,67,78}, 3);

	}

	public static int linearSearch(int[] a, int x) {
	  for(int i = 0; i<a.length; i++) {
		  if(x == a[i]) {
			  System.out.println(i); 
		  } 
	  }
	return -1;
		
		
	}

}
