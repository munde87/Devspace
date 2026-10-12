//Psitive negative or zero


import java.util.Scanner;

	class PositiveOrNegative{
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter the number: ");
	int n = sc.nextInt();
	
	if(n==0)
	System.out.print("The entered number is Zero");

	else if(n>0)
	System.out.print("The entered number is Positive number");

	else
	System.out.print("The entered number is Negative number");

}
}