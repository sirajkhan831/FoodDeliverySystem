package com.bl.fooddeliverysystem;

import java.util.*;

// this is data layer / model layer
public class FoodStore {
    private static FoodStore instance;

    private final List<FoodItem> foodList = new ArrayList<>();
    private final Set<FoodItem> foodSet = new HashSet<>();

    public static synchronized FoodStore getInstance() {
        if (instance == null) {
            instance = new FoodStore();
        }
        return instance;
    }

    public void add(FoodItem foodItem) {
        foodList.add(foodItem);
    }

    public void remove(String foodName) {
        for (int i = 0; i < foodList.size(); i++) {
            if (foodName.equals(foodList.get(i).name)) {
                foodList.remove(foodList.get(i));
            }
        }
    }

    public List<FoodItem> getFoodList() {
        return foodList;
    }

    public void modify(String name) {
        foodList.forEach(foodItem -> {
            if (name.equals(foodItem.name)) {
                System.out.println("Enter the option number for the field to modify : 1. Name 2. Taste 3. Category 4. VegType 5. Price");
                int option = new Scanner(System.in).nextInt();
                switch (option) {
                    case 1 -> {
                        System.out.println("Enter name of the food : ");
                        foodItem.name = new Scanner(System.in).nextLine();
                    }
                    case 2 -> {
                        System.out.println("Select Taste : 1.SWEET  2.SOUR  3.SPICY 4.SALTY");
                        int option1 = new Scanner(System.in).nextInt();
                        foodItem.taste = null;
                        switch (option1) {
                            case 1 -> foodItem.taste = FoodItem.Taste.SWEET;
                            case 2 -> foodItem.taste = FoodItem.Taste.SOUR;
                            case 3 -> foodItem.taste = FoodItem.Taste.SPICY;
                            case 4 -> foodItem.taste = FoodItem.Taste.SALTY;
                        }
                    }
                    case 3 -> {
                        System.out.println("Select Category : 1.STARTER  2.MAIN_COURSE  3.FAST_FOOD");
                        int option2 = new Scanner(System.in).nextInt();
                        foodItem.category = null;
                        switch (option2) {
                            case 1 -> foodItem.category = FoodItem.Category.STARTER;
                            case 2 -> foodItem.category = FoodItem.Category.MAIN_COURSE;
                            case 3 -> foodItem.category = FoodItem.Category.FAST_FOOD;
                        }
                    }
                    case 4 -> {
                        System.out.println("Select VegType : 1.VEG  2.NON_VEG");
                        int option3 = new Scanner(System.in).nextInt();
                        foodItem.vegType = null;
                        switch (option3) {
                            case 1 -> foodItem.vegType = FoodItem.VegType.VEG;
                            case 2 -> foodItem.vegType = FoodItem.VegType.NON_VEG;
                        }
                    }
                    case 5 -> {
                        System.out.println("Enter Price : ");
                        foodItem.price = new Scanner(System.in).nextInt();
                    }
                }
            }
        });
    }

    public FoodItem getFood(String foodName) {
        return foodList.stream().filter(foodItem -> foodName.equals(foodItem.name)).findFirst().orElse(null);
    }
}