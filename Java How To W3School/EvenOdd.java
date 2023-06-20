import java.util.Scanner;

/**
 * EvenOdd
 */
public class EvenOdd {
    public static void main(String []args){

         // checking number is even or odd

         

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a number");
         int a = sc.nextInt();
         sc.close();

         if(a % 2 == 0){
            System.out.println("Even");
         }else{
            System.out.println("Odd");
         }
    }
}