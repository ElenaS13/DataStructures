package algo.linearSearch;

public class BasicLinearSearchP1 {

	public static void main(String[] args) {
		int[] ages = {5,6,4,7,3};
		int hisAge = 7;
		System.out.println("Position in the array is: " + LinearSearch(ages, hisAge)+ ". "+ " " + "And "+ "His Age is " + hisAge);
	}
	
	public static int LinearSearch(int[] ar, int x) {
		int answer = 0;
		for(int i =0; i<ar.length; i++) {
			if(ar[i]==x) {
				answer = i;
			}
			
		}
		 return answer;
	}

}
