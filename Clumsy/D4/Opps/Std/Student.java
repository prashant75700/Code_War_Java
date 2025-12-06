package Clumsy.D4.Opps.Std;

public class Student {
    
    String name;
    int age;
    int rollNo;
    double gpa;
   //char lettergrade;
    //public char[] getLettergrade;

    //now we are going to use constructors: 

    Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
        //lettergrade = getLettergrade;
        System.out.println("New Student Created: " + name);
    }

    //method to display info:
    void displayinfo() {
        System.out.println("");
        System.out.println("===== STUDENT INFO =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll NO: " + rollNo);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + getLettergrade());
        System.out.println("========================");
    }

    //method to cheack if student is pass or fail

    void cheackPass () {
        if (gpa >= 40.0) {
            System.out.println( name + " Passed ");
        }
        else {
            System.out.println(name + " Failed ");
        }
    
    }

    char getLettergrade () {
        if (gpa >= 90.0) {
           // System.out.println(name + " You got outstanding grade \'A\'");
            return 'A';
        }
        else if (gpa >= 80.0) {
            //System.out.print(name + " Great buddy You secured a amazing grade: ");
            return 'B';
        }
        else if (gpa >= 70.0) {
            //System.out.print(name + " Yoohho You just Scored a reliable Grade: ");
            return 'C';
        }
        else if (gpa >= 60.0) {
            //System.out.print(name  + " YOOOO you got a Decent grade: ");
            return 'D';
        }
        else if (gpa >= 40.0) {
            //System.out.print(name + " You just got yourself safe this time with the Grade: ");
            return 'E';
        }
        else {
            //System.out.print(name + " Sh***t dude , u didn't score enough to pass the exam T-T , Grade: ");
            return 'F';
        }
    }


}
