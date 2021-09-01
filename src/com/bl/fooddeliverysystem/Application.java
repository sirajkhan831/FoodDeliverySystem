package com.bl.fooddeliverysystem;

import java.util.Scanner;

// controller layer
public class Application {
    Pizza pizza = new Pizza();
    Biryani biryani = new Biryani();
    MasalaDosa masalaDosa = new MasalaDosa();
    TandooriRoti tandooriRoti = new TandooriRoti();

    static UserInterface userInterface = new UserInterface();

    public static void main(String[] args) {
        FoodStore foodStore = new FoodStore();
        userInterface.showMenu(foodStore);
        userInterface.print(foodStore.getFoodList());
    }

    boolean handleUserSelection(int option, FoodStore foodStore) {
        switch (option) {
            case 1:
                System.out.println("Enter choice of the food : \n 1. Biryani \n 2. Pizza \n 3. Masala Dosa \n 4. Tandoori Roti");
                int choice = new Scanner(System.in).nextInt();
                switch (choice){
                case 1 -> foodStore.add(biryani);
                case 2 -> foodStore.add(pizza);
                case 3 -> foodStore.add(masalaDosa);
                case 4 -> foodStore.add(tandooriRoti);}
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
            case 9:
                return false;
        }
        return true;
    }
}