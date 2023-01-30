package javaworkshop;

import java.util.*;

public class Week3 {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 15; i+= 3) {
			System.out.println(i);
		}
		
		//How do we make a for-loop that increments the value by 1 i such that i = 10?

		for(int i = 0; i <= 10; i++) {
		  System.out.println(i);
		}
		
		int digitSum1 = digitSum(264);
		
		System.out.println(digitSum1);
		
	
		//int[] numbers = {1,2,3,4,5};
		
		//int nums[] = {1,2,3,4,5}; 
		
		int[] nums = new int[5];
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Fayaz car");
		cars.add("Melly car");
		cars.add("Ning car");
		
		System.out.println(cars);
		
		cars.remove(0);
		
		cars.add(1, "Fayaz car");
		
		System.out.println(cars);
		
		cars.clear();
		
		System.out.println(cars);
		
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		matrix[1][1] = 99;
		
		System.out.println(Arrays.toString(matrix[1]));
		
		System.out.println(matrix.length);
		
		int[] odds = {1,3,5,7};
		int[] evens = {0,2,4,6};
		
		int totalLength = odds.length + evens.length;
		
		int[] combo = new int[totalLength];
		
		System.out.println(Arrays.toString(combo));
		
		int p1 = 0;
		int p2 = 0;
		
		for (int i = 0; i < combo.length; i++) {
			if (i % 2 == 0) {
				combo[i] = evens[p1];
				p1++;
			} else if (i % 2 == 1) {
				combo[i] = odds[p2];
				p2++;
			}
		}
		
		System.out.println(Arrays.toString(combo));
	}
	
	public static int sumTwo(int num1, int num2) {
		int sum = num1 + num2;
		
		return sum;
	}
	
	// Q1. Write a method named digitSum in java that accepts an integer 
	//     as a parameter and returns the sum of the digits of that number.

	public static int digitSum(int num) {
		int sum = 0;
		int digit = 0;
		
		while (num > 0) {
			//Get the last digit by taking modulus 10 of the number
			digit = num % 10;
			System.out.println("Last digit: " + digit);
			
			//Add the digit to the sum
			sum += digit;
			
			//Removing last digit from the current number
			System.out.println("Current number we're dividing by 10: " + num);
			num /= 10;
			
			System.out.println("Current sum: " + sum);

		}
		
		return sum;
	}
}
