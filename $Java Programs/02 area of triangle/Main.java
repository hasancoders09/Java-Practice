
/* ===============  Aria of Triangle ================ */


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double $base, $height, $result;
		
		System.out.print("Enter the triangle Base: ");
		$base = input.nextDouble();
		
		System.out.print("Enter the triangle Height: ");
		$height = input.nextDouble();
		
		//The formula aria of triangle is = 1/2 * base * height
		$result = 0.5 * $base * $height;
		
		System.out.println("The aria of triangle is: " + $result);
	}
}

