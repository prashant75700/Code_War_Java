package Clumsy.D4.Opps.Vehical;

public class Test {
    
    private String name;
    private String brand;
    private int year;
    private int model;
    private String colour;
    private int speed;
    public String getName() {
        return name;
    }
    public String getColour() {
        return colour;
    }
    public int getSpeed() {
        
        return speed;
    }
    
    public static void main(String[] args) {
        Test car = new Test();
        car.name = "Bolero";
        System.out.println(car.name);
    }
    
    
}
