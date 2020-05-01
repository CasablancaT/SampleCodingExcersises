package SpeedConverter;

public class Speed {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        //long milesPerHour = Math.round(kilometersPerHour / 1.609);
        //return milesPerHour;

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour <0){
            System.out.println("Invalid value cuz");
        }else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h =" + milesPerHour + "mi/h");
        }
    }
}



