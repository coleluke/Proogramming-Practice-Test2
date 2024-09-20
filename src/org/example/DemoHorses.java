package org.example;

import java.util.Scanner;

public class DemoHorses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and display Horse
        System.out.println("Enter Horse details:");
        System.out.print("Name: ");
        String horseName = scanner.nextLine();

        System.out.print("Color: ");
        String horseColor = scanner.nextLine();

        System.out.print("Birth Year: ");
        int horseBirthYear = scanner.nextInt();
        scanner.nextLine();

        Horse horse = new Horse(horseName, horseColor, horseBirthYear);

        System.out.println("\nHorse Details:");
        System.out.println("Name: " + horse.getName());
        System.out.println("Color: " + horse.getColor());
        System.out.println("Birth Year: " + horse.getBirthYear());

        // Create and display RaceHorse
        System.out.println("\nEnter RaceHorse details:");
        System.out.print("Name: ");
        String raceHorseName = scanner.nextLine();

        System.out.print("Color: ");
        String raceHorseColor = scanner.nextLine();

        System.out.print("Birth Year: ");
        int raceHorseBirthYear = scanner.nextInt();

        System.out.print("Number of Races: ");
        int numberOfRaces = scanner.nextInt();

        RaceHorse raceHorse = new RaceHorse(raceHorseName, raceHorseColor, raceHorseBirthYear, numberOfRaces);

        System.out.println("\nRaceHorse Details:");
        System.out.println("Name: " + raceHorse.getName());
        System.out.println("Color: " + raceHorse.getColor());
        System.out.println("Birth Year: " + raceHorse.getBirthYear());
        System.out.println("Number of Races: " + raceHorse.getNumberOfRaces());
    }
}
