package com.feo.the_blue_skies_delight;
import net.minecraftforge.fml.common.Mod;
import com.feo.the_blue_skies_delight.items.ItemLoader;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod(Utils.MODID)
public class the_blue_skies_delight {

    public the_blue_skies_delight(){
        ItemLoader.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
}
