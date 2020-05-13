package heapimplementation;


public class Heap {
	
	private Node[] heapArray;
	private int maxSize;   // max size of the array
	private int currentSize; // this is going to change ..number of nodes in the array
	
	public Heap(int size) { // to create a heap, we need to know the size of it
		this.maxSize = size;
		currentSize = 0; // no data in it when we create it so it is 0
		heapArray = new Node[size];
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public boolean isEmpty() {
		return (currentSize == 0);
	}
	
	
	public boolean insert(int key) {
		if(currentSize == maxSize) {
			return false;
			//array is full
		}
		
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		
		trickleUp(currentSize);
		currentSize++;
		
		return true;
		
		
	}
	
	public void trickleUp(int idx) {
		int parentIdx = (idx -1)/2;
		Node nodeToInsert = heapArray[idx];
		
		// loop as long as we have not reached the root 
		while(idx > 0 && heapArray[parentIdx].getKey() < nodeToInsert.getKey()) {
			heapArray[idx] = heapArray[parentIdx]; // move parent down
			idx = parentIdx;
			parentIdx = (parentIdx -1)/2; // move up
		}
		
		heapArray[idx] = nodeToInsert;
	}
	
	public Node remove() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[-- currentSize];
		
		trickleDown(0);
		
		return root;
		
	}
	
	private void trickleDown(int idx) {
		int largerChildIdx;
		Node  top = heapArray[idx]; //save the last node into top variable 
	    
		while(idx < currentSize/2) {// runs as long as idx is not on the bootom row
			int leftChildIdx = 2*idx +1;
			int rightChildIdx = leftChildIdx +1;
			
			//figure out which child is larger
			if(rightChildIdx < currentSize && 
					heapArray[leftChildIdx].getKey() < heapArray[rightChildIdx].getKey()) {
				largerChildIdx = rightChildIdx;
			} else {
				largerChildIdx = leftChildIdx;
			}
			
			if(top.getKey() >= heapArray[largerChildIdx].getKey()) {
				break;
			}
			heapArray[idx] = heapArray[largerChildIdx];
			idx = largerChildIdx;
		}
		
	}

	public void displayHeap() {
        System.out.println("Heap Array: ");
        for(int m = 0; m < currentSize; m++) {
            if(heapArray[m] != null) {
                System.out.print( heapArray[m].getKey() + " ");
            }
            System.out.println();
            
            int nBlanks = 32;
            int itemsPerRow = 1;
            int column = 0;
            int j = 0; // current item
            
            String dots = "...............................";
            System.out.println(dots+dots);
            while(currentSize > 0) {
                if(column == 0) {
                    for(int k = 0; k < nBlanks; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(heapArray[j].getKey());
                j++;
                if(j == currentSize) {
                    break;
                }
                
                column++;
                // end of row
                if(column == itemsPerRow) {
                    nBlanks = nBlanks/2; // half the blanks
                    itemsPerRow = itemsPerRow * 2;     // twice the items
                    column = 0;
                    System.out.println();
                } else {
                    for(int k=0; k<nBlanks*2; k++) {
                        System.out.print(" ");
                    }
                }
                    
            }
            System.out.println("\n"+dots+dots);
        }
        
	}} 
        
    


