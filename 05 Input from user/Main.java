//Call "Scanner" class from Java library
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
  //Declare the "Scanner" class
  Scanner input = new Scanner(System.in);
  int number;
  System.out.print("Enter a number: ");
  //Call interger type data
  number = input.nextInt();
  System.out.println("Your entered number is: "+ number);

}   
}
