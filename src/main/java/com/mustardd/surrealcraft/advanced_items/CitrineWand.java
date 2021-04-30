package com.mustardd.surrealcraft.advanced_items;

import com.mustardd.surrealcraft.init.ItemInit;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;

import javax.annotation.Nullable;
import javax.swing.*;
import java.util.List;

public class CitrineWand extends Item {
    // Constructor for item
    public CitrineWand(Properties properties) {
        super(properties);
    }

    // On right click
    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand handIn) {
        // Declares the item in hand as a variable
        ItemStack stack = player.getItemInHand(handIn);
        player.setHealth(player.getHealth() + 2); // Heals 3 health (heart and a half)

        stack.setDamageValue(getDamage(stack) + 5); // Adds 5 point of damage to item
        if(stack.getDamageValue() > 50) {
            stack.setCount(0); // Destroys item after 0 durability
        }

        return super.use(world, player, handIn);
    }

    // Adds hover text showing item usages and maximum charges
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable World world, List<ITextComponent> iTextComponents, ITooltipFlag iTooltipFlag) {
        iTextComponents.add(new StringTextComponent(" "));
        iTextComponents.add(new StringTextComponent("\u00A77" + "When in main hand:"));
        iTextComponents.add(new StringTextComponent("\u00A72" + "Right-click to heal 1 heart"));
        iTextComponents.add(new StringTextComponent("\u00A72" + "10 charges"));
        super.appendHoverText(itemStack, world, iTextComponents, iTooltipFlag);
    }
}