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
		int sum4=0;
		System.out.print("The List of number:");
		for (int l = 1; l<=n; l=l+1){
		    sum4 = sum4 + l*l;
		    System.out.print(" "+l);
		}
		System.out.println();
		System.out.println("The sum of 4rd series: " +sum4);
		System.out.println();
		
        // 1 × 2 × 3 ×...×n
		int sum5=1;
		System.out.print("The List of number:");
		for (int m = 1; m<=n; m=m+1){
		    sum5 = sum5 * m;
		    System.out.print(" "+m);
		}
		System.out.println();
		System.out.println("The sum of 5rd series: " +sum5);
		System.out.println();
		
        // 1 × 3 × 5 ×...×n
		int sum6=1;
		System.out.print("The List of number:");
		for (int o = 1; o<=n; o=o+2){
		    sum6 = sum6 * o;
		    System.out.print(" "+o);
		}
		System.out.println();
		System.out.println("The sum of 6rd series: " +sum6);
		System.out.println();
		
        // 1 × 3 × 5 ×...×n
		int sum7=1;
		System.out.print("The List of number:");
		for (int o = 1; o<=n; o=o+2){
		    sum7 = sum7 * o;
		    System.out.print(" "+o);
		}
		System.out.println();
		System.out.println("The sum of 7rd series: " +sum7);
		System.out.println();
		
        // 1.5 × 2.5 × 3.5 ×...×n
		double sum8=1;
		System.out.print("The List of number:");
		for (double p = 1.5; p<=n; p=p+1){
		    sum8 = sum8 * p;
		    System.out.print(" "+p);
		}
		System.out.println();
		System.out.println("The sum of 8rd series: " +sum8);
		System.out.println();
		
        // 1^2 × 2^2 × 3^2 × 4^2 ×...× n^2
		int sum9=1;
		System.out.print("The List of number:");
		for (int q = 1; q<=n; q=q+1){
		    sum9 = sum9 * q*q;
		    System.out.print(" "+q);
		}
		System.out.println();
		System.out.println("The sum of 9rd series: " +sum9);
		System.out.println();
	}
}
