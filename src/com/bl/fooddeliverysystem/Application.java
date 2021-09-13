package com.bl.fooddeliverysystem;

import java.util.Scanner;

// controller layer
public class Application {
    static Pizza pizza = new Pizza();
    static Biryani biryani = new Biryani();
    static MasalaDosa masalaDosa = new MasalaDosa();
    static TandooriRoti tandooriRoti = new TandooriRoti();

    static UserInterface userInterface = new UserInterface();

    public static void main(String[] args){
        FoodStore foodStore = new FoodStore();
        userInterface.showMenu(foodStore);
        userInterface.print(foodStore.getFoodList());
    }

    boolean handleUserSelection(int option, FoodStore foodStore){
        switch (option) {
            case 1:
                System.out.println("Enter choice of the food : \n 1. Biryani \n 2. Pizza \n 3. Masala Dosa \n 4. Tandoori Roti");
                int choice = new Scanner(System.in).nextInt();
                switch (choice) {
                    case 1 -> foodStore.add(biryani);
                    case 2 -> foodStore.add(pizza);
                    case 3 -> foodStore.add(masalaDosa);
                    case 4 -> foodStore.add(tandooriRoti);
                }
                System.out.println("Food Added");
                break;
            case 2:
                userInterface.print(foodStore.getFoodList());
                System.out.println("Please enter the name of the food that you want to remove : ");
                String foodName = new Scanner(System.in).nextLine();
                foodStore.remove(foodName);
                break;
            case 3:
                userInterface.print(foodStore.getFoodList());
                break;
            case 4:
                addNewItem(foodStore);
                break;
            case 9:
                return false;
        }
        return true;
    }

    public void addNewItem(FoodStore foodStore){
        FoodItem foodItem = new FoodItem();
        System.out.println("Enter name of the food : ");
        foodItem.name = new Scanner(System.in).nextLine();
        System.out.println("Select Taste : 1.SWEET  2.SOUR  3.SPICY 4.SALTY");
        int option = new Scanner(System.in).nextInt();
        foodItem.taste = null;
        switch (option) {
            case 1 -> foodItem.taste = FoodItem.Taste.SWEET;
            case 2 -> foodItem.taste = FoodItem.Taste.SOUR;
            case 3 -> foodItem.taste = FoodItem.Taste.SPICY;
            case 4 -> foodItem.taste = FoodItem.Taste.SALTY;
        }
        System.out.println("Select Category : 1.STARTER  2.MAIN_COURSE  3.FAST_FOOD");
        int option1 = new Scanner(System.in).nextInt();
        foodItem.category = null;
        switch (option1) {
            case 1 -> foodItem.category = FoodItem.Category.STARTER;
            case 2 -> foodItem.category = FoodItem.Category.MAIN_COURSE;
            case 3 -> foodItem.category = FoodItem.Category.FAST_FOOD;
        }
        System.out.println("Select VegType : 1.VEG  2.NON_VEG");
        int option2 = new Scanner(System.in).nextInt();
        foodItem.vegType = null;
        switch (option2) {
            case 1 -> foodItem.vegType = FoodItem.VegType.VEG;
            case 2 -> foodItem.vegType = FoodItem.VegType.NON_VEG;
        }
        System.out.println("Enter Price : ");
        foodItem.price = new Scanner(System.in).nextInt();
        foodStore.add(foodItem);
    }
}