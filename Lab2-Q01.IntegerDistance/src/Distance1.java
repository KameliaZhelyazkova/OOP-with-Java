
public class Distance1 {


    public static void main(String[] args) {
        Distance1(args);
    }

    public static void Distance1(String[] args) {
        int myFirstInteger = Integer.parseInt(args[0]);
        int mySecondInteger = Integer.parseInt(args[1]);
        System.out.println((Math.max(mySecondInteger, myFirstInteger)) 
        		- Math.min(mySecondInteger, myFirstInteger));
    }
    
}