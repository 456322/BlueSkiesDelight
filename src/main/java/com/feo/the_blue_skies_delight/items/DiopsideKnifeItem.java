package com.feo.the_blue_skies_delight.items;

import com.feo.the_blue_skies_delight.groups.GroupLoader;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class DiopsideKnifeItem extends SwordItem {
    public DiopsideKnifeItem(){
        super(MItemTier.Diopside,6,-2.0F,new ToolItem.Properties().tab(GroupLoader.blueSkiesDelightGroup));
    }
}
