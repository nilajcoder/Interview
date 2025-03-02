
/*
 * Input -ITtech to Welcome
 * Output- Welcome to ITtech
 * 
 * 
 * public class ReverseSententenceByWord {

     public static String ReverseByWord(String str){
       
        String[] words=str.split(" ");
        String result=" ";

        for(int i=words.length-1;i>=0;i--){
            if (i==0) {
                result=result+words[i];
                
            } else{
                result=result+words[i]+" ";
            }
        }

          return result;
     }

    public static void main(String[] args) {
        String str="ITtech to Welcome";
        System.out.println(ReverseByWord(str));
    
    }
}
 */


   public class ReverseSententenceByWord {
       
    public static void main(String[] args) {

        String str="Java to Welcome";
        System.out.println("Enterted String is = "+str);
        String words[]= str.split(" ");
        System.out.println("Reverse Sentence Word by word ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
        
    }
       
    
   }