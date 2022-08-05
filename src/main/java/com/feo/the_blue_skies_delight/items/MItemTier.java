package com.feo.the_blue_skies_delight.items;
import com.feo.the_blue_skies_delight.items.ItemLoader;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;


public enum MItemTier implements IItemTier {
    Pyrope(2, 200, 2F, 0.0F, 15, () -> {
    return Ingredient.of(ItemLoader.Pyropeknife.get());
}), Charoite(3, 1561,2F ,0.0F ,20 , ()->{
    return Ingredient.of(ItemLoader.CHAROITE_KNIFE.get());
    }),
    Diopside(3, 1661,2F ,0.0F ,21 ,()->{
        return Ingredient.of(ItemLoader.DIOPSIDE_KNIFE.get());}),
    Horizonite(2, 250, 2F,0.0F ,18 ,() ->{
        return Ingredient.of(ItemLoader.HORIZONITE_KNIFE.get());}),
    Turquoise(1,200 , 2F, 0.0F,15 , ()->{
        return Ingredient.of(ItemLoader.HORIZONITE_KNIFE.get());});


    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    private MItemTier(int p_i48458_3_, int p_i48458_4_, float p_i48458_5_, float p_i48458_6_, int p_i48458_7_, Supplier<Ingredient> p_i48458_8_)
    {
        this.level = p_i48458_3_;
        this.uses = p_i48458_4_;
        this.speed = p_i48458_5_;
        this.damage = p_i48458_6_;
        this.enchantmentValue = p_i48458_7_;
        this.repairIngredient = new LazyValue<>(p_i48458_8_);
    }


    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
