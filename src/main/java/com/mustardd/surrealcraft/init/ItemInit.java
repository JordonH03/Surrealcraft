package com.mustardd.surrealcraft.init;

import com.mustardd.surrealcraft.Surrealcraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    // Initialize the item register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Surrealcraft.MOD_ID);

    // Block items

    // registers Citrine ore item (name, location of block item represents, location in creative mode tab
    public static final RegistryObject<BlockItem> CITRINE_ORE = ITEMS.register("citrine_ore",
            () -> new BlockItem(BlockInit.CITRINE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));


    // Raw Material Items

    // registers Citrine gem item
    public static final RegistryObject<Item> CITRINE_GEM = ITEMS.register("citrine_gem",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
