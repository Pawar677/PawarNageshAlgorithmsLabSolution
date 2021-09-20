package com.greatlearning.com;
import java.util.Scanner;
public class MinimumNotes {
	private static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
// Get the number of denominations
		System.out.println("Enetr the Denominations:");
		int size= sc.nextInt();
// Allocates array to notes
		int notes[] = new int[size];
		int numNotes[] = new int[size];
// Get the Currency
		System.out.println("Enter the values of currencies :");
	for(int i =0; i<size ; i++) {
		notes[i] = sc.nextInt();
	}
// Sorting by Merge sort
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(notes, 0, notes.length-1);
// Sort array in descending order
	for(int i =0; i<size ; i++) {
			System.out.println(notes[i]);
		}
	       System.out.println("Enetr the Amounts to Pay :");
	       int amount = sc.nextInt();
// Pick notes
	for (int i =0; i< notes.length; i++) {
//To find out how many notes require (example: how many 2000 notes, 500 notes etc.)
		int n = (int) (amount/notes[i]);
		numNotes[i]= n;
// Remaining amount calculations
		amount = amount -(n * notes[i]);
	  if(i== notes.length-1 && amount != 0) {
		   System.out.println("It is not possible to pay.");
	     }
	  else if (i== notes.length-1 && amount == 0) {
		  for(int j=0; j< numNotes.length-1; j++){
			  System.out.println(notes[i]+ ":" +n);  
		 
		}
		 
	  }
	}
	
  }

}
