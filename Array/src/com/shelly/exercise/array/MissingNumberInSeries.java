package com.shelly.exercise.array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInSeries {
/**
 * This is one of the most simple array problems you will see, mostly asked in a telephonic round of Interview. You have given an 
 * integer array which contains numbers from 1 to 100 but one number is missing, you need to write a Java program to find that missing number
 *  in an array. You cannot use any open source library or Java API method which solves this problem. One trick to solve this 
 *  problem is to calculate sum of all numbers in the array and compare with expected sum, the difference would be the missing number.
 *  Read more: https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz5Kmfgofdb
 * @param args
 */
	public static void main(String[] args) {
		int[] series= {1,2,3,4,6,7,8,9,10};
		int sum=0;
		int sumOfGivenSeries=0;
	    int missingNo=0;
	    
	    try {
				//sum of the 1 to 10 series numbers.
				/* I Method::
				 * 
				 * for (int i=1;i<=10;i++)
				{
					sum+=i;
				}*/
				
			   	//or II Method::The formula is n*(n+1)/2 but it cannot be used if the array contains more than one missing numbers or if the array contains duplicates.
		       //Read more: https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz5KmjTOhZT
				int n=10;
				
				sum=(n*(n+1))/2;
				
		       System.out.println("the sum of 1 to 10 nos is ="+sum);
		
		       //Sum of the given series
		       for(int i=0;i<series.length;i++)
		       {
		    	   sumOfGivenSeries+=series[i];
		       }
		       
		       missingNo= sum-sumOfGivenSeries;
		       
		       System.out.println("The missinh no is="+missingNo);
		       
		       //Calling Mehod III
		       printMissingNumber(new int[]{1,2,3,6,7,8}, 10);
		      	
		} catch(Exception e)
	    {
			e.printStackTrace();
	    }
	    finally {
			// TODO: handle finally clause
		}
	}
	 // III Method:: A general method to find missing values from an integer array in Java. 
    //This method will work even if array has more than one missing element. 
    //Read more: https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz5KnSWJPPW
    
    private static void printMissingNumber(int[] numbers, int count)
    { 
 	   int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count); 
        for (int number : numbers) {
        	bitSet.set(number - 1);
        	}
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count); 
        int lastMissingIndex = 0; 
        for (int i = 0; i < missingCount; i++) 
        {
     	   lastMissingIndex = bitSet.nextClearBit(lastMissingIndex); System.out.println(++lastMissingIndex); 
     	   } 
       }
}
