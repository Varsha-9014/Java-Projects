package xyz;

public class OopsTask {
  
    private String name;
    private int rollNumber;
    private int marks;

    public OopsTask(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }


    public boolean isPass() {
        return marks >= 40;
    }

    public static void main(String[] args) {
        OopsTask student = new OopsTask("John", 101, 45);

        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Result: " + (student.isPass() ? "Pass" : "Fail"));
    }
}