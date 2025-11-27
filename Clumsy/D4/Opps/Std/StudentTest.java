package Clumsy.D4.Opps.Std;

public class StudentTest {
    
    public static void main(String[] args) {
        
        Student student1 = new Student("Abhinav", 0016, 92.6);
        student1.name = "Abhinav";
        student1.age = 16;
        student1.rollNo = 212635;
        student1.gpa = 79.8;

        System.out.println(student1.name);
        System.out.println(student1.rollNo);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        char grade = student1.getLettergrade();
        System.out.println("Letter Grade " + grade);

        student1.displayinfo();
        student1.cheackPass();
        System.out.println("");

        Student student2 = new Student("Saumya", 18, 89.5);
        Student student3 = new Student("Neelam", 19, 75.2);
        Student student4 = new Student("Shikhar", 16, 59.8);
        System.out.println("");
        student2.rollNo = 125662;
        student3.rollNo = 364524;
        student4.rollNo = 425684;



        student2.displayinfo();
        student2.cheackPass();
        student3.displayinfo();
        student3.cheackPass();
        student4.displayinfo();
        student4.cheackPass();

        
        System.out.println("");
    }
}
