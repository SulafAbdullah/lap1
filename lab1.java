import java.util.Scanner;

public class lab1 {
  
    public static void main( String[] args )
    {
        int[] nums = new int[5];
       nums = readUserSequence(nums, 5);
       displayArray(nums, 5);
       isPalindrome(nums, 5);

      
        
    }

    public static int[] readUserSequence(int[] arrayToFill , int limit){
        int[] nums = new int[5];
        Scanner scnr = new Scanner(System.in);
        for(int i = 0 ; i < nums.length; i ++){
          System.out.println("enter the "+(i+1)+" number: ");
          nums[i]= scnr.nextInt();
        }
        

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
   