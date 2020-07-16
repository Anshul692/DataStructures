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
	    int trigger;
	    
	    ScanArray(array,Input);
	    
	    System.out.println("enter the value you want to search");
	    int value = Input.nextInt();
	    
	    trigger = LinearSearch(array,value);
	    if(trigger == -1)
	        System.out.print("Element not found");
	    else
	        System.out.print("Element found at " + trigger + " index");
	    
	}
	public static void ScanArray(int[] array,Scanner Input)
	{
	    for(int x = 0 ; x < array.length ; x++)
	        array[x] = Input.nextInt();
	}
	public static int LinearSearch(int[] array,int value){
	    int trigger = -1;
	    for(int x = 0 ; x < array.length ; x++)
	        if(value == array[x])
	            return x;
	    return -1;
	}
	
}
