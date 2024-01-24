
/* ===============  Area of Circle ================ */



import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double $PI, $radius, $result;
        
        System.out.print("Enter the cricle radius: ");
        $radius = input.nextDouble();
        
        $PI = 3.1416;
        //Formula: πr^2
        $result = $PI * $radius * $radius;
        
        System.out.println("The area of circle is: ≈" + $result);
    }
}
