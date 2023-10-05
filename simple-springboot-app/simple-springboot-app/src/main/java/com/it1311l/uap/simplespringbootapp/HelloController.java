package com.it1311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello World";
	}
		
	@GetMapping("/sort")
	public int[] sortInteger() {
	    int[] numbers = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};
	    bubbleSortDescending(numbers);
	    return numbers;
	}

	// Bubble Sort logic to sort integers in descending order
	private void bubbleSortDescending(int[] arr) {
	    int n = arr.length;
	    boolean swapped;
	    do {
	        swapped = false;
	        for (int i = 1; i < n; i++) {
	            if (arr[i - 1] < arr[i]) {
	                // Swap arr[i-1] and arr[i]
	                int temp = arr[i - 1];
	                arr[i - 1] = arr[i];
	                arr[i] = temp;
	                swapped = true;
	            }
	        }
	        n--;
	    } while (swapped);
	}
}
