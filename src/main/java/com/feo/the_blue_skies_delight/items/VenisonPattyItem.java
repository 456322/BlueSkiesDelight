package com.feo.the_blue_skies_delight.items;

import com.feo.the_blue_skies_delight.Food.FoodList;
import com.feo.the_blue_skies_delight.groups.GroupLoader;
import net.minecraft.item.Item;

public class VenisonPattyItem extends Item{
    public VenisonPattyItem(){
        super(new Item.Properties().food(FoodList.Patty).tab(GroupLoader.blueSkiesDelightGroup));
    }
}
