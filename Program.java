//1. Write a program to find the sum 
//of even numbers between 25 to 51.
//
//By Subhrojeet Dutta
package com.anudip.Test;

public class Program {
	public static void main(String args[])
	{
//		Here are the Start and End
	int x=25;
	int y=51;
//	Here the Sum of Even Numbers is saved
	int sum=0;
//	Loop For iterating over All the Numbers
	for (int i=x;i<=y;i++)
		{
//		Checking Even Numbers
			if (i%2==0)
				sum+=i;
		}
//	Printing The Sum
	System.out.println("The Sum of Even Numbers is "+sum);
}
	}
