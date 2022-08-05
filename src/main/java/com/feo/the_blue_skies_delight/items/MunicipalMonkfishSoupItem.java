package com.feo.the_blue_skies_delight.items;

import com.feo.the_blue_skies_delight.Food.FoodList;
import com.feo.the_blue_skies_delight.groups.GroupLoader;
import net.minecraft.item.Item;

public class MunicipalMonkfishSoupItem extends Item {
    public MunicipalMonkfishSoupItem(){
        super(new Properties().food(FoodList.MunicipaMonkfishsoup).tab(GroupLoader.blueSkiesDelightGroup));
    }
}
