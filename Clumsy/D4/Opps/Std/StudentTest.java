package Clumsy.D4.Opps.Std;

public class StudentTest {
    
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.name = "Abhinav";
        student1.age = 16;
        student1.rollNo = 212635;
        student1.gpa = 79.8;

        System.out.println(student1.name);
        System.out.println(student1.rollNo);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
    }
}
