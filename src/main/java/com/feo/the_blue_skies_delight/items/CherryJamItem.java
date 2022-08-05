package com.feo.the_blue_skies_delight.items;

import com.feo.the_blue_skies_delight.Food.FoodList;
import com.feo.the_blue_skies_delight.groups.GroupLoader;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nonnull;

public class CherryJamItem extends Item {
    public CherryJamItem(){
        super(new Properties().tab(GroupLoader.blueSkiesDelightGroup).food(FoodList.Jam));
    }

    @Nonnull
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }
}
