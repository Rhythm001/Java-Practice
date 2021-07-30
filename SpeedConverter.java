public class SpeedConverter {

    public static long toMilesPerHour(double KilometresPerHour){
        if (KilometresPerHour<0){
            return -1;
        }

        return Math.round(KilometresPerHour / 1.609);

    }

    public static void printConversion(double KilometresPerHour){

        if(KilometresPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(KilometresPerHour);
            System.out.println(KilometresPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
