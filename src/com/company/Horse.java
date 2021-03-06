package com.company;

public class Horse extends AbstractAnimasl {

    private String color;

    public Horse(double weight, byte age, String gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    @Override
    public String toString() {
        return "color: "+ color;
    }
}
