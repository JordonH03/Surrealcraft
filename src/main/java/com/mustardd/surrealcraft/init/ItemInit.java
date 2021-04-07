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
    public static final RegistryObject<BlockItem> CITRINE_ORE = ITEMS.register("citrine_ore",
            () -> new BlockItem(BlockInit.CITRINE_ORE.get(), // Gets block from BLockInit
                    new Item.Properties().tab(ItemGroup.TAB_MATERIALS))); // Places ore in Materials tab
}
