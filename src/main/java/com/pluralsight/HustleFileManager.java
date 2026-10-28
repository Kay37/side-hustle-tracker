package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;

public class HustleFileManager {

    public static ArrayList<HustleEntry> loadEntries(String fileName) {
        // * new ArrayList of the class HustleEntry titled hustleEntryList
        ArrayList<HustleEntry> hustleEntryList = new ArrayList<HustleEntry>();
        // * trying main code attempt
        try {
            BufferedReader hustleEntryReader = new BufferedReader(new FileReader(fileName));
            // * variable storing / representing each line in our file
            String line;
            // * eating the header of the file
            hustleEntryReader.readLine();
            // * while loop to go line by line until there's none left / it equals null
            while ((line = hustleEntryReader.readLine()) != null) {
                try {
                    String[] hustleEntriesArray = line.split("\\|");

                    LocalDate entryDate = LocalDate.parse(hustleEntriesArray[0]);
                    String entryService = hustleEntriesArray[1];
                    String entryClient = hustleEntriesArray[2];
                    double entryHours = Double.parseDouble(hustleEntriesArray[3]);
                    double entryAmount = Double.parseDouble(hustleEntriesArray[4]);
                    HustleEntry entry = new HustleEntry(entryDate, entryService, entryClient, entryHours, entryAmount);
                    hustleEntryList.add(entry);
                } catch (Exception e) {
                    System.out.println("Skipped bad line: " + line);
                }
            }
            // * closing BufferedReader / FileReader wrapped in a bReader
            hustleEntryReader.close();
            // * catching exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong while attempting to load entries");
        }
        return hustleEntryList;
    }

}
