import java.util.Scanner;

//Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.
public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num>0) System.out.println("Entered number is positive");
        else if(num<0) System.out.println("Entered number is nege0tive");
        else System.out.println("Entered number is equal to zero");
        sc.close();
    }
}
