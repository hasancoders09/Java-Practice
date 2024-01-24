/* ===============  Celsius to Fahrenheit ================ */

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double $celsius, $result;
        
        System.out.print("Enter the celsius temperature: ");
        $celsius = input.nextDouble();
        //C 2 F formula (celsius * 9)/5 + 32
        $result =   ($celsius * 9)/5 + 32;
        
        System.out.println("The Fahrenheit temperature is: " + $result);
    }
}
