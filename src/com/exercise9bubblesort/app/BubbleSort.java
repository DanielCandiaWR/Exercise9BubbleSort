package com.exercise9bubblesort.app;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		final int ARRAY_SIZE = 100;
		
		int temp=0;
		
		int[] mainArray = new int[ARRAY_SIZE];
		int[] bubbleSortArray = new int[ARRAY_SIZE];
		
		Random randomNumbers = new Random(System.nanoTime());
		for(int i=0;i<ARRAY_SIZE;i++) {
			mainArray[i] = randomNumbers.nextInt(101);
			System.out.print(mainArray[i]+" ");
		}
		System.arraycopy(mainArray,0,bubbleSortArray,0,ARRAY_SIZE-1);
		for(int i=0;i<ARRAY_SIZE;i++) {
			for(int j=0;j<ARRAY_SIZE-1;j++) {
				if(bubbleSortArray[j]>bubbleSortArray[j+1]) {
					temp = bubbleSortArray[j+1];
					bubbleSortArray[j+1] = bubbleSortArray[j];
					bubbleSortArray[j] = temp;
				}
			}
		}
		//Display the bubble sort array
		System.out.println();
		for(int i=0;i<ARRAY_SIZE;i++) {
			System.out.print(bubbleSortArray[i]+" ");
		}
	}
}
