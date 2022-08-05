package com.feo.the_blue_skies_delight.items;

import com.feo.the_blue_skies_delight.groups.GroupLoader;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import com.feo.the_blue_skies_delight.items.MItemTier;
import com.feo.the_blue_skies_delight.items.ItemLoader;
public class CharoiteKnifeItem extends SwordItem {
    public CharoiteKnifeItem(){
        super(MItemTier.Charoite,6,-2.0F,new ToolItem.Properties().tab(GroupLoader.blueSkiesDelightGroup));
    }
}
