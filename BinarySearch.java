/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner Input = new Scanner(System.in);
	    int length = Input.nextInt();
	    int[] array = new int[length];
	    for(int x = 0 ; x < array.length ; x++)
	        array[x] = Input.nextInt();
	   System.out.println("enter the amount you want to search");
	   int value = Input.nextInt();
	    int result = binarySearch(array,0,array.length,value);
	    if(result == -1)
	        System.out.println("Element not found");
	    else
	        System.out.println("Element found at " + result + " index");
	}
	 static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then it can only 
            // be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present in right 
            // subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present in array 
        return -1; 
    } 
}
