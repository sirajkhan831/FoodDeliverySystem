package com.bl.fooddeliverysystem;

public class Pizza extends FoodItem{
    public Pizza() {
        name = "Pizza";
        taste = Taste.SPICY;
        vegType = VegType.VEG;
        category = Category.FAST_FOOD;
        price = 300;
    }
}
