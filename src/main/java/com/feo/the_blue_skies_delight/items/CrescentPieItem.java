package com.feo.the_blue_skies_delight.items;

import com.feo.the_blue_skies_delight.Food.FoodList;
import com.feo.the_blue_skies_delight.groups.GroupLoader;
import net.minecraft.item.Item;

public class CrescentPieItem extends Item {
    public CrescentPieItem(){
        super(new Item.Properties().tab(GroupLoader.blueSkiesDelightGroup).food(FoodList.Pie));
    }
}
