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
		
	    ScanArray(array,Input);
		
		OptimizedBubbleSort(array);

        PrintArray(array);
	}
	public static void ScanArray(int[] array,Scanner Input){
	    for(int x = 0 ; x < array.length ; x++)
	        array[x] = Input.nextInt();
	}
	public static int OptimizedBubbleSort(int[] array)
	{
	       boolean Switch;
    	    for(int x = 0 ; x < array.length ; x++)
    	{
    	        Switch = false;
    	    for(int y = 0 ; y < array.length - x  ; y++)
    	    {
    	      if(array[x] < array[y]){
    	         Switch = true;
    	         InterchangeValues(array,x,y);
    	     }
    	    }
    	    if(Switch==false)
    	        return -1;
    	}
        return -1;
    }
    public static void PrintArray(int[] array){
	    for(int x = 0 ; x < array.length ; x++)
	        System.out.print(array[x] + " " );
	}
	
    public static void InterchangeValues(int[] array ,int x ,int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
