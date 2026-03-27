package ro.ase.acs.builder;

import java.time.LocalDate;

public class FoodItem {
    private String name;
    private double price;
    private double discount;
    private String producer;
    private LocalDate bestBefore;
    private boolean isGluteFree;
    private boolean isVegan;

    private FoodItem() { //facut private ca sa nu se poate crea cineva un nou foodItem fara builder.
    }

    //package, folosit pt FoodItemBuilder doar.
    FoodItem(String name, double price, double discount, String producer, LocalDate bestBefore, boolean isGluteFree, boolean isVegan) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.producer = producer;
        this.bestBefore = bestBefore;
        this.isGluteFree = isGluteFree;
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", producer='" + producer + '\'' +
                ", bestBefore=" + bestBefore +
                ", isGluteFree=" + isGluteFree +
                ", isVegan=" + isVegan +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getProducer() {
        return producer;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public boolean isGluteFree() {
        return isGluteFree;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public static class Builder {
        private FoodItem foodItem=new FoodItem();

        public Builder addName(String name)
        {
            foodItem.name=name;
            return this;
        }
        public Builder addPrice(double price)
        {
            foodItem.price=price;
            return this;
        }
        public Builder addDiscount(double discount)
        {
            foodItem.discount=discount;
            return this;
        }
        public Builder addProducer(String producer) {
            foodItem.producer = producer;
            return this;
        }
        public Builder addIsBestBefore(LocalDate bestBefore) {
            foodItem.bestBefore=bestBefore;
            return this;
        }
        public Builder addIsGluteFree(boolean isGluteFree)
        {
            foodItem.isGluteFree=isGluteFree;
            return this;
        }
        public Builder addIsVegan(boolean isVegan)
        {
            foodItem.isVegan=isVegan;
            return this;
        }
        public FoodItem build()
        {
            FoodItem copy=foodItem;
            foodItem=new FoodItem();
            return copy;
        }

    }

}
