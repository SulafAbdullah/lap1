import java.util.Scanner;

public class lab1Arrays {
  

    public static void readUserSequence(int[] arrayToFill , int limit){
        int[] nums = new int[5];
        Scanner scnr = new Scanner(System.in);
        System.out.println("enter the first number: ");
        nums[0]= scnr.nextInt();
        System.out.println("enter the second number: ");
        nums[1]= scnr.nextInt();
        System.out.println("enter the third number: ");
        nums[2]= scnr.nextInt();
        System.out.println("enter the forth number: ");
        nums[3]= scnr.nextInt();
        System.out.println("enter the fifth number: ");
        nums[4]= scnr.nextInt();

     scnr.close();
    }
    public static void main( String[] args )
    {
        int[] nums = new int[5];
       readUserSequence(nums, 5);
    }


}