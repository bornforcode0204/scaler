import java.util.Scanner;

/**
 * Function-1
 */
public class Function_1 {


    /*
	Rule: 
		1. Write the function inside class Main{} and before
		public static void main(String args[]) {
		2. In order to call a function from main in ide we need to mention static 
		3. In Java, method and functions are same
		4. If we are not returning any value then return void is void
		5. We cannot print or store the function call having void as return type
	*/
	// Function Syntax
		/*
			output_type name(data_type input){
				// code to be executed
				return ___ ; value to return
			}
		*/
	
	// function that returns factorial of a number
	
	static int factorial(int N){ // N = 4
		int ans = 1;
		for(int i = 1; i <= N; i++){
			ans = ans*i;
		}
		return ans; // ans = 24
	}
	
	// static int sum(int a,int b) { // a[5], b[10]
	// 	return a+b; // 15
	// }
	
	static void maxofTwo(int a, int b){
		int max = 0;
		if(a > b){
			max = a;
		}else{
			max = b;
		}
		System.out.println(max);
		System.out.println("Inside function");
	}
	// static void sum(int a,int b) {
	// 	return a+b;
	// }
	
	static int extra(int a,int b) { // a[5], b[10]
		return a+b+10; // 25
	}
	
	static int square(int a) { // a = 3
		return a*a;  // 3*3  = 9
	}
	
	public static int add(int x , int y) {
		return x + y;
	}

    static int Sum(int a, int b){
        return a+b;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // ===> Write a function that return the sum of two numbers?
    
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // System.out.println(Sum(a, b));

    //===> Read 2 numbers and write a function which returns sum of 2 numbers.
		
		
		//Quiz 3:
		// sum(5,10);  // No output 

        /*
		//function calling : functionName(inputs)
		// Factorial
	
		*/
		
		// int x = factorial(5);
		// System.out.println(x); // 120
		
		
		// System.out.println(factorial(4)); // 24
		
		
		// Calculate nCr
		/*
		int n = scn.nextInt();
		int r = scn.nextInt();
		
		int nf = factorial(n);
		int rf = factorial(r);
		
		int nrf = factorial(n-r);
		
		System.out.println( nf / (rf*nrf) );
		*/
		
		
		
		
		// Read 2 numbers and write a function which returns sum of 2 numbers.
		
		/*
		//Quiz 3:
		// sum(5,10);  // No output 
		
		
		
		
		//Quiz 4:
		// System.out.println(sum(5,10)); // 15
		*/
		
		
		
		
		// Read 3 numbers and write a function which
		// returns sum of 3 numbers.
		
		// [Do it yourself]
		
		
		
		
		// Read 2 numbers and write a function which prints max of 2 numbers
		// int x = scn.nextInt();
		// int y = scn.nextInt();
		
		// System.out.println(maxofTwo(x, y)); // Wrong 
		// int z = maxofTwo(x,y); // Wrong 
		
		// maxofTwo(x,y); // 5
		
		// System.out.println("The End");
		
		// Write a function that will print the 
		// product of two numbers
		// [Do it yourself]
		
		
		
		
		// Quizzes 5-8:
		
		// System.out.print(sum(5,10));
	
		// int ans = extra(5,10); 
    	// System.out.println(ans);	//25
		
		
		// System.out.println(square(-6)); // 36
		
		int n1 = square(3); // n1= 9 
        //	add(9, 81)
// System.out.print(add(n1, square(9))); //90 



// Assignment Question 




// Predefined Functions

System.out.println(Math.max(5, 9)); // 9

System.out.println(Math.max(5.7, 9.8)); // 9.8

System.out.println((int)Math.ceil(8.9)); // 9
System.out.println(Math.ceil(7.00001)); // 8.0


System.out.println(Math.abs(-7));


// 5^7
System.out.println(Math.pow(5, 7));



    sc.close();
    
    }
    
}