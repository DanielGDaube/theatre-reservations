package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       // Asks user for name
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        // Asks user when they will be coming
        System.out.println("What date will you be coming? (MM/dd/yyyy)");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
    }
}
