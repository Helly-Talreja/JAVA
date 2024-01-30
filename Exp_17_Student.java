import java.util.Scanner;

class Student {
    // Attributes
    private int studentID;
    private String studentName;
    private double marksSubject1;
    private double marksSubject2;
    private double marksSubject3;

    // Member function to set data
    public void setData() {
        Scanner scen = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        studentID = scen.nextInt();

        scen.nextLine();

        System.out.println("Enter Student Name:");
        studentName = scen.nextLine();

        System.out.println("Enter Marks for Subject 1:");
        marksSubject1 = scen.nextDouble();

        System.out.println("Enter Marks for Subject 2:");
        marksSubject2 = scen.nextDouble();

        System.out.println("Enter Marks for Subject 3:");
        marksSubject3 = scen.nextDouble();
        scen.close();
    }

    public void displayData() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks for Subject 1: " + marksSubject1);
        System.out.println("Marks for Subject 2: " + marksSubject2);
        System.out.println("Marks for Subject 3: " + marksSubject3);

        double averageMarks = (marksSubject1 + marksSubject2 + marksSubject3) / 3.0;
        System.out.println("Average Marks: " + averageMarks);
    }
}

public class Exp_17_Student {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setData();

        student1.displayData();
    }
}
