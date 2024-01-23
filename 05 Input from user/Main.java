// nextBoolean()	Reads a boolean value from the user
// nextByte()	Reads a byte value from the user
// nextDouble()	Reads a double value from the user
// nextFloat()	Reads a float value from the user
// nextInt()	Reads a int value from the user
// nextLine()	Reads a String value from the user
// nextLong()	Reads a long value from the user
// nextShort()	Reads a short value from the user



import java.util.Scanner;

public class Main {

public static void main(String[] args) {
  //Declare the "Scanner" class
  Scanner $input = new Scanner(System.in);
  Scanner $nameInput = new Scanner(System.in);
  //Declare Veriable
  int number;
  String name;
  
  //Massage for Input data
  System.out.print("Enter your age: ");
  //Call interger type data
  number = $input.nextInt();
  

  System.out.print("Enter your Name: ");
  //Call String type data
  //"next" is for only one word & "nextLine" For multiple word list or full input
  name = $nameInput.nextLine();
  
  //Output data
  System.out.println("Welcome "+ name);
  System.out.println("Your age is: "+ number);
  
  

}   
}

