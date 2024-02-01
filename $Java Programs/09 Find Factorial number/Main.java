/*========================Find Factorial number =======================*/

import java.util.Scanner;
public class Main{
    public static void main(String[] arge){
        Scanner $input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n, $fact = 1;
        n = $input.nextInt();
        for(int i = 1; i <= n; i++){
            $fact = $fact*i; 
        }
        System.out.printf("Factorial of %d is: ", n);
        System.out.println($fact);
    }
}
