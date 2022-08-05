package com.feo.the_blue_skies_delight.items;

import com.feo.the_blue_skies_delight.groups.GroupLoader;
import net.minecraft.item.Item;
import com.feo.the_blue_skies_delight.Food.FoodList;

public class VenisonHamburItem extends Item {
    public VenisonHamburItem(){
        super(new Properties().food(FoodList.VenisonHamburItem).tab(GroupLoader.blueSkiesDelightGroup));
    }
}
