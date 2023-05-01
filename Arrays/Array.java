package Arrays;

public class Array {
    public static void main(String[] args) {
        Student[] arr;
        // allocating memory for 5 objects of type Student.
        arr = new Student[5];
        //Arrays of objects
        System.out.println(arr);
    }
}


// Java program to illustrate creating
//  an array of objects
 
class Student {
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
