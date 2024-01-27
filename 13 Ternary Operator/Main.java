/*===========================Ternary Operator============================
The meaning of ternary is composed of three parts. The ternary operator (? :) 
consists of three operands. It is used to evaluate Boolean expressions. 
The operator decides which value will be assigned to the variable. 
It is the only conditional operator that accepts three operands. 
It can be used instead of the if-else statement. 
It makes the code much more easy, readable, and shorter.
=========================================================================*/

/* ===================== Find Large number program ========================= */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner $inputNum = new Scanner(System.in);
		int $num_1, $num_2;
		System.out.print("Enter two number: ");
		$num_1 = $inputNum.nextInt();
		$num_2 = $inputNum.nextInt();
		
		int $large = ($num_1 > $num_2) ? $num_1 :$num_2;
		System.out.print("Large number is: "+ $large);
	}
}

