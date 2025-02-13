import java.util.Scanner;

public class GreatestNegetive {

    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       int [] arr={1,2,3,4,-2,-3,-5};
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            if (arr[i]>max) {
                max=arr[i];
                
            }
        }
       }
       System.out.println("Greatest Negative value "+max);


    }
}