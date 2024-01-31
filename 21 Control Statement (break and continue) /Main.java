/*================================break and continue statement===============================*/
public class Main
{
	public static void main(String[] args) {
		for(int $num = 1; $num <= 100; $num++){
		    if($num == 10)break;//It's break the loop in 10
		    System.out.println("break example: "+$num);
		}
		for(int $num = 1; $num <= 12; $num++){
		    if($num == 10)continue;// It's continue the loop 10
		    System.out.println("continue example"+$num);
		}
		
	}
}

