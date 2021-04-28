package com.mustardd.surrealcraft.advanced_items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
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
import net.minecraft.world.World;
import net.minecraft.world.storage.IWorldInfo;

public class RubyWand extends Item {
    // Constructor for item
    public RubyWand(Item.Properties properties) {
        super(properties);
    }

    // On right click
    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        Vector3d lookpos = player.getEyePosition(1.0F); // direction of where player looks
        // player.getProjectile();
        //getProjectile(new FireballEntity(world, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F))

        stack.setDamageValue(getDamage(stack) + 5); // Adds 5 point of damage to item
        if(stack.getDamageValue() > 50) {
            stack.setCount(0); // Destroys item after 0 durability
        }
        return super.use(world, player, hand);

    }

    protected static BlockRayTraceResult getPlayerPOVHitResult(World world, PlayerEntity player, RayTraceContext.FluidMode fluidMode) {
        double range = player.getAttribute(net.minecraftforge.common.ForgeMod.REACH_DISTANCE.get()).getValue();

        float f = player.xRot;
        float f1 = player.yRot;
        Vector3d vector3d = player.getEyePosition(1.0F);
        float f2 = MathHelper.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f3 = MathHelper.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f4 = -MathHelper.cos(-f * ((float)Math.PI / 180F));
        float f5 = MathHelper.sin(-f * ((float)Math.PI / 180F));
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        Vector3d vector3d1 = vector3d.add((double)f6 * range, (double)f5 * range, (double)f7 * range);
        return world.clip(new RayTraceContext(vector3d, vector3d1, RayTraceContext.BlockMode.OUTLINE, fluidMode, player));
    }
}
