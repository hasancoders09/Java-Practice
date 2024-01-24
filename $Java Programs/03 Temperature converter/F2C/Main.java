
/* =============== Fahrenheit to Celsius ================ */

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double $fahrenheit, $result;
        
        System.out.print("Enter the Fahrenheit temperature: ");
        $fahrenheit = input.nextDouble();
        //C 2 F formula (fahrenheit - 32) * 5/9
        $result =   ($fahrenheit - 32) * 5/9;
        
        System.out.println("The Celsius temperature is: " + $result);
    }
}
