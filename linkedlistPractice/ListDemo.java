package linkedlistPractice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// Demo for the LinkedList class
		
		LinkedList<String> staff = new LinkedList<String>();
		
		staff.add("EEEEE");
		staff.add("John");
		staff.add("Joe");
		staff.add("jidjgs");
		
		
		ListIterator<String> iterator = staff.listIterator();
		
		iterator.next();
		iterator.next();
		
		// Add more elements after second element 
		
		
		iterator.add("sfjksnd");
		iterator.add("jfbsek");
		
		iterator.next();
		
		
		// remove last traversed element 
		
		iterator.remove();
		
		
		// print all elements 
		
		System.out.println(staff);
		
		System.out.println("this is the end of the program");
		

	}

}
