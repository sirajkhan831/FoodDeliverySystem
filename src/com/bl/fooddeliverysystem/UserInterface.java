package com.bl.fooddeliverysystem;

import java.util.List;
import java.util.Scanner;

// view layer
public class UserInterface {
    public void print(List<FoodItem> foodList) {
        System.out.println("");
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }
    }

    public void showMenu(FoodStore foodStore) {
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to the restaurant. \nPress :\n 1. To add an item \n 2. To remove an item \n 3. To Print the menu \n 4. To add a new food item to the menu \n 9. To stop the menu");
            int option = new Scanner(System.in).nextInt();
            Application application = new Application();
            flag = application.handleUserSelection(option, foodStore);
        }
    }
}