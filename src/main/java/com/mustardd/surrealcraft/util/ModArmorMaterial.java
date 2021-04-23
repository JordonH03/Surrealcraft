package com.mustardd.surrealcraft.util;

import com.mustardd.surrealcraft.Surrealcraft;
import com.mustardd.surrealcraft.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    // Create new instance of enumeration for citrine armor
    CITRINE(Surrealcraft.MOD_ID + ":citrine", // name
            7, // durabilityMultiplier
            new int[]{4, 7, 9, 4}, // slotProtections {boots, leggings, chest, helmet}
            0, // enchantmentValue
            SoundEvents.ARMOR_EQUIP_DIAMOND, // sound
            3.0f, // toughness
            3.0f, // knockbackResistance
            () -> {
        return Ingredient.of(ItemInit.CITRINE_GEM.get()); } // repairIngredient
    ),
    RUBY(Surrealcraft.MOD_ID + ":ruby", 7, new int[]{4, 7, 9, 4}, 0, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0f, 3.0f,
            () -> {
        return Ingredient.of(ItemInit.RUBY_GEM.get()); }
    ),
    SAPPHIRE(Surrealcraft.MOD_ID + ":ruby", 7, new int[]{4, 7, 9, 4}, 0, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0f, 3.0f,
            () -> {
        return Ingredient.of(ItemInit.SAPPHIRE_GEM.get()); }
    );

    // Code sourced from Minecraft ArmorMaterial enum
    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    private ModArmorMaterial(String p_i231593_3_, int p_i231593_4_, int[] p_i231593_5_, int p_i231593_6_, SoundEvent p_i231593_7_, float p_i231593_8_, float p_i231593_9_, Supplier<Ingredient> p_i231593_10_) {
        this.name = p_i231593_3_;
        this.durabilityMultiplier = p_i231593_4_;
        this.slotProtections = p_i231593_5_;
        this.enchantmentValue = p_i231593_6_;
        this.sound = p_i231593_7_;
        this.toughness = p_i231593_8_;
        this.knockbackResistance = p_i231593_9_;
        this.repairIngredient = new LazyValue<>(p_i231593_10_);
    }

    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
