/*========================Check Vowel or Consonant,(if, else) Statement =======================*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner $inputLetter = new Scanner(System.in);
        char $letter;
        System.out.print("Enter a single letter: ");
        $letter = $inputLetter.next().charAt(0);
        if($letter == 'a' | $letter == 'e' | $letter == 'i' | $letter == 'o' | $letter == 'u' |
        $letter == 'A' | $letter == 'E' | $letter == 'I' | $letter == 'O' | $letter == 'U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
