/*====================while vs do-while loop======================*/
/*=========================================
3 parts of (for loop)
1/ initialization
2/ Condition
3/ Increment/ decrement part
===========================================*/
public class Main{
    public static void main(String[] args){
        int x = 6;
        while(x<=5){
            System.out.println(x+" while loop");//it not run the first loop
        }
        int i = 6;
        do{
            System.out.println(i+" do while loop"); //it minimum run at first loop
            i++;
        }while(i<=5);
    }
} 
