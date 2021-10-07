package com.bl.fooddeliverysystem;

import java.util.List;
import java.util.Scanner;

// view layer
public class UserInterface {
    public static UserInterface instance;

    public void print(List<FoodItem> foodList) {
/*        for (FoodItem foodItem : foodList) {
            System.out.println(foodItem);
        }*/
        foodList.forEach(System.out::println);
    }

    public static synchronized UserInterface getInstance() {
        if (instance == null) {
            instance = new UserInterface();
        }
        return instance;
    }

    public void showMenu(FoodStore foodStore) {
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to the restaurant. \nPress :\n 1. To add an item \n 2. To remove an item \n 3. To Print the menu \n 4. To modify added item \n 9. To stop the menu");
            int option = new Scanner(System.in).nextInt();
            Application application = new Application();
            flag = application.handleUserSelection(option, foodStore);
        }
    }
}