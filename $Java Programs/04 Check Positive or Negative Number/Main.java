/*==================Check Positive or Negative Number Program, ( if,else ) Statement==================*/
import java.util.Scanner;
public class Main{
public static void main (String[] args) {
    int $num;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a interger number: ");
    $num = input.nextInt();
    if($num > 0){
        System.out.println("This number is Positive");
    }
    else if($num < 0){
        System.out.println("This number is Negative");
    }
    else{
        System.out.println("Equal to Zero");
    }
}
}
