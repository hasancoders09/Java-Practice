/******************************************************************************

Name Of Program: Print even number form m to n number

Requerments:
1. Print sum of all the numbers from 1 to 10.
2. Print sum of all the numbers form m to n.
3. Print sum of all the even numbers from m to n.
4. Print sum of all the odd numbers from m to n.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //Print sum of all the numbers from 1 to 10.
		int sum = 0;
		for(int i = 1; i <= 10; i++){
		    sum = sum + i;
		}
		System.out.println("The 1 to 10 sum is: "+sum);
		
		//Print sum of all the numbers form m to n.
		Scanner input = new Scanner(System.in);
		int sumUser = 0;
		int evenSum = 0;
		int oddSum = 0;
		int m, n;
		System.out.print("Enter initial number:");
		m = input.nextInt();
		
		System.out.print("Enter final number:");
		n = input.nextInt();
		for(int j = m; j<=n; j++ ){
		    sumUser = sumUser + j;
		    //Even number Sum condition
		    if (j%2==0){
		        evenSum = evenSum + j;
		    } 
		    // Odd number sum condition
		    if (j%2!=0){
		        oddSum = oddSum + j;
		    } 
		}
		
		System.out.println("The m to n number sum is: "+sumUser);
		System.out.println("The m to n even number sum is: "+evenSum);
		System.out.println("The m to n odd number sum is: "+oddSum);
		
	}
}

