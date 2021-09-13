package com.bl.fooddeliverysystem;

public class Biryani extends FoodItem {

    public Biryani() {
        name = "Biryani";
        taste = Taste.SPICY;
        vegType = VegType.NON_VEG;
        category = Category.MAIN_COURSE;
        price = 280;
    }
}
