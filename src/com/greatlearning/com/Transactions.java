package com.greatlearning.com;
import java.util.Scanner;

public class Transactions 
 {
	private static Scanner sc= new Scanner(System.in);
    public static void main  (String [] args) 
    {
    // Get size of transactions from user
    	System.out.println("Enter the numbers of Transactions :");
    	int size = sc.nextInt();
        int transactions[]= new int[size];   // Allocate transaction size as provided
    	System.out.println("Enter the Transaction :");
    for(int i=0; i< size; i++)
         {   // Get the elements of transaction
    	    transactions[i]= sc.nextInt();
         }
        // Get the number of Targets
    	System.out.println("Enter the number of Targets :");
    	int numTargets = sc.nextInt();
   for(int i=0; i< numTargets; i++)
   {
    	System.out.println("Enter the Target:");
    	int target = sc.nextInt();
    	int sum =0;
     for(int j=0; j< transactions.length; j++) 
    	{
    		sum = sum + transactions[j];
    	    if(sum >= target) {
    	    	System.out.println("Target reached after " +( j + 1) + " transactions");
    	    	break;
    	    }
    	    if(j ==transactions.length-1 && sum< target) {
    	    	System.out.println("Target not reached.");
    	    }
     }
    }
  }
}
