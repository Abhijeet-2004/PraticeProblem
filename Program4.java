//Write a Java program to find the largest of three numbers using nested if-else statements.
import java.util.Scanner;
public class Program4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the three number:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if(num1>num2){
           if( num1>num3){
            System.out.println("Greatest number is:"+num1);
           }
           else{
            System.out.println("Greatest number is:"+num3);
           }
        }
        else{
            if(num2>num3){
                System.out.println("Greatest number is:"+num2);
            }
            else{
                System.out.println("Greatest number is:"+num3);
            }
        }
        sc.close();
    }
}