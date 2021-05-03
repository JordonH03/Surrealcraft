package com.mustardd.surrealcraft.advanced_items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.FireChargeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.storage.IWorldInfo;

import javax.annotation.Nullable;
import java.util.List;

public class RubyWand extends Item {
    // Constructor for item
    public RubyWand(Item.Properties properties) {
        super(properties);
    }

    // On right click
    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        player.getCooldowns().addCooldown(this, 40); // 2 second cooldown

        // Code from Minecraft GhastEntity
        Vector3d vector3d = player.getViewVector(1.0F);
        // Sets fireball direction to player look direction
        // Simplified version of Ghast aiming
        double d2 = vector3d.x; // double d2 = livingentity.getX() - (this.ghast.getX() + vector3d.x * 4.0D);
        double d3 = vector3d.y; // double d3 = livingentity.getY(0.5D) - (0.5D + this.ghast.getY(0.5D));
        double d4 = vector3d.z; // double d4 = livingentity.getZ() - (this.ghast.getZ() + vector3d.z * 4.0D);

        FireballEntity fireballentity = new FireballEntity(world, player, d2, d3, d4); // creates fireball entity
        fireballentity.explosionPower = 2;
        fireballentity.setPos(player.getX() + vector3d.x * 4.0D, player.getY(0.5D) + 0.5D, fireballentity.getZ() + vector3d.z * 4.0D); // Set fireball position
        world.addFreshEntity(fireballentity); // Summons fireball into world


        stack.setDamageValue(getDamage(stack) + 5); // Adds 5 point of damage to item
        if(stack.getDamageValue() > 50) {
            stack.setCount(0); // Destroys item after 0 durability
        }
        return super.use(world, player, hand);

    }

    // Adds hover text showing item usages and maximum charges
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable World world, List<ITextComponent> iTextComponents, ITooltipFlag iTooltipFlag) {
        iTextComponents.add(new StringTextComponent(" "));
        iTextComponents.add(new StringTextComponent("\u00A77" + "When in main hand:"));
        iTextComponents.add(new StringTextComponent("\u00A72" + "Right-click to launch fireball"));
        iTextComponents.add(new StringTextComponent("\u00A72" + "10 charges"));
        iTextComponents.add(new StringTextComponent("\u00A76" + "2 second cooldown"));
        super.appendHoverText(itemStack, world, iTextComponents, iTooltipFlag);
    }
}
