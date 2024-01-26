/*==================Relational Operator=================
Operator	Description	                Example
==	        Is Equal To	                3 == 5 returns false
!=	        Not Equal To	            3 != 5 returns true
>	        Greater Than	            3 > 5 returns false
<	        Less Than	                3 < 5 returns true
>=	        Greater Than or Equal To	3 >= 5 returns false
<=	        Less Than or Equal To	    3 <= 5 returns true

========================================================*/
public class Main
{
	public static void main(String[] args) {
		int $num_1 = 5, $num_2 = 9;
		System.out.println($num_1 == $num_2);//false
		System.out.println($num_1 != $num_2);//true
		System.out.println($num_1 > $num_2);//false
		System.out.println($num_1 < $num_2);//true
		System.out.println($num_1 >= $num_2);//false
		System.out.println($num_1 <= $num_2);//true
	}
}

