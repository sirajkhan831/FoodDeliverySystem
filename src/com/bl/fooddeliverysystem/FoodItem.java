package com.bl.fooddeliverysystem;

public class FoodItem{
    String name;
    Taste taste;
    Category category;
    VegType vegType;
    int price;

    public FoodItem() {
    }

    enum Taste {SWEET, SOUR, SPICY, SALTY}

    enum Category {STARTER, MAIN_COURSE, FAST_FOOD}

    enum VegType {VEG, NON_VEG}

    public String toString() {
        return "Name : "+name+" | Taste : " + taste + " | Category : " + category + " | VegType : " + vegType + " | Price : " + price+"\n";
    }

    public String getName() {
        return name;
    }
}