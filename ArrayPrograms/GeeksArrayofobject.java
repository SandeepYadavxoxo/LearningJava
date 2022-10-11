package ArrayPrograms;

class Student {

    public int id;
    public String name;

    public  void setData(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void display()
    {
        System.out.println("Student id is: "
                + id + " "
                + "and Student name is: "
                + name);
        System.out.println();
    }
}

public class GeeksArrayofobject {

    public static void main(String[] args) {


        // Declaring an array of student
        Student[] arr;

        // Allocating memory for 2 objects
        // of type student
        arr = new Student[2];

        // Creating actual student objects
        arr[0] = new Student();
        arr[1] = new Student();

        // Assigning data to student objects
        arr[0].setData(51, "Sandeep");
        arr[1].setData(52, "Mandeep");

        // Displaying the student data
        System.out.println(
                "Student data in student arr 0: ");
        arr[0].display();

        System.out.println(
                "Student data in student arr 1: ");
        arr[1].display();

    }

}
