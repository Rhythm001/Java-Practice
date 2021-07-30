public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        double num1 = first* 1000;
        double num2 = second* 1000;
        
        long m = (long)num1;
        long n = (long)num2;
        
        if(m==n){
            return true;
        } else {
            return false;
        }
    }
 
}
