package com.pluralsight;

import java.util.ArrayList;

public class HustleTrackerApp {

    public static void main(String[] args) {

        ArrayList<HustleEntry> loadedHustleEntries = HustleFileManager.loadEntries("hustle-log.csv");
        System.out.println("Loaded " + loadedHustleEntries.size() + " Hustle Entries");
    }

}
