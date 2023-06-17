import java.util.Scanner;

/**
 * Function-1
 */
public class Function_1 {
    static int Sum(int a, int b){
        return a+b;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // ===> Write a function that return the sum of two numbers?
    
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(Sum(a, b));


    sc.close();
    
    }
    
}