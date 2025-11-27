package Clumsy.D4.Opps.Std;

public class XMultiStudent {
    
    public static void main(String[] args) {
        
        XStudent s1 = new XStudent("Arav", 17, 80.56);
        XStudent s2 = new XStudent("Sukanya", 15);
        XStudent s3 = new XStudent("Prayag");

        s1.displayinfo();
        s2.displayinfo();
        s3.displayinfo();
        System.out.println("");
    }
}
