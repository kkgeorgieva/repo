package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        Car car = new Car();

        car.speed = 15;


        System.out.println("this is: " + number);
        System.out.println(car.speed);
    }
}
