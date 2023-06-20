import java.util.Scanner;

/**
 * AreaOfRectangle
 */
public class AreaOfRectangle {
    public static void main(String []args){
         // area of rectangle

        

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a length");
         int l = sc.nextInt();
         
         System.out.println("Enter width");
         int w = sc.nextInt();
 
         sc.close();

         int area = l * w;

         System.out.println(area);

    }
}