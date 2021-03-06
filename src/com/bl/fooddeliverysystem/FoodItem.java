package com.bl.fooddeliverysystem;

import java.util.Objects;

public class FoodItem {
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
        return "Name : " + name + " | Taste : " + taste + " | Category : " + category + " | VegType : " + vegType + " | Price : " + price + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodItem foodItem = (FoodItem) o;
        return Objects.equals(name, foodItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }
}