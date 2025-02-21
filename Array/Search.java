import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr []={1,2,3,4,5};
        System.out.println("Enter the element to be serach");
        int n=sc.nextInt();

        //logic
        for(int i=0;i<arr.length;i++){
            if (arr[i]==n) {
            System.out.println(n +" is found at "+  i);
                
            }
        }

        
    }
}