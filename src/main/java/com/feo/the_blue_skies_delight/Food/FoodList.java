package com.feo.the_blue_skies_delight.Food;

import net.minecraft.item.Food;

public class FoodList {
    public static final Food BrewberryjuiceItem = new Food.Builder().nutrition(6).saturationMod(0.5F).alwaysEat().build();
    public static final Food VenisonHamburItem = new Food.Builder().nutrition(8).saturationMod(0.75F).alwaysEat().build();
    public static final Food Jam = new Food.Builder().nutrition(2).saturationMod(0.5F).alwaysEat().build();//=beans
    public static final Food MunicipaMonkfishsoup = new Food.Builder().nutrition(8).saturationMod(0.7F).alwaysEat().build();
    public static final Food Pie = new Food.Builder().nutrition(8).saturationMod(0.8F).alwaysEat().build();
    public static final Food PiewithPine = new Food.Builder().nutrition(8).saturationMod(0.8F).alwaysEat().build();
    public static final Food Patty = new Food.Builder().nutrition(4).saturationMod(0.7F).alwaysEat().build();
}
