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
		
		//Bitwise Compliment (~)
		$result = ~2;
		/*=====================================
		$num_1:   17 = 10001
		2's Compliment    +1 or - (N + 1): -(17+1)
		$result        10010 = -18 
		=======================================*/
		System.out.println("Result of 'Bitwise Compliment': " + $result );
		
		//Bitwise left-shift
		$result = $num_1 << 2;
		/*=====================================
		Formula: result = a^n
		$num_1:     17  = 10001
		$result         1000100 = 68 
		=======================================*/
        System.out.println("Result of 'Bitwise left-shift': " + $result);	
        
        //Bitwise right-shift
        $result = $num_1 >> 2;
        /*======================================
        Formula: result = a/2^n
        $num_1      17 = 10001
        $result          00100 = 4
        ========================================*/
        System.out.println("Result of 'Bitwise right-shift': " + $result);
        
        //Unsigned Bitwise right-shift 
        $result = $num_1 >>> 2;
        /*======================================
        Formula: result = a/2^n
        $num_1      17 = 10001
        $result          00100 = 4
        ========================================*/
        System.out.println("Result of 'Unsigned Bitwise right-shift': " + $result);
        
        
	}
}
