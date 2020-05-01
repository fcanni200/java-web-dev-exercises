package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used?");
        Double gallons = input.nextDouble();

        double mpg = miles / gallons;
        System.out.println("You drove " + mpg + "mpg");

        input.close();
    }

}
