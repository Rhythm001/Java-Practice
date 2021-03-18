package com.company;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

//  Ques1: Your challenge is to create a byte variable and set it to any valid byte number, it doesn't matter.
//         Create a short variable and set it to any valid short number.
        byte myNewByteVariable = 120;
        System.out.println(myNewByteVariable);

        short myNewShortVariable = 235;
        System.out.println(myNewShortVariable);

//  Ques2: Create an int variable and set it to any valid int number. Lastly, create a variable of type long
//         and make it equal to 5000 plus 10 times the  sum of the byte plus the short plus the integer values.
        int newIntVariable = 4567889;
        System.out.println(newIntVariable);

        long newLongVariable = 50000L + (10L * (myNewByteVariable + myNewShortVariable + newIntVariable));
        System.out.println( "The Long Variable is : " + newLongVariable);

    }
}
