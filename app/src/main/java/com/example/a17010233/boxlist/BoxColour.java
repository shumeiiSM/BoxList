package com.example.a17010233.boxlist;

/**
 * Created by 17010233 on 24/7/2018.
 */

public class BoxColour {
    private String colour;

    public BoxColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "BoxColour{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
