package com.bl.fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// this is data layer / model layer
public class FoodStore {

    private final List<FoodItem> foodList = new ArrayList<>();

    public void add(FoodItem foodItem) {
        foodList.add(foodItem);
    }

    public void remove(String foodName) {
        for (int i = 0; i < foodList.size(); i++) {
            if (Objects.equals(foodName, foodList.get(i).name))
            {
                foodList.remove(foodList.get(i));
            }
            else System.out.println("The name entered is incorrect.");
        }
    }

    public List<FoodItem> getFoodList() {
        return foodList;
    }
}
