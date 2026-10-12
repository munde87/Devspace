//Even od odd

import java.util.Scanner;

	class EvenOrOdd{
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter the number: ");
	int n = sc.nextInt();
	
	if(n % 2 == 0)
	System.out.print("The entered number is Even number");

	else
	System.out.print("The entered number is Odd number");

}
}