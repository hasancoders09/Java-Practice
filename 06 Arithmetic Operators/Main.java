// +	Addition	Adds together two values	x + y	
// -	Subtraction	Subtracts one value from another	x - y	
// *	Multiplication	Multiplies two values	x * y	
// /	Division	Divides one value by another	x / y	
// %	Modulus	Returns the division remainder	x % y	
// ++	Increment	Increases the value of a variable by 1	++x	
// --	Decrement	Decreases the value of a variable by 1	--x
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
  //Declare the "Scanner" class
  Scanner $input = new Scanner(System.in);
  //Declare Veriable
  int $num_1, $num_2, $result;
  
  //Massage for input first number
  System.out.print("Enter the first number: ");
  $num_1 = $input.nextInt();
  
  //Massage for input second number
  System.out.print("Enter the second number: ");
  $num_2 = $input.nextInt();
  
  //Print Extra Line
  System.out.println();
  //Output data
  //Addition condition is:
  $result = $num_1 + $num_2;
  System.out.println("Addition value is: "+ $result);
  
  //Subtraction condition is: 
  $result = $num_1 - $num_2;
  System.out.println("Subtraction value is: "+ $result);
  
  //Multiplication condtion is:
  $result = $num_1 * $num_2;
  System.out.println("Multiplication value is: "+ $result);
  
  //Subtraction condition is:
  //Change data type for floating point value
  double $resultFloat = (double)$num_1 / $num_2;
  System.out.println("Subtraction value is: "+ $resultFloat);
  
  //Modulas returns or remainder value condition is: 
  $result = $num_1 % $num_2;
  System.out.println("Remainder value is: "+ $result);
  
  //Incress number from $num_1
  $result = ++ $num_1;
  System.out.println("Incress from first number: "+ $result);
  
  //Decreases number from $num_1
  $result = -- $num_2;
  System.out.println("Decreases from secound number: "+ $result);

}   
}
