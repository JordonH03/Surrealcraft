package com.mustardd.surrealcraft.advanced_items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class SapphireArmorItem extends ArmorItem {
    // Constructor for item
    public SapphireArmorItem(IArmorMaterial material, EquipmentSlotType slot, Item.Properties properties) {
        super(material, slot, properties);
    }

    /*
     * Called every time the armor is updated by vanilla minecraft (20 times per second).
     * This checks that the armor in head slot is citrine.
     * If this is true, the potion effect is added for 10 ticks (0.5 seconds).
     * The result of this is players having the potion effect, only when wearing helmet.
     */

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() instanceof SapphireArmorItem) {
            player.addEffect(new EffectInstance(Effects.DIG_SPEED, 10, 0, false, false));
        }
        if (player.getItemBySlot(EquipmentSlotType.CHEST).getItem() instanceof SapphireArmorItem) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 10, 0, false, false));
        }
        if (player.getItemBySlot(EquipmentSlotType.LEGS).getItem() instanceof SapphireArmorItem) {
            player.addEffect(new EffectInstance(Effects.JUMP, 10, 0, false, false));
        }
        if (player.getItemBySlot(EquipmentSlotType.FEET).getItem() instanceof SapphireArmorItem) {
            player.addEffect(new EffectInstance(Effects.SLOW_FALLING, 10, 0, false, false));
        }


        super.onArmorTick(stack, world, player);
    }
}
