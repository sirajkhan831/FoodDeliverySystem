package com.bl.fooddeliverysystem;

public class FoodItem {
    public String name;
    public Taste taste;
    public Category category;
    public VegType vegType;
    public int price;

    enum Taste {SWEET, SOUR, SPICY, SALTY}

    enum Category {STARTER, MAIN_COURSE, FAST_FOOD}

    enum VegType {VEG, NON_VEG}

    public String toString() {
        return "Name : "+name+" | Taste : " + taste + " | Category : " + category + " | VegType : " + vegType + " | Price : " + price;
    }
}