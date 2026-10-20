//Second Largest Number



import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        if ((a > b && a < c) || (a < b && a > c))
            System.out.println(a);
        else if ((b > a && b < c) || (b < a && b > c))
            System.out.println(b);
        else
            System.out.println(c);
 }
}
