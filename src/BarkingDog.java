public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        // Invalid value for hourOfDay
        if ( hourOfDay < 0 || hourOfDay > 23 ){
            return false;
        } else return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 6));
    }
}
