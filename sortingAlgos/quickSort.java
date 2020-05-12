package sortingAlgos;

import java.util.Arrays;

public class quickSort {

	public static void main(String[] args) {
		int [] inputArray = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0,6,4 };
        quickSortAlgo(inputArray, 0, inputArray.length-1);
        
        
        System.out.println(Arrays.toString(inputArray));
	}

	private static void quickSortAlgo(int[] inputArray, int start, int end) {
		if(start< end) {
			int pp = partition(inputArray, start, end);
			quickSortAlgo(inputArray, start, pp-1);
			quickSortAlgo(inputArray, pp+1, end);
			
			
		}
		
		
	}
	
	public static int partition(int [] inputArray, int start, int end ) {
		
		int pivot = inputArray[end];
		
		int i = start -1;
		
		for(int j = start; j<= end-1; j++) {
			if(inputArray[j] <= pivot) {
				i++;
				// we are swapping
				int ival = inputArray[i];
				int jval = inputArray[j];
				inputArray[i] = jval;
				inputArray[j] = ival;
			}
		}
		//put the pivot value in the correct slot next 
		
		int ival = inputArray[i+1];
		inputArray[end] = ival;
		inputArray[i+1] = pivot;
		
		return i+1;
	}

}
