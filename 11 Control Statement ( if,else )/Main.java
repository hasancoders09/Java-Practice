/*==================Control Statement, ( if,else ) Statement=================
Simple if statement
if-else statement
if-else-if ladder
Nested if-statement

========================================================*/
public class Main{
public static void main (String[] args) {
    int $num = 5;
    
    //if statement
    if($num > 0){
        System.out.println("This 'if' statement is true");
    }
    
    //if-else statement
    int $num_2 = 9;
    if ($num_2 != 9){
        System.out.println("The Condition is true");
    }
    else{
        System.out.println("The Condition is false");
    }
    
    //if-else-if statement
    int $num_3 = 10;
    if($num_3 == 12){
        System.out.println("The 1st answer is correct");
    }
    else if($num_3 == 10){
        System.out.println("The 2nd answer is correct");
    }
    else if($num_3 == 0){
        System.out.println("The 3rd answer is correct");
    }
    else{
        System.out.println("Answer is incorrect");
    }
    
    //Nested if-statement
    //In nested if-statements, the if statement can contain a if or if-else statement inside another if or else-if statement.
    
    int $num_4 = 3;
    if($num_4 > 5){
        System.out.println("The 1st statement is true");
    }
    if($num_4 < 2){
        System.out.println("The 2nd statement is true");
    }
    else{
        System.out.println("All statement is false");
    }
    
}
}
