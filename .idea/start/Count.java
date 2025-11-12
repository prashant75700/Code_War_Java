public class Count {
    //here we try to learn how we use Increment & Decrement using count 

    public static void main(String[] args) {
        int count = 7;

        count++;
        System.out.println("Increment by 1: " + count);
        //increses count by 1:

        count += 4;
        System.out.println("Increment by 4: " + count);
        //increses count by 4:

        count--;
        System.out.println("Decrement by 1: " + count);
        //decreses count by 1:

        count -= 6;
        System.out.println("Decrement by 6: " + count);
        //Decreses current count value by 6: 

        // This all happen containing the current value of "Count"
        
        ////If we want to use the origenal value of count , then we have to use it seperatly & make an extra variable for it :
        
        int origenal_data = 11;
        int counter = origenal_data;

        counter ++;
        System.out.println("increment by 1: " + counter);

        counter = origenal_data + 5;
        System.out.println("Increses the origenal count value by 5: " + counter);

        counter = origenal_data - 8;
        System.out.println("Decreses the origenal count value by 8: " + counter);

    }
}
