package Clumsy.D4.Opps.Std;

public class XStudent {
    
    // here we go with the multiple constructor ( Constructor Overloading )

    String name;
    int age;
    double gpa;
    XStudent(String name, int age, double gpa) { // here we have all the variables 
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    XStudent(String name, int age) { // here we have 2 variables & 1 constant gpa
        this.name = name;
        this.age = age;
        gpa = 0.0;
    }

    XStudent(String name){// here we have 1 varialbe & 2 constant age & gpa
        this.name = name;
        age = 18;
        gpa = 0.0;    
    }

    void displayinfo() {
        System.out.println("\n" + name + " | Age: " + age + " | Gpa: " + gpa);
    }
}
