package Clumsy.D4.Opps;

    class Empolyee { // Parent Class 
    
    protected String name;
    protected int age;
    protected double salary;

    // Constructor
    public Empolyee(String name, int age, double salary) {
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
    public Manager(String name, int age, double salary, String department, int teamsize) {
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

   private String Programminglang;
   private String Project;

    //Constructor
    public Developer(String name, int age, double salary, String Programminglang, String Project) {
        super(name, age, salary);
        this.Programminglang = Programminglang;
        this.Project = Project;
    }

    @Override
    public void work() {
        System.out.println(name + " is coding in " + Programminglang + " language for Project " + Project );
    }

    @Override
    public double bonuscalculate() { 
        return salary * 0.15;
    }

    public void writecode() {
        System.out.println(name + " is writing " + Programminglang + " code ...." );
    }

    public void debug() {
        System.out.println(name + " is debugging the code rn .......");
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Language: " + Programminglang);
        System.out.println("Project: " + Project);
        System.out.println("Bonus $: " + bonuscalculate());
        System.out.println("==========================");

    }
}

    //Salesperson child Class: 

    class Salesperson extends Empolyee{
       private String region;
       private double salestarget;
       
       //constructor
       public Salesperson(String name, int age, double salary, String region, double salestarget) {
        super(name, age, salary);
        this.region = region;
        this.salestarget = salestarget;
       }

       @Override
       public void work() {
        System.out.println(name + " is selling in " + region  +" region"); 
       }

       @Override
       public double bonuscalculate() {
        return salary * 0.25; // 25% bonus for sales (commision based) 
       }

       public void makesales(double amount) { 
        System.out.println(name + " made a sale of amount $ " + amount);
       }

       @Override
       public void displayinfo() {
        super.displayinfo();
        System.out.println("Region: " + region);
        System.out.println("Sales Target: $" + salestarget);
        System.out.println("Bonus: " + bonuscalculate());
        System.out.println("==========================");
       }
    }


    public class InheritTest { 
        public static void main(String[] args) {
            
            //now creating diff diff Employee:
            
            Manager manager = new Manager("Madhav", 45, 75862, "IT", 18);
            Developer dev = new Developer("Aniket", 32, 60532.89, "Java", "Eye_Sharp");
            Salesperson sales2 = new Salesperson("Sakshi", 28, 056327, "Jaipur", 23);
            Developer dev2 = new Developer("Saumya", 26, 040563.26, "Java", "Eye_Sharp");
            Salesperson sales3 = new Salesperson("Samiksha", 24,32568, "Kota", 16);
            Salesperson sales = new Salesperson("Amita", 27, 035672.56, "Jaipur", 18);

            System.out.println("\n============ Manager Info =============");
            manager.displayinfo();
            manager.conductmeeting();
            manager.work();

            System.out.println("\n=========== Developers Info ============");
            dev.displayinfo();
            dev.work();
            dev.writecode();
            dev.debug();
            
            dev2.displayinfo();
            dev2.work();
            dev2.writecode();
            dev2.debug();

            System.out.println("\n=========== Sales_Person Info============");
            sales.displayinfo();
            sales.work();
            sales.makesales(360000);

            sales2.displayinfo();
            sales2.work();
            sales2.makesales(259785);

            sales3.displayinfo();
            sales3.work();
            sales3.makesales(402536);

            System.out.println("\n========== Bonus Calculating==========");
            Empolyee[] empolyees = {manager,dev,dev2,sales,sales2,sales3};

            for(Empolyee emp : empolyees ) {
                System.out.println(emp.name + "'s bonus: $" + emp.bonuscalculate());
            }
            System.out.println("");


        }
    }
