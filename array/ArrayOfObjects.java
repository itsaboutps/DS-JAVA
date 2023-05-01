/**
 * Array of objects in java
 */
package array;

public class ArrayOfObjects {
    public static void main(String[] args) {
        /*
          1) data type[] arrName;

          2) datatype arrName[];

          3) datatype [] arrName;
         */
        // Students std = new Students(1712213051, "Prashant Singh");
        Students [] stdArr = new Students[5];
        stdArr[0] = new Students(1, "aman");
        stdArr[1] = new Students(1, "prashant");
        System.out.println(stdArr);


    }
}
class Students {
    public int roll_no;
    public String name;
    Students(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
