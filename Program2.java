//Write a Java program to print the Fibonacci series up to a given number using a for loop.
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of fibbonacii number you want to print:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            if(i==0||i==1){
                System.out.print(i+" ");
                continue;
            }
            int sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
        sc.close();
    }
}
