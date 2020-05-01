package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of your rectangle?");
        double length = input.nextDouble();

        System.out.println("What is the width of your rectangle?");
        double width =input.nextDouble();

        double area = length * width;
        System.out.println("The area of your rectangle is " + area);

        input.close();

    }
}
