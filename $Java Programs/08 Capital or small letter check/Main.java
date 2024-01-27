/* ===================== Capital or small letter check program ================== */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner $inputChar = new Scanner(System.in);
        char $letter;
        System.out.print("Enter a letter: ");
        $letter = $inputChar.next().charAt(0);
        if($letter >= 'A' && $letter <= 'Z'){
            System.out.println("Capital letter");
        }
        else if($letter >= 'a' && $letter <= 'z'){
            System.out.println("Small letter");
        }
        else{
            System.out.println("Not a letter");
        }
    }
}
