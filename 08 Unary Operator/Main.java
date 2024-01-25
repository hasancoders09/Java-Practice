/* ============================== Unary Operator ========================= */


// Operator Name	    Symbol	    Description	                                    Example	        Equivalent Expression
// Unary Plus	           +	    It is used to represent the positive value.	    +a	            a
// Unary Minus	           -	    It is used to represent the negative value.	    -a	            -
// Increment Operator	   ++	    It increments the value of a variable by 1.	    ++a or a++	    a=a+1
// Decrement Operator	   --	    It decrements the value of a variable by 1.	    --a or a--	    a=a-1
//Logical Complement Operator	!	It inverts the value of a boolean variable.	!true	-
public class Main{
    public static void main(String[] args){
        int $num_1, $result;
        $num_1 = 5;
        //Unary Plus expression 
        $result = + $num_1;
        System.out.println("The unary plus example is: "  + $result);
        //Unary minus expression
        $result = - $num_1;
        System.out.println("The unary minus example is: " + $result);
        
        //Pre increment operator example, This will add the value before the next expression
        $result = ++ $num_1;
        System.out.println("The pre increment value is: " + $result);
        
        //Post increment operator example, This will add the value after the next expression
        $result = $num_1 ++;//Now the current value is 6
        $result = $num_1;//After post increment value is 7;
        System.out.println("The post increment value is: " + $result);
        
        //Pre decrement operator example, This will remove value before the next expression
        $result = --$num_1;//After pre decrement value is 7-1=6
        System.out.println("The pre decrement value is: "+ $result);
        
        //Post decrement operator example, This will remove value after the next expression
        $result = $num_1 --;//Now the current value is 6
        $result = $num_1; // After post decrement value is: 5;
        System.out.println("The post decrement value is: " +  $result);
    }
}
