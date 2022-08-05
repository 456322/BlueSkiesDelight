package com.feo.the_blue_skies_delight.items;
import com.feo.the_blue_skies_delight.groups.GroupLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class ItemPyropeKnife extends SwordItem {
    public ItemPyropeKnife()
    {
        super(MItemTier.Pyrope,6,-2F,new ToolItem.Properties().tab(GroupLoader.blueSkiesDelightGroup));
    }

}