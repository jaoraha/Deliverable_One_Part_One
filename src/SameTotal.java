import java.util.Scanner;

public class SameTotal {
	
	public static void main(String [] args) {
		
		//Outcome will be either true or false.
		boolean equal = true;	
        
		//Utilize scanner to obtain input from user.
		Scanner scnr = new Scanner(System.in);	
                
        //initialize integers
        int num1 = 0;	
        int num2 = 0;
        int a = 0;
        int b = 0;

        //Prompt user for input.
        System.out.println("To check if each corresponding place in two different numbers sums to the same total, please enter the first number: ");		
        num1 = scnr.nextInt();

        System.out.println("Now enter a second number with the same number of digits: ");	
        num2 = scnr.nextInt();

      
		//for loop checks if each corresponding place in two numbers sums to same total.
        for (int i = 0; i < String.valueOf(num1).length(); i++) {	
            a = (num1 % 10) + (num2 % 10);							
            num1 /= 10;
            num2 /= 10;
            b = (num1 % 10) + (num2 % 10);
            if (a != b) {
                    equal = false;
   }
  }		//Output true or false.
        System.out.println(equal);
        
        //Close scanner to avoid resource leak
        scnr.close();	
 }
}