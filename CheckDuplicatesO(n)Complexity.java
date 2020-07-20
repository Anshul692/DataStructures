/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] Array = new int[Input.nextInt()];
		ScanArray(Array,Input);
		CheckDuplicates(Array);
	}
	static void ScanArray(int[] Array){
 	    Scanner Input = new Scanner(System.in);
	    for(int i = 0 ; i < Array.length ; i++)
	       Array[i] = Input.nextInt();
	}
	static void CheckDuplicates(int[] Array){
	    HashSet Checker = new HashSet();
	    for(int i = 0 ; i < Array.length ; i++)
	    {
	        if(Checker.contains(Array[i]))
	           System.out.print(Array[i] + " ");
	        else if(Array[i]<=0)
	        System.out.print("zero or negative number found" + Array[i]);
	        else
	           Checker.add(Array[i]);
	    }
	}
}

