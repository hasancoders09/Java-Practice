/*=====Spelling of 0-9 number Program, ( switch ) Statement=====*/

/*
This is how it works:

The "switch" expression is evaluated once.
The value of the expression is compared with the values of each "case".
If there is a match, the associated block of code is executed.
The "break" and "default" keywords are optional, and will be described later in this chapter
keywords: switch, case, break, default
*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner $inputNum = new Scanner(System.in);
        int $num;
        System.out.print("Enter a number within 0-9: ");
        $num = $inputNum.nextInt();
        switch ($num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2: 
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4: 
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9: 
                System.out.println("Nine");
                break;
            default:
            System.out.println("Worng input");
        }
    }
}
