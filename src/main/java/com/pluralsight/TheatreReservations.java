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

        // Asks user how many tickets they want
        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();

        // Separates first name from last name
        int spaceIndex = name.indexOf(' ');
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);

    }
}
