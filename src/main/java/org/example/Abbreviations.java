package org.example;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    // Constructor
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    // Method to add an abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    // Method to check if an abbreviation has already been added; returns true or false
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    // Method to find the explanation for an abbreviation; returns null if not added yet
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.getOrDefault(abbreviation, null);
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
