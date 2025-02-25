

/*
 * WAP Sort an Array
 * 
 */


import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int a[]={10,11,1,2,45,32};

        /*
         * Logic
         */
        for(int i=0;i<a.length;i++){

        for(int j=i+1;j<a.length;j++){
            if (a[i]>a[j]) {     //if(a[i]<a[j])
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;   
            }    
        }

        }

        System.out.println("Sorted Array is = "+Arrays.toString(a));

    }
}