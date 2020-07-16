import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]); // size of array

        int d = Integer.parseInt(nd[1]); // iterations to be made

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int temp;
       // for(int v1 = 0 ; v1 < a.length ; v1++)
      // d = 2 ;
       while(d > 0) {
           temp = a[0];

           for(int v2 = 1 ; v2 < a.length ; v2++){
               a[v2-1] = a[v2];
           }
           a[a.length-1] = temp;
        d--;
        }
        
        for(int v1 = 0 ; v1 < a.length ; v1++)
        System.out.print(a[v1] + " ");
       scanner.close();
    }
}