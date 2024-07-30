package org.example;

import java.util.HashMap;

public class IOweYou {
    private HashMap<String, Double> debts;

    // Constructor
    public IOweYou() {
        this.debts = new HashMap<>();
    }

    // Method to save the amount owed and the person owed to
    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);
    }

    // Method to return the amount owed to the person whose name is given as a parameter
    public double howMuchDoIOweTo(String toWhom) {
        return this.debts.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOweYou mattsIOU = new IOweYou();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
