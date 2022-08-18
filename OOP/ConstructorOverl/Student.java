package Day7;

public class Student {
    int id;
    String name;
    Student(){
        System.out.println("This is a default constructor");
    }
    Student(int i, String n){
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("\nDefault CONSTRUCTOR values:\n");
        System.out.println("Student ID: " + s.id + "\nStudent Name:"+s.name);
        System.out.println("\nParameterized Constructor values:\n");
        Student student = new Student(10, "parth");
        System.out.println("Student Id" + student.id + "\nStudent Name: " + student.name);
    }
}
