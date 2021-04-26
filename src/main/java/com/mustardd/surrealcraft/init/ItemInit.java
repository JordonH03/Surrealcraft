package com.mustardd.surrealcraft.init;

import com.mustardd.surrealcraft.Surrealcraft;
import com.mustardd.surrealcraft.advanced_items.*;
import com.mustardd.surrealcraft.util.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    // Initialize the item register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Surrealcraft.MOD_ID);

    // RAW MATERIALS

    // registers Citrine gem item
    public static final RegistryObject<Item> CITRINE_GEM = ITEMS.register("citrine_gem",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    //registers Sapphire gem
    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    // registers Sapphire wand item
    public static final RegistryObject<SapphireWand> SAPPHIRE_WAND = ITEMS.register("sapphire_wand",
            () -> new SapphireWand(new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1).setNoRepair().durability(50)));

    // registers Citrine wand item
    public static final RegistryObject<CitrineWand> CITRINE_WAND = ITEMS.register("citrine_wand",
            () -> new CitrineWand(new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1).setNoRepair().durability(50)));

    // ORE

    // registers Citrine ore item (name, location of block the item represents, location in creative mode tab)
    public static final RegistryObject<BlockItem> CITRINE_ORE = ITEMS.register("citrine_ore",
            () -> new BlockItem(BlockInit.CITRINE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    // registers Ruby ore item
    public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore",
            () -> new BlockItem(BlockInit.RUBY_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    // registers Sapphire ore item
    public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore",
            () -> new BlockItem(BlockInit.SAPPHIRE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    // ARMOUR

    // Citrine set
    public static final RegistryObject<CitrineArmorItem> CITRINE_HELMET = ITEMS.register("citrine_helmet",
            () -> new CitrineArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<CitrineArmorItem> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate",
            () -> new CitrineArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<CitrineArmorItem> CITRINE_LEGGINGS = ITEMS.register("citrine_leggings",
            () -> new CitrineArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<CitrineArmorItem> CITRINE_BOOTS = ITEMS.register("citrine_boots",
            () -> new CitrineArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    // Ruby set
    public static final RegistryObject<RubyArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new RubyArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<RubyArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new RubyArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<RubyArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new RubyArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<RubyArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new RubyArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    // Sapphire set
    public static final RegistryObject<SapphireArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new SapphireArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<SapphireArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new SapphireArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<SapphireArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new SapphireArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<SapphireArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new SapphireArmorItem(ModArmorMaterial.CITRINE, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public ItemInit(Item.Properties properties) {
    }
}
