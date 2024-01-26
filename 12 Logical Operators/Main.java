/*===============================================================================
Operator	Name	        Description	                                                Example	
&& 	        Logical and	    Returns true if both statements are true	                x < 5 &&  x < 10	
|| 	        Logical or	    Returns true if one of the statements is true	            x < 5 || x < 4	
!	        Logical not	    Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)
====================================================================================*/

public class Main{
    public static void main(String[] args){
        int $num_1 = 10, $num_2 = 5;
        
        //Logical and &&
        if($num_1 > 0 && $num_2 == 5){
            System.out.println("\"Logical And\" && condition return 'True'");
        }
        else{
            System.out.println("\"Logical And\" && condition return 'False'");
        }
        
        //Logical or ||
        if($num_1 > 11 || $num_2 > 6){
            System.out.println("\"Logical Or\" || condition return 'True'");
        }
        else{
            System.out.println("\"Logical Or\" || condition return 'False' ");
        }
        //Logical not !
        if(!($num_2 < 6)){
            System.out.println("\"Logical Not\" ! condition return 'True'");
        }
        else{
            System.out.println("\"Logical Not\" ! condition return 'False' ");
        }
    }
}
