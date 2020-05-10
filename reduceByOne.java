
public class reduceByOne {

	public static void main(String[] args) {
		
		reduceByOne(10);

	}
	
	public static void reduceByOne(int x) {
		if(x>= 0) {
			reduceByOne(x-1);
		}
		
		System.out.println(x);
	}

}
