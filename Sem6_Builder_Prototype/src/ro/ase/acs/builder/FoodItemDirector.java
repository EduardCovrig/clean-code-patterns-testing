package ro.ase.acs.builder;

import java.time.LocalDate;

public class FoodItemDirector {
    private FoodItemBuilder foodItemBuilder;
    public FoodItem create(String name, double price, LocalDate bestBefore)
    {
        foodItemBuilder=new FoodItemBuilder();
        return foodItemBuilder.addName(name).addPrice(price).addIsBestBefore(bestBefore).build();
    }
    public FoodItem create(String name, double price)
    {
        foodItemBuilder=new FoodItemBuilder();
        return foodItemBuilder.addName(name).addPrice(price).build();
    }
}
