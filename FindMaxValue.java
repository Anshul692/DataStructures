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
	int[] Array = new int[length];
	
	ScanArray(Array,Input);
	
	System.out.println("Element having largest value is " + FindMaxElement(Array));
	}
	public static void ScanArray(int[] Array,Scanner Input)
	{
	    for(int x = 0 ; x < Array.length ; x++)
	    Array[x] = Input.nextInt();
	}
	public static int FindMaxElement(int[] Array)
	{
	    int MaxValue = Array[0];
	    for(int x = 0 ; x < Array.length ; x++)
	        if(MaxValue < Array[x])
	            MaxValue = Array[x];
	   return MaxValue;
	}
}
