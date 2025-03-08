
/*
 * 
 * ArrayList:=  An ArrayList is a resizable implementation of List Inteeface 
 *               Array List can Change its size Dynimically
 * 
 * When we create arraylist by default capacity is 10
 * 
 * 1.WAP Create a ArrayList
 * 2.Add Some element
 * 3.Find the value given by index number
 *4. Find the size of the arrayList
 *5. Print the values of ArrayList
 * 6. Check the number is exists are not
 * 7.Remove an element in arraylist
 *  8.Add an element to specified index number
 *              
 * 9. Replace an element at specified position
 *      
 */
import java.util.ArrayList;
public class FirstArrayList {

    public static void main(String[] args) {
        /*
         *1. Creation Of Array List
         */
        ArrayList<Integer> list =new ArrayList<>();
		
		/*
		 *2. Add numbers in the list
		 */
		list.add(1);//0
		list.add(2);//1
		list.add(5);//2
		/*
		 * 3.Find the value of given by index number
		 */
		System.out.println("The First Index(0th) of Array List = "+list.get(0));//1
		System.out.println("The Third Index (2nd) Of Array List is = "+list.get(2));//5
		
		/*
		 * 4. Find the size of the ArrayList
		 * 
		 */
		System.out.println("The Size Of the Array List is = "+list.size());//3
		
		
		/*
		 *5. Print the value of the Arraylist
		 */
		System.out.println("The Elements of the Arraylist Are ");
		for(int x:list) {
			System.out.println(x);
		}
		
		
		/*
		 *6. Check the number exists in list or not
		 */
		System.out.println(list.contains(1));//true
		System.out.println(list.contains(3));//false



        /*
         *7. Remove the item or element using
         * remove method
         * list.remove(index number)
         * 
         */
  
        list.remove(1);//removes element 2 
        list.remove(Integer.valueOf(5));//removes the value 
        System.out.println("Elements are = "+list);
        
        /*
         * 8.I want to add 50 value in the index number 1
         */
        list.add(1,50);
        System.out.println("Elements are = "+list);

       /*
        *9. set method replace the element at specified position
        */
        list.set(1,60);
        System.out.println("Elements are = "+list);


    }
}