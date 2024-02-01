/*========================Sum of odd number n to m =======================*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner $input = new Scanner(System.in);
        int n,m,$sum=0;
        System.out.print("Enter Starting number: ");
        n = $input.nextInt();
        System.out.print("Enter End number: ");
        m = $input.nextInt();
        for(int i = n; i<=m; i++){
            if(i%2 != 0){
                $sum = $sum + i;
            }
        }
        System.out.println("Result: " + $sum);
    }
}
