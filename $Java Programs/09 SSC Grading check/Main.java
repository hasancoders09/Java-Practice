/* ===================== SSC Grading check program ================== */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner $inputMark = new Scanner(System.in);
        int $mark;
        System.out.print("Enter your makr: ");
        $mark = $inputMark.nextInt();
        if($mark <= 100 && $mark >=80){
            System.out.println("Congratulations! You got A+");
        }
        else if($mark <= 79 && $mark >= 70){
            System.out.println("Congratulations! You got A");
        }
        else if($mark <= 69 && $mark >= 60){
            System.out.println("Congratulations! You got A-");
        }
        else if($mark <= 59 && $mark >= 50 ){
            System.out.println("Congratulations! You got B");
        }
        else if($mark <= 49 && $mark >= 40){
            System.out.println("Congratulations! You got C");
        }
        else if($mark <= 39 && $mark >= 33){
            System.out.println("Congratulations! You got D");
        }
        else if($mark < 33){
            System.out.println("Sorry! You are Fail");
        }
        else{
            System.out.println("invalid mark");
        }
    }
}

