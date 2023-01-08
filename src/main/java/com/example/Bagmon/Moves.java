package com.example.Bagmon;

public class Moves {
    private String name;
    private String type;
    private double scaling;
    private int points;

    public Moves(String name, String type, double scaling, int points) {
        this.name = name;
        this.type = type;
        this.scaling = scaling;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getScaling() {
        return scaling;
    }

    public void setScaling(double scaling) {
        this.scaling = scaling;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
