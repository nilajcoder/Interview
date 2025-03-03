

/*
 * Frequency of elements in array in Java
 */


 public class FrequencyElement {
 
    public static void main(String[] args) {
        int arr[]={1,1,1,5,5,5,6,6,6,8,9,6,2};
        int visited=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=-1) {
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if (arr[i]==arr[j]) {
                        count++;
                        arr[j]=visited;
                        
                    }
                }
                System.out.println(arr[i]+"|"+count);
                
            }
        }
    }
 }