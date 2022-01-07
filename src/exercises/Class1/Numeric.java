package exercises.Class1;

import java.util.Scanner;

public class Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("The area is " + area);
    }
}
