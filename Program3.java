//Write a Java program to calculate the average of a list of numbers using a do-while loop.
public class Program3 {
   public static void main(String[] args) {
    int nums[]={70,80,60,95,65,85,90};
    int sum=0;
    int i=0;
    do{
        sum+=nums[i++];

    }while(i<nums.length);

    System.out.println("Average of given nums is="+((float)sum/nums.length));
   } 
}
