import java.util.Scanner;

/**
 * AddTwoNumbers
 */
public class AddTwoNumbers {
    public static void main(String args[]){
        // add to numbers

        int a = 4;
        int b = 6;
        int sum = a + b;
        System.out.println(sum);

        // add two number using user input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = sc.nextInt();
        
        System.out.println("Enter another number");
        int y = sc.nextInt();

        sc.close();

        int total = x + y;
        System.out.println("Sum of "+ x +" and "+ y +" = " + total);

    }
}