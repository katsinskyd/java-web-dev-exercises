package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        boolean checkDouble = input.hasNextDouble();
        double radius;

        if (!checkDouble) {
            System.out.println("Input not valid");
        } else {
            radius = input.nextDouble();

            while (radius < 0) {
                System.out.println("Input not valid, enter the non-negative radius of the circle: ");
                radius = input.nextDouble();
            }

            input.close();
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }
    }
}