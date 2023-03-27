import java.util.Scanner;

public class lab1Arrays {
  
    public static void main( String[] args )
    {
        int[] nums = new int[5];
        displayArray(readUserSequence(nums, 5), 5);
        isPalindrome(displayArray(readUserSequence(nums, 5), 5), 5);
        
    }

    public static int[] readUserSequence(int[] arrayToFill , int limit){
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
        return nums; 
     
    }


    public static int[] displayArray(int[] nums, int limit) {


        for(int i =0 ; i < nums.length;i++){
        
            System.out.print(nums[i]+" ");
          }
          return nums; 

    
        }
        
    public static boolean isPalindrome(int[] nums, int limit) {
        boolean palindrom = true;
    int i , j;
    for( i =0,j = nums.length-1 ;i<nums.length-1; i++,j--){
        if (nums[i]==nums[j])
          continue;
        else
          palindrom = false;
        break;
      }
    
      if (palindrom == true)
    System.out.println("it is a palindrome");
    else
    System.out.println(" it isn't a palindrome"); 
    return palindrom;
}
    }
   