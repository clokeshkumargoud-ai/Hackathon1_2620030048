import java.util.Scanner;

public class Student {
    String studentName ;
    int rollNumber;
    int Marks;
    String courseName;
    int courseCredit;
    int courseFee ;
    boolean Eligibility;
    double Scholarship;
    double totalFee;
    Student(String studentName,int rollNumber,int Marks,String courseName,int courseCredit){
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.Marks = Marks;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
    }
    public void calculateFee(int courseCredit) {
        for(int i = 0 ; i <courseCredit ; i ++){
            courseFee += 1500;
        }
        System.out.println(" total course fee per credit :" +courseFee);
    }
    public void checkEligibility(double Marks){
        if(Marks > 50){
            Eligibility = true;
        }
        else{
            Eligibility = false;
        }
        System.out.println("Eligibility :" + Eligibility);
    }
    public void calculateScholarship(double Marks){
        if(Marks >= 85){
            Scholarship += 0.20;
        }
        else if(Marks <= 84 && Marks >= 70){
            Scholarship += 0.10;
        }
        else{
            Scholarship += 0;
        }
        System.out.println("your Scholarship :"+Scholarship);
    }
    public void displayDetails(String studentName,int rollNumber,int Marks,String courseName,int courseCredit){
        System.out.println("Student name :"+ studentName);
        System.out.println("Student roll Number :"+rollNumber);
        System.out.println("Student Marks :"+ Marks);
        System.out.println("courseName :" + courseName);
        System.out.println("courseCredits :"+courseCredit );
        System.out.println("Eligibility :"+ Eligibility);
        System.out.println("courseFee :"+ courseFee);
        System.out.println("Scholarship :"+ Scholarship);
        System.out.println("totalFee :" + courseFee*Scholarship*courseCredit);
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();
        String courseName = scr.nextLine();
        int rollNumber = scr.nextInt();
        int marks = scr.nextInt();

        int courseCredits = scr.nextInt();
        Student s = new Student(name,rollNumber,marks,courseName,courseCredits);
        s.calculateFee(courseCredits);
        s.checkEligibility(marks);
        s.calculateScholarship(marks);
        s.displayDetails(name,rollNumber,marks,courseName,courseCredits);
    }

        }
