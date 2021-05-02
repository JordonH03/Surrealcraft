package com.mustardd.surrealcraft.advanced_items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class CitrineArmorItem extends ArmorItem {
    // Constructor for item
    public CitrineArmorItem(IArmorMaterial material, EquipmentSlotType slot, Item.Properties properties) {
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
        if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() instanceof CitrineArmorItem) {
            player.addEffect(new EffectInstance(Effects.NIGHT_VISION, 10, 0, false, false));
        }
        if (player.getItemBySlot(EquipmentSlotType.CHEST).getItem() instanceof CitrineArmorItem) {
            player.addEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 10, 0, false, false));
        }
        if (player.getItemBySlot(EquipmentSlotType.LEGS).getItem() instanceof CitrineArmorItem) {
            player.addEffect(new EffectInstance(Effects.LUCK, 10, 0, false, false));
        }
        if (player.getItemBySlot(EquipmentSlotType.FEET).getItem() instanceof CitrineArmorItem) {
            player.addEffect(new EffectInstance(Effects.HEALTH_BOOST, 10, 0, false, false));
        }


        super.onArmorTick(stack, world, player);
    }
}
