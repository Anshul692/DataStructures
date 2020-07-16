/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	 Scanner Input = new Scanner(System.in);
	 int length = Input.nextInt();
	 int[] Array = new int[length];
     for(int x = 0 ; x < Array.length ; x++)
        Array[x] = Input.nextInt();
     
     int[] ArrayCopy = Array.clone();
        
    System.out.println("Sorting array using predefined method \"Arrays.sort\" ");
    
    Arrays.sort(Array);
    for(int x = 0 ; x < Array.length ; x++)
        System.out.print(Array[x] + " ");
   
    System.out.println();
    
    System.out.println("sorting array using Bubble sort");
	
	BubbleSort(ArrayCopy);
	
	for(int x = 0 ; x < Array.length ; x++)
        System.out.print(Array[x] + " ");
	    
	}
	
	public static void BubbleSort(int[] Array){
	
    	for(int x = 0 ; x < Array.length ; x++)
            for(int y = 0 ; y < Array.length ; y++)
            if(Array[x]<Array[y])
                SwitchValues(Array,x,y);
    }
    
	public static void SwitchValues(int[] Array,int x,int y){
	    int temp = Array[x];
	    Array[x] = Array[y];
	    Array[y] = temp;
	}
}
