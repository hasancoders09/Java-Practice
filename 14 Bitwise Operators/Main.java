/******************************************************************************
===================== Bitwise Operators ======================

Operators	                    Symbol	    Uses
Bitwise AND	                    &	        op1 & op2
Bitwise inclusive OR	        |	        op1 | op2
Bitwise exclusive OR	        ^	        op1 ^ op2
Bitwise Compliment	            ~	        ~ op
Bitwise left shift	            <<	        op1 << op2
Bitwise right shift	            >>	        op1 >> op2
Unsigned Right Shift Operator	>>>         op >>>	number of places to shift

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int $num_1 = 17, $num_2 = 20, $result;
		
		//Bitwise And (&)
		$result = $num_1 & $num_2;
		/*=====================================
		$num_1: 17 = 10001
		$num_2: 20 = 10100
		$result      10000 = 16
		=======================================*/
		System.out.println("Result of 'Bitwise And': " + $result);
		
		//Bitwise Or (|)
		$result = $num_1 | $num_2;
		/*=====================================
		$num_1: 17 = 10001
		$num_2: 20 = 10100
		$result      10101 = 21
		=======================================*/
		System.out.println("Result of 'Bitwise Or': " + $result);
		
		//Bitwise ExOR (^)
		$result = $num_1 ^ $num_2;
		/*=====================================
		$num_1: 17 = 10001
		$num_2: 20 = 10100
		$result      00101 = 5
		=======================================*/
		System.out.println("Result of 'Bitwise ExOR': " + $result);
		
	}
}
