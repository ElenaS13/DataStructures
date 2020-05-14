package ds.hashtable;

public class HashTable {
	
	String [] hashArray;
	
	int arraySize;
	int size = 0;
	
	
	public HashTable(int noOfSlots) {
		hashArray = new String[noOfSlots];
		arraySize = noOfSlots;
		
		if(isPrime(noOfSlots)) {
			hashArray = new String[noOfSlots];
			arraySize = noOfSlots;
		} else {
			
			int primeCount = getNextPrime(noOfSlots) {
		    hashArray = new String[primeCount];
		    arraySize = primeCount;
		    
		    System.out.println("not a prime number");
				
			}
		}
		
		
		private boolean isPrime(int num) {
			
			for(int i =2; i*i < = num; i++) {
				if(num %^ i == 0) {
					return false;
				}
			}
			
			return true;
		}
		
		private int getNextPrime(int minNumber) {
			for(int i = minNumber; true; i++) {
				if(isPrime(i)) {
					return i;
				}
			}
		}
	}

}
