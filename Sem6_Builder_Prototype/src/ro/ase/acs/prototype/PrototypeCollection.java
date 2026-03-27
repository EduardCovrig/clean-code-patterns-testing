package ro.ase.acs.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    private final Map<BlockType,BuildingBlock> collection=new HashMap<>();

    public PrototypeCollection()
    {
        collection.put(BlockType.STONE,new StoneBlock());
        collection.put(BlockType.WOOD,new WoodBlock());
    }

    public BuildingBlock getBlock(BlockType type){
        try {
            return (BuildingBlock) collection.get(type).clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Block " + type + " not found");
    }
}

