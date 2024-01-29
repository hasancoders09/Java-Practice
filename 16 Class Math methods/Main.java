/*
Java Math Methods
The java.lang.Math class contains various methods for performing basic numeric operations such as the logarithm, cube root, and trigonometric functions etc. The various java math methods are as follows:

======Basic Math methods========
Method	                Description
Math.abs()	            It will return the Absolute value of the given value.
Math.max()	            It returns the Largest of two values.
Math.min()	            It is used to return the Smallest of two values.
Math.round()	          It is used to round of the decimal numbers to the nearest value.
Math.sqrt()	            It is used to return the square root of a number.
Math.cbrt()	            It is used to return the cube root of a number.
Math.pow()	            It returns the value of first argument raised to the power to second argument.
Math.signum()	          It is used to find the sign of a given value.
Math.ceil()	            It is used to find the smallest integer value that is greater than or equal to the argument or mathematical integer.
Math.copySign()	        It is used to find the Absolute value of first argument along with sign specified in second argument.
Math.nextAfter()	      It is used to return the floating-point number adjacent to the first argument in the direction of the second argument.
Math.nextUp()	          It returns the floating-point value adjacent to d in the direction of positive infinity.
Math.nextDown()	        It returns the floating-point value adjacent to d in the direction of negative infinity.
Math.floor()	          It is used to find the largest integer value which is less than or equal to the argument and is equal to the mathematical integer of a double value.
Math.floorDiv()	        It is used to find the largest integer value that is less than or equal to the algebraic quotient.
Math.random()	          It returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
Math.rint()	            It returns the double value that is closest to the given argument and equal to mathematical integer.
Math.hypot()	          It returns sqrt(x2 +y2) without intermediate overflow or underflow.
Math.ulp()	            It returns the size of an ulp of the argument.
Math.getExponent()	    It is used to return the unbiased exponent used in the representation of a value.
Math.IEEEremainder()	  It is used to calculate the remainder operation on two arguments as prescribed by the IEEE 754 standard and returns value.
Math.addExact()	        It is used to return the sum of its arguments, throwing an exception if the result overflows an int or long.
Math.subtractExact()	  It returns the difference of the arguments, throwing an exception if the result overflows an int.
Math.multiplyExact()	  It is used to return the product of the arguments, throwing an exception if the result overflows an int or long.
Math.incrementExact()	  It returns the argument incremented by one, throwing an exception if the result overflows an int.
Math.decrementExact()	  It is used to return the argument decremented by one, throwing an exception if the result overflows an int or long.
Math.negateExact()	    It is used to return the negation of the argument, throwing an exception if the result overflows an int or long.

Math.toIntExact()	      It returns the value of the long argument, throwing an exception if the value overflows an int.
======Logarithmic Math Methods========
Method	            Description
Math.log()	        It returns the natural logarithm of a double value.
Math.log10()	      It is used to return the base 10 logarithm of a double value.
Math.log1p()	      It returns the natural logarithm of the sum of the argument and 1.
Math.exp()	        It returns E raised to the power of a double value, where E is Euler's number and it is approximately equal to 2.71828.
Math.expm1()	      It is used to calculate the power of E and subtract one from it.

======Trigonometric Math Methods=======
Method	            Description
Math.sin()	        It is used to return the trigonometric Sine value of a Given double value.
Math.cos()	        It is used to return the trigonometric Cosine value of a Given double value.
Math.tan()	        It is used to return the trigonometric Tangent value of a Given double value.
Math.asin()	        It is used to return the trigonometric Arc Sine value of a Given double value
Math.acos()	        It is used to return the trigonometric Arc Cosine value of a Given double value.
Math.atan()	        It is used to return the trigonometric Arc Tangent value of a Given double value.

======Hyperbolic Math Methods===========
Method	            Description
Math.sinh()	        It is used to return the trigonometric Hyperbolic Cosine value of a Given double value.
Math.cosh()	        It is used to return the trigonometric Hyperbolic Sine value of a Given double value.
Math.tanh()	        It is used to return the trigonometric Hyperbolic Tangent value of a Given double value.

======Angular Math Methods===============
Method	            Description
Math.toDegrees	    It is used to convert the specified Radians angle to equivalent angle measured in Degrees.
Math.toRadians	    It is used to convert the specified Degrees angle to equivalent angle measured in Radians.
*/

public class Main{
    public static void main(String[] args){
        int $num_1 = 15, $num_2 = 25, $result;
        //Max Method
        $result = Math.max($num_1, $num_2);
        System.out.println("Max value: " + $result);
        
        //Min method 
        $result = Math.min($num_1, $num_2);
        System.out.println("Min value:" + $result);
        
        //Absolute method
        $result = Math.abs($num_1);
        System.out.println("Absolute value: " + $result);
        
        //Power method
        double $power;
        $power = Math.pow(2,3);
        System.out.println("Power value: " + $power);
        
        //round method
        double $round;
        $round = Math.round(10.51);
        System.out.println("Round value: " + $round);
        
        
    }
}
