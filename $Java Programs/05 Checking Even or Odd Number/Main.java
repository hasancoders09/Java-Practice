
/*=====Check Even or Odd number Program, ( if,else ) Statement=====*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner $input = new Scanner(System.in);
        int $number;
        System.out.print("Enter a number: ");
        $number = $input.nextInt();
        
        if($number % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}