package com.company;

import java.util.Arrays;

public class Farm {

    private String address;
    private Cow[] cows = {};
    private Sheep[] sheeps ={};
    private Horse[] horse = {};
    private String OwnerName;

    public Farm(String address, Cow[] cows, Sheep[] sheeps, Horse[] horse, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horse = horse;
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheeps=" + Arrays.toString(sheeps) +
                ", horse=" + Arrays.toString(horse) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}
