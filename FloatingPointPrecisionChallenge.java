package com.company;

public class FloatsandDoubles {
    public static void main(String[] args) {

        //Ques: Convert a given number of pounds to kilogram.

        // Step-1: Create a variable with the appropriate type to store the number of
        // pounds to be converted to kilograms.
        //Step-2: Calculate the result i.e. the number of kilograms based on the contents of
        // the variable above and store the result in a 2nd appropriate variable.
        //Step-3: Print out the result.
        //HINT :- 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation.

        double myPoundValue = 200d;
        double myKilogramValue = (0.45359237 * myPoundValue);
        System.out.println(myKilogramValue + (" kilograms"));

    }
}
