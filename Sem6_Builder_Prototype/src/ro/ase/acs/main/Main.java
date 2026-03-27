package ro.ase.acs.main;

import ro.ase.acs.builder.FoodItem;
import ro.ase.acs.builder.FoodItemBuilder;
import ro.ase.acs.builder.FoodItemDirector;
import ro.ase.acs.prototype.BlockType;
import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.PrototypeCollection;
import ro.ase.acs.prototype.WoodBlock;

public class Main {
    public static void main(String[] args)
    {
        //Builder
        FoodItem.Builder builder=new FoodItem.Builder();
        FoodItem cola=builder.addName("Coca-Cola").addPrice(8).addIsVegan(true).build();
        System.out.println(cola);

        //Builder -> varianta 2: FoodItemBuilder
        FoodItemBuilder foodItemBuilder=new FoodItemBuilder();
        foodItemBuilder.addName("Pizza").addPrice(38).addProducer("Trenta").addIsGluteFree(true);
        FoodItem pizza=foodItemBuilder.build();
        System.out.println(pizza);

        foodItemBuilder.addPrice(25);
        FoodItem pizza2=foodItemBuilder.build();
        System.out.println(pizza2);

        FoodItem pizza3=new FoodItemDirector().create("Margherita",50);
        System.out.println(pizza3);


        //Prototype
        BuildingBlock block1=new WoodBlock();
        block1.setX(5);
        block1.setY(10);
        block1.setZ(6);
        block1.render();

        try {
            BuildingBlock block2= (BuildingBlock) block1.clone();
            block2.setX(1);
            block2.setY(7);
            block2.setZ(8);
            block2.render();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        PrototypeCollection collection=new PrototypeCollection();
        BuildingBlock block3=collection.getBlock(BlockType.STONE);
        block3.setX(4);
        block3.setY(5);
        block3.setZ(4);
        block3.render();
    }
}
