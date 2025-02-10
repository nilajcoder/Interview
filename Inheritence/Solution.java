
 class Student {
    String name ;
    int roll;
    String dept;

    public Student(String name,int roll,String dept){
        this.name=name;
        this.roll=roll;
        this.dept=dept;
    }
  

    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(dept);
    }

    
}


public class Solution {

    public static void main(String[] args) {
        Student s=new Student("Nil",1,"CSE");
        s.display();
        
    }
}