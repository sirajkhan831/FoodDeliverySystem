package com.bl.fooddeliverysystem;

public class MasalaDosa extends FoodItem{
    public MasalaDosa() {
        name = "Masala dosa";
        taste = Taste.SALTY;
        vegType = VegType.VEG;
        category = Category.FAST_FOOD;
        price = 110;
    }
}
