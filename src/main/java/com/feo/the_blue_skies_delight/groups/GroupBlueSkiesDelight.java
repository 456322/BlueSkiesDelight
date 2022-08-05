package com.feo.the_blue_skies_delight.groups;

import net.minecraft.item.ItemGroup;
import com.feo.the_blue_skies_delight.items.ItemLoader;
import net.minecraft.item.ItemStack;
public class GroupBlueSkiesDelight extends ItemGroup {
    public GroupBlueSkiesDelight(){
        super("blueSkiesDelightGroup");

    }
    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(ItemLoader.Pyropeknife.get());
    }

}
