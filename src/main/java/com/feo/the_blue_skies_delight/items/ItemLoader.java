package com.feo.the_blue_skies_delight.items;
import com.feo.the_blue_skies_delight.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemLoader {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MODID);

    public static final RegistryObject<Item> Pyropeknife = ITEMS.register("pyrope_knife",ItemPyropeKnife::new);
    public static final RegistryObject<Item> BREWBERRYJUICE = ITEMS.register("brewberryjuice", BrewberryjuiceItem::new);
    public static final RegistryObject<Item> PINK_BREWBERRY = ITEMS.register("pink_brewberry", PinkBrewberryItem::new);
    public static final RegistryObject<Item> BLACK_BREWBERRY_JUICE = ITEMS.register("black_brewberry_juice", BlackBrewberryJuiceItem::new);
    public static final RegistryObject<Item> VENISON_HAMBUR = ITEMS.register("venison_hambur", VenisonHamburItem::new);
    public static final RegistryObject<Item> DIOPSIDE_KNIFE =ITEMS.register("diopside_knife", DiopsideKnifeItem::new);
    public static final RegistryObject<Item> CHAROITE_KNIFE = ITEMS.register("charoite_knife", CharoiteKnifeItem::new);
    public static final RegistryObject<Item> HORIZONITE_KNIFE = ITEMS.register("horizonite_knife", HorizoniteKnifeItem::new);
    public static final RegistryObject<Item> TURQUOISE_STONE_KNIFE = ITEMS.register("turquoise_stone_knife", TurquoiseStoneKnifeItem::new);
    public static final RegistryObject<Item> CHERRY_JAM = ITEMS.register("cherry_jam", CherryJamItem::new);
  public static final RegistryObject<Item> MUNICIPAL_MONKFISH_SOUP = ITEMS.register("municipal_monkfish_soup", MunicipalMonkfishSoupItem::new);
    public static final RegistryObject<Item> FIERY_BEANS = ITEMS.register("fiery_beans", FieryBeansItem::new);
    public static final RegistryObject<Item> CRESCENT_PIE = ITEMS.register("crescent_pie", CrescentPieItem::new);
    public static final RegistryObject<Item> CRESCENT_PIE_WITH_PINE = ITEMS.register("crescent_pie_with_pine", CrescentPieWithPineItem::new);
    public static final RegistryObject<Item> venisonpatty = ITEMS.register("venison_patty", VenisonPattyItem::new);
}
