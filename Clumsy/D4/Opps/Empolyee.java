package Clumsy.D4.Opps;

    class Empolyee { // Parent Class 
    
    protected String name;
    protected int age;
    protected double salary;

    // Constructor
    public Empolyee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work () {
        System.out.println(name + " is working .....");
    }

    public void displayinfo() {
        System.out.println("\n========= EMPLOYEE Info ==========");
        System.out.println("Name: " + name );
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public double bonuscalculate() {
        return salary * 0.10; // 10% bonus for Emplyees
    }

}
// Manager child class: 
 class Manager extends Empolyee {
    private String department;
    private int teamsize;

    //Constructor
    public Manager(String name, int age, int salary, String department, int teamsize) {
        super(name, age, salary); // called parent class
        this.department = department;
        this.teamsize = teamsize;
    }

@Override

    public void work() {
        System.out.println(name + " is managing " + teamsize + " team members in " + department);
    }

    @Override
    public double bonuscalculate() {
        return salary * 0.20; // Exctra Bonus bc of Manager
    }

    public void conductmeeting() {
        System.out.println(name + " is conducting a Team meeting");
    }

    @Override
    public void displayinfo(){
        super.displayinfo();//called Parent class for showing details:
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamsize);
        System.out.println("Bonus $: " + bonuscalculate());
        System.out.println("==========================");
    }

 }

 //Programmer Child Class: 

class Developer extends Empolyee{

    String Programminglang;
    String Project;

    //Constructor
    public Developer(String name, int age, int salary, String Programminglang, String Project) {
        super(name, age, salary);
        this.Programminglang = Programminglang;
        this.Project = Project;
    }

}