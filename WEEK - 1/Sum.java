//sum of numbers 


import java.util.Scanner;

class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	System.out.print("Please enter the number: ");
        int n = sc.nextInt();

        System.out.println(n * (n + 1) / 2);
    }
}
