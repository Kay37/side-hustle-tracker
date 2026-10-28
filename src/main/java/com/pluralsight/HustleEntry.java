package com.pluralsight;

import java.time.LocalDate;

public class HustleEntry {

    private LocalDate date;
    private String service;
    private String client;
    private double hours;
    private double amount;

    public HustleEntry(LocalDate date, String service, String client, double hours, double amount) {
        this.date = date;
        this.service = service;
        this.client = client;
        this.hours = hours;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getHourlyRate() {
        if (isExpense()) {
            return 0;
        } else {
            return amount / hours;
        }
    }

    public boolean isExpense() {
       return amount < 0;
    }
}

