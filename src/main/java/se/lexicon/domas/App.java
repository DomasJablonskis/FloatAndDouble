package se.lexicon.domas;

public class App 
{
    public static void main( String[] args )
    {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5F / 3F;
        double myDoubleValue = 5D / 3D;
        double myDoubleValue_2 = 15.00 / 3.00;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("myDoubleValue = " + myDoubleValue_2);

        double numberOfPounds = 200D;
        double convertedKilograms = numberOfPounds * 0.45359237;
        System.out.println("convertedKilograms = " + convertedKilograms);

        double pi = 3.1415927D;
        double anotherNumber = 3_000_000.4_567_890D;
        System.out.println(pi);
        System.out.println(anotherNumber);






    }
}
