package com.feo.the_blue_skies_delight.items;

import com.feo.the_blue_skies_delight.Food.FoodList;
import com.feo.the_blue_skies_delight.groups.GroupLoader;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nonnull;

public class PinkBrewberryItem extends Item {
    public PinkBrewberryItem(){
        super(new Item.Properties().food(FoodList.BrewberryjuiceItem).tab(GroupLoader.blueSkiesDelightGroup));
    }   @Nonnull
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }
}
