
public class LargestDouble {

    public static void main(String[] args) {
        double firstFloatingNumber = Double.parseDouble(args[0]);
        double secondFloatingNumber = Double.parseDouble(args[1]);
        System.out.println(Math.max(secondFloatingNumber, firstFloatingNumber));
    }
}