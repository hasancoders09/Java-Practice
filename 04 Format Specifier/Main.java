public class Main {

public static void main(String[] args) {
  
 /* DataType    Size        Range */
  
// byte         1 byte      from -128 to 127
byte $byteDtype = 5; 
System.out.printf("The byte Value is: %d\n", $byteDtype);
// Short        2 bytes     from -32,768 to 32,767
short $shortDtype = 70; 
System.out.printf("The short Value is: %d\n", $shortDtype);
// Integer      4 bytes     from -2,147,483,648 to 2,147,483,647
int $intDtype = 564; 
System.out.printf("The Integer Value is: %d\n", $intDtype);
// Long         8 bytes     from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
long $longDtype = 10284; 
System.out.printf("The long Value is: %d\n", $longDtype);
//FloatingPoint 4 bytes     6 to 7 decimal digits
float $floatDtype = 5.99f;  
System.out.printf("The float Value is: %.2f\n", $floatDtype);
//Double        8 bytes     15 decimal digits
double $doubleDtype = 5.99; 
System.out.printf("The double Value is: %.3f\n", $doubleDtype );
// Character    2 bytes     a character/letter or ASCII values
char $charDtype = 'M';      
System.out.printf("The char Value is: %c\n", $charDtype);
 // Boolean     1 byte      true or false values
boolean $booleanDtype = true;  
System.out.printf("The boolean Value is: %b\n", $booleanDtype);
// String
String $StringDtype = "Hello Mehedi Hasan";     
System.out.printf("The String Value is: %s\n", $StringDtype);

}   
}
