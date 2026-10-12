//Largest of two numbers 


import java.util.Scanner;

	class Largest{
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Please enter the numbers: ");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();

	
	if( n1 > n2)
	    System.out.print("The " +n1+ " is Largest number");

	else if (n2 > n1)
	    System.out.println(n2 + " is the largest number.");

         else 
            System.out.println("Both numbers are equal.");
}
}