package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class HustleTrackerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<HustleEntry> loadedHustleEntries = HustleFileManager.loadEntries("hustle-log.csv");
        System.out.println("Loaded " + loadedHustleEntries.size() + " Hustle Entries");

        boolean menuRunning = true;
        while (menuRunning) {

            System.out.println("""
                    ===== Side Hustle Tracker =====
                    L) List all entries
                    S) Search by client
                    A) Add a job
                    E) Add an expense
                    R) Reports
                    X) Exit
                    Enter command:
                    """);
            String menuSelection = sc.nextLine();
            String menuSelectionCleaned = menuSelection.toLowerCase();
            switch (menuSelectionCleaned) {
                case "l":

            }
        }

    }

}
