

/*
 * . Merge Two Arrays
Write a program to merge two arrays into a single array.
 */

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int a[]={1,2,3};//length 3
        int b[]={4,5,6};// length 3

        int c[]=new int[a.length + b.length]; //6

        System.out.println("First Array = "+Arrays.toString(a));
        System.out.println("Second Array = "+Arrays.toString(b));



        /*
         * 
         * Logic
         */
        for(int i=0;i<a.length;i++){
            c[i]=a[i]; //{1,2,3,0,0,0}
        }
        

        /* dry run 
         *
         * c[0+3]=b[0] c[3]=b[0] {1,2,3,4,0,0}
         *  c[1+3]=b[1]  c[4]=b[1] {1,2,3,4,5,0}
         * c[2+3]=b[2]   c[5]=b[2]  {1,2,3,4,5,6}
         */
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];  //b[i]=0
        }   

        System.out.println("Merge Two Array is = "+Arrays.toString(c));

    }
}