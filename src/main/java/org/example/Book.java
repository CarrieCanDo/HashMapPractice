package org.example;

public class Book {
    private String name;
    private int year;
    private String content;

    public Book(String name, int year, String content) {
        this.name = name;
        this.year = year;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + year + "): " + content;
    }
}
