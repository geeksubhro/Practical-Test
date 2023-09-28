//By Subhrojeet Dutta
package com.anudip.Test;

import java.util.Scanner;


public class Program2 {
	//here are the questions too choose from
	static void call()
	{
		System.out.println("Choose From the Following:");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Change Numbers");
		System.out.println("6. Exit");
		System.out.println("Enter Your Choice :");
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		call();
		//this x will decide which case should be choosen
		int x=sc.nextInt();
		while(true) 
		{
			switch(x)
			{
			case 1:
				//this where addition takes place
				System.out.println("The Sum of Two Numbers is :"+(a+b));
				break;
			case 2:
				//this where Substraction takes place
				System.out.println("The Difference of Two Numbers is :"+(a-b));
				break;
			case 3:
				//this where Multiplication takes place
				System.out.println("The Multiplication of Two Numbers is :"+(a*b));
				break;
			case 4:
				//this where Division takes place
				System.out.println("The Division of Two Numbers is :"+(a/b));
				break;
			case 5:
				//Here You can change the numbers
				System.out.println("Enter Two Numbers :");
				a=sc.nextInt();
				b=sc.nextInt();
				break;
			case 6:
				//this where the program takes a exit
				sc.close();
				System.exit(0);
				default:
					System.out.println("Wrong User Input");
			}
			call();
			x=sc.nextInt();
		}

}
}
//2. Write a program to Menu driven program using 
//switch statement ( Find addition, subtraction,
//		multiplication and division of to integer numbers )
