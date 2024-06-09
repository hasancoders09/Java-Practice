/******************************************************************************

Name Of Program: Series number calculattion.

Requerments:
1. 1 + 2 + 3 +...+n 
2. 1 + 3 + 5 +...+n
3. 1.5 + 2.5 + 3.5 +...+n 
4. 1^2 + 2^2 3^2 +...+n^2
5. 1 × 2 × 3 ×...×n
6. 1 × 3 × 5 ×...×n
7. 1.5 × 2.5 × 3.5 ×...×n
8. 1^2 × 2^2 × 3^2 × 4^2 ×...× n^2
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1 + 2 + 3 +...+n 
		int n, sum=0;
		System.out.print("Enter the last number: ");
		n = input.nextInt();
		System.out.print("The List of number:");
		for (int i = 1; i<=n; i=i+1){
		    sum = sum + i;
		    System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("The sum of 1st series: " +sum);
		System.out.println();
		
        //1 + 3 + 5 +...+n
		int sum2=0;
		System.out.print("The List of number:");
		for (int j = 1; j<=n; j=j+2){
		    sum2 = sum2 + j;
		    System.out.print(" "+j);
		}
		System.out.println();
		System.out.println("The sum of 2nd series: " +sum2);
		System.out.println();
		
        //1.5 + 2.5 + 3.5 +...+n
		double sum3=0;
		System.out.print("The List of number:");
		for (double k = 1.5; k<=n; k=k+1){
		    sum3 = sum3 + k;
		    System.out.print(" "+k);
		}
		System.out.println();
		System.out.println("The sum of 3rd series: " +sum3);
		System.out.println();
		
        // 1^2 + 2^2 3^2 +...+n^2
// 		int sum4=0;
// 		System.out.print("The List of number:");
// 		for (int l = 1^2; l<=n; l=l+1){
// 		    sum4 = sum4 + l^2;
// 		    System.out.print(" "+l);
// 		}
// 		System.out.println();
// 		System.out.println("The sum of 4rd series: " +sum4);
// 		System.out.println();
	}
}

