package SpeedConverter;

public class Main {

    public static void main(String[] args) {

        long miles = Speed.toMilesPerHour(10.5);
        System.out.println("Miles " + miles);

        Speed.printConversion(10.5);

    }


}
