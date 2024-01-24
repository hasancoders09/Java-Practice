// Operator	Example	Same As
//   =	    x = 5	x = 5	
//   +=	    x += 3	x = x + 3	
//   -=	    x -= 3	x = x - 3	
//   *=	    x *= 3	x = x * 3	
//   /=	    x /= 3	x = x / 3	
//   %=	    x %= 3	x = x % 3

/*These are Operator used for advanced or binary code condition operation*/
// &=	x &= 3	x = x & 3	(Bitwise AND assignment)
// |=	x |= 3	x = x | 3	(Bitwise OR assignment)
// ^=	x ^= 3	x = x ^ 3	(Bitwise XOR assignment)
// >>=	x >>= 3	x = x >> 3	(Right shift assignment)
// <<=	x <<= 3	x = x << 3  (Left shift assignment)



public class Main {

public static void main(String[] args) {

  //Declare Veriable & primary value
  int $num;
  
  //Output data
  //Assignment Operator is:
  $num = 5; //The primary value is 5
  System.out.println("Using Assignment Operator value is: "+ $num);
  
  //Addition Assignment Operator
  $num += 3;// $num = 5+3=8
  System.out.println("Addition Assignment Operator Value is: "+ $num);
  
  //Subtraction Assignment Operator
  $num -= 2; // $num = 8-2=6
  System.out.println("Subtraction Assignment Operator Value is: "+ $num);
  //Multiplication Assignment Operator
  $num *= 3;// $num = 6*3=18
  System.out.println("Multiplication Assignment Operator value is: "+ $num);
  
  //Division Assignment Operator
  $num /= 2;// $num = 18/2=9
  System.out.println("Division Assignment Operator value is: "+ $num);
  
  //Modulus Assignment Operator
  $num %= 4; //$num = 9%4= 1
  System.out.println("Modulus Assignment Operator value is: "+ $num);

}   
}

