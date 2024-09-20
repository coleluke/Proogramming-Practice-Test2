package org.example;


public class RaceHorse extends Horse {

    private int numberOfRaces;

    public RaceHorse(String name, String color, int birthYear, int numberOfRaces) {
        super(name, color, birthYear);
        this.numberOfRaces = numberOfRaces;
    }

    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }
}