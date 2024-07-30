package org.example;

import java.util.HashMap;

public class Program {

    // Method to print all keys in the hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    // Method to print keys that contain the given text
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // Method to print values of keys that contain the given text
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    // Method to print all values in the hashmap using the toString method of the Book objects
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    // Method to print only the Books in the hashmap which name contains the given string
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        // Testing the methods with String HashMap
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("f.e", "for example");
        stringHashMap.put("etc.", "and so on");
        stringHashMap.put("i.e", "more precisely");

        printKeys(stringHashMap);
        System.out.println("---");
        printKeysWhere(stringHashMap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(stringHashMap, ".e");

        // Testing the methods with Book HashMap
        HashMap<String, Book> bookHashMap = new HashMap<>();
        bookHashMap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        bookHashMap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        printValues(bookHashMap);
        System.out.println("---");
        printValueIfNameContains(bookHashMap, "prejudice");
    }
}
