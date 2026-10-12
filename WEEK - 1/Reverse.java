// Reverse of number


import java.util.Scanner;

class Reverse{

	public static void  main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the any five integres: ");
	int n = sc.nextInt();
	int n2 = n;


	int d1 = n%10;
	n = n/10;

	int d2 = n%10;
	n = n/10;

	int d3 = n%10;
	n = n/10;

	int d4 = n%10;
	n = n/10;

	int d5 = n%10;
	n = n/10;

	int rev = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5 * 1;
        
	System.out.print("The Reverse of number is: " +rev);
}
}
