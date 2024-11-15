package com.onleetosh.pluralsight.util;

import com.onleetosh.pluralsight.order.addon.*;
import com.onleetosh.pluralsight.order.sandwich.*;

import java.util.ArrayList;

public class InitializeObject {

    /**
     * Initialize cookie objects and add them to an ArrayList
     */
    public static ArrayList<Cookie> listOfCookieObjects(){
        UI.cookieList = new ArrayList<Cookie>();
        UI.cookieList.add(new Cookie("Secret Cookie", 1.50));
        UI.cookieList.add(new Cookie("Chocolate Chuck", 1.50));
        UI.cookieList.add(new Cookie("Snickerdoodles", 1.50));
        UI.cookieList.add(new Cookie("Sugar Rush", 1.50));
        UI.cookieList.add(new Cookie("Oatmeal Raisin", 1.50));

        return  UI.cookieList;
    }
    /**
     * Initialize beverage objects and add them to an ArrayList
     */
    public static ArrayList<Beverage> listOfBeverageObjects(){

        UI.beveragesList = new ArrayList<Beverage>();
        UI.beveragesList.add(new Beverage("Secret Beverage"));
        UI.beveragesList.add(new Beverage("Seltzer"));
        UI.beveragesList.add(new Beverage("Coke"));
        UI.beveragesList.add(new Beverage("Spirit"));
        UI.beveragesList.add(new Beverage("Crush"));
        UI.beveragesList.add(new Beverage("Ginger Ale"));
        UI.beveragesList.add(new Beverage("Strawberry Lemonade"));
        UI.beveragesList.add(new Beverage("Mango Lemonade"));
        UI.beveragesList.add(new Beverage("Iced Tea"));
        UI.beveragesList.add(new Beverage("Green Tea"));
        UI.beveragesList.add(new Beverage("Fruit Punch"));
        UI.beveragesList.add(new Beverage("Passion Fruit"));

        return UI.beveragesList;
    }

    /**
     * Initialize chip objects and add them to an ArrayList
     */
    public static ArrayList<Chips> listOfChipObjects(){
        UI.chipsList = new ArrayList<Chips>();
        UI.chipsList.add(new Chips("Secret Chips"));
        UI.chipsList.add(new Chips("Rap Snacks, Bar-B-Que"));
        UI.chipsList.add(new Chips("Lay's Classic" ));
        UI.chipsList.add(new Chips("Frito Lay Baked, Classic  "));
        UI.chipsList.add(new Chips("Ruffles Baked, Cheddar & Sour Cream"));
        UI.chipsList.add(new Chips("Zapp's Kettle"));
        UI.chipsList.add(new Chips("Zapp's Voodoo"));
        UI.chipsList.add(new Chips("Doritos, Ranch" ));
        UI.chipsList.add(new Chips("Doritos, Nacho Cheese"));

        return  UI.chipsList;

    }

    /**
     * Initialize bread objects and add them to an ArrayList
     */
    public static ArrayList<Bread> listOfBreadObjects() {
        UI.breadList = new ArrayList<>();
        UI.breadList .add(new Bread("Special Roll",8));
        UI.breadList .add(new Bread("white", 4));
        UI.breadList.add(new Bread("white", 8));
        UI.breadList .add(new Bread("white", 12));
        UI.breadList .add(new Bread("wheat", 4));
        UI.breadList .add(new Bread("wheat", 8));
        UI.breadList .add(new Bread("wheat", 12));
        UI.breadList .add(new Bread("wrap", 4));
        UI.breadList .add(new Bread("wrap", 8));
        UI.breadList .add(new Bread("wrap", 12));
        UI.breadList .add(new Bread("rye", 4));
        UI.breadList .add(new Bread("rye", 8));
        UI.breadList .add(new Bread("rye", 12));

        return UI.breadList ;
    }

    /**
     * Initialize topping objects and add them to an ArrayList
     */
    public static ArrayList<Topping> listOfToppingObjects() {
        UI.heroToppingList = new ArrayList<>();

        // Regular toppings
        UI.heroToppingList.add(new Topping("spicy pepper ","veggie ",false, 0.0 ));
        UI.heroToppingList.add(new Topping("lettuce", "veggie",  false, 0.0));
        UI.heroToppingList.add(new Topping("tomato", "veggie", false, 0.0));
        UI.heroToppingList.add(new Topping("spinach", "veggie", false, 0.0));
        UI.heroToppingList.add(new Topping("banana peppers", "veggie", false, 0.0));
        UI.heroToppingList.add(new Topping("red onions", "veggie", false, 0.0));
        UI.heroToppingList.add(new Topping("jalapenos", "veggie", false, 0.0));
        UI.heroToppingList.add(new Topping("cucumber", "veggie", false, 0.0));
        UI.heroToppingList.add(new Topping("pickles", "veggie", false, 0.0));

        // Sauces
        UI.heroToppingList.add(new Topping("honey mustard", "sauce", false, 0.0)); //5
        UI.heroToppingList.add(new Topping("ranch", "dressing", false, 0.0)); //7
        UI.heroToppingList.add(new Topping("mayo", "sauce", false, 0.0)); //8
        UI.heroToppingList.add(new Topping("spicy mustard", "sauce", false, 0.0)); //9
        UI.heroToppingList.add(new Topping("ketchup", "sauce", false, 0.0)); //10
        UI.heroToppingList.add(new Topping("oil", "dressing", false, 0.0)); //10
        UI.heroToppingList.add(new Topping("vinegar", "dressing", false, 0.0)); //10
        UI.heroToppingList.add(new Topping("ranch", "dressing", false, 0.0)); //7

        // Premium toppings (Meats and Cheese)
        UI.heroToppingList.add(new Topping("prosciutto", "meat", true, 1.00)); //12
        UI.heroToppingList.add(new Topping("honey turkey", "meat", true, 1.00)); //12
        UI.heroToppingList.add(new Topping("grill chicken", "meat", true, 1.00)); //11
        UI.heroToppingList.add(new Topping("bacon", "meat", true, 1.00)); //12
        UI.heroToppingList.add(new Topping("roast beef", "meat", true, 1.00)); //13
        UI.heroToppingList.add(new Topping("salami", "meat",true, 1.00)); //14
        UI.heroToppingList.add(new Topping("ham", "meat",true, 1.00)); //15
        UI.heroToppingList.add(new Topping("steak", "meat",true, 1.00)); //16
        UI.heroToppingList.add(new Topping("provolone", "cheese", true, 0.70)); //17
        UI.heroToppingList.add(new Topping("cheddar", "cheese",true, 0.70)); //18
        UI.heroToppingList.add(new Topping("swiss", "cheese", true, 0.70)); //19
        UI.heroToppingList.add(new Topping("muenster", "cheese",true, 0.70)); //20
        UI.heroToppingList.add(new Topping("white american", "cheese",true, 0.70)); //20
        UI.heroToppingList.add(new Topping("chipotle gouda", "cheese",true, 0.70)); //18

        return UI.heroToppingList;
    }


}
