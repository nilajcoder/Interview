

public class MaxMin {

    public int max(int [] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
                
            }
        }
        return max;
    }

    public int min(int [] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
                
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr={20,10,30,5,45,500};
        MaxMin m1=new MaxMin();
        System.out.println("Lergest Element is "+m1.max(arr));
        System.out.println("Smallest Element is "+ m1.min(arr));
        
    }
}