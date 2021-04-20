package com.mustardd.surrealcraft.init;

import com.mustardd.surrealcraft.Surrealcraft;
import com.mustardd.surrealcraft.advanced_items.CitrineWand;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    // Initialize the item register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Surrealcraft.MOD_ID);

    // Raw Material Items

    // registers Citrine gem item
    public static final RegistryObject<Item> CITRINE_GEM = ITEMS.register("citrine_gem",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    //registers Sapphire gem
    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    // registers Citrine wand item
    public static final RegistryObject<CitrineWand> CITRINE_WAND = ITEMS.register("citrine_wand",
            () -> new CitrineWand(new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1).setNoRepair().durability(50)));

    // Block items

    // registers Citrine ore item (name, location of block the item represents, location in creative mode tab)
    public static final RegistryObject<BlockItem> CITRINE_ORE = ITEMS.register("citrine_ore",
            () -> new BlockItem(BlockInit.CITRINE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    // registers Ruby ore item
    public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore",
            () -> new BlockItem(BlockInit.RUBY_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

}
