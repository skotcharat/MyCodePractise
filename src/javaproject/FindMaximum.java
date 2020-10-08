package javaproject;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * 
 * @author student
 * Find Maximum
Write a method that returns the largest integer in the list.
You can assume that the list has at least one element.
 */

public class FindMaximum {
	
	
	public static void main(String[] args) {
		Integer dims[] = {8, 118, 16, 100};
		System.out.println(maximum(dims));	
	}
	
	public static Integer maximum(Integer[] list) {
		
//		Collection col = Arrays.asList(list);
//		Integer max = (Integer)Collections.max(col);
		
		// System.out.println(list.get(list.size() - 1));
		int max = list[0];
		
		for(int i = 0; i < list.length; i++) { // for (int i : list)
			if(list[i] > max) {
			      max = list[i];
			    }
		}

		return max;
		
		
		
		
		
		
		
		
	
		
	}
		
}

