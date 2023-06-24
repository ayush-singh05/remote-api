package com.example.remoteapi;

public class MoviesCustomDetails {
    private String name;
    private int budget;
    private String original_language;

    public MoviesCustomDetails() {
    }

    public MoviesCustomDetails(String name, int budget, String original_language) {
        this.name = name;
        this.budget = budget;
        this.original_language = original_language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }
}
