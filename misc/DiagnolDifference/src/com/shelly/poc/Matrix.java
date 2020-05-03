package com.shelly.poc;

public class Matrix {
	
static int[][] matrixArray	=new int[][] {{11,2,4,0},{4,5,6,0},{10,8,-12,0},{1,1,1,1 }};

/**
 * [0,0][0,1][0,2]
 * [1,0][1,1][1,2]
 * [2,0][2,1][2,2]
 * 
 * 
 * 
 * @param arg
 */

 public static void main(String...arg) {
	 
	 int sumDiag1=0,sumDiag2=0;
	 
	 for(int i=0;i< matrixArray.length;i++) {
		 sumDiag1+=matrixArray[i][i];
		 sumDiag2+=matrixArray[i][matrixArray.length-1-i];
	}
	 System.out.println("First Diagonal sum="+sumDiag1);
	 System.out.println("Second Diagonal sum="+sumDiag2);
	 System.out.println("Final Answer="+Math.abs(sumDiag1-sumDiag2)); 
 }


}
