package com.mustardd.surrealcraft.init;

import com.mustardd.surrealcraft.Surrealcraft;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    // Initialize block register
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Surrealcraft.MOD_ID);

    // Register the ores
    public static final RegistryObject<Block> CITRINE_ORE = BLOCKS.register("citrine_ore", () -> new OreBlock(AbstractBlock.Properties
                    .of(Material.STONE)
                    .strength(3.0f,3.0f) // First float is hardness to break, second float is resistance to explosion
                    .harvestTool(ToolType.PICKAXE) // The type of tool that will break it the fastest
                    .harvestLevel(2) // The level of tool needed. 2 is iron
                    .sound(SoundType.STONE) // Sound upon breaking
                    .requiresCorrectToolForDrops()
            )
    );

    //registering ruby ore
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new OreBlock(AbstractBlock.Properties
                    .of(Material.STONE)
                    .strength(3.0f,3.0f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );

    //registering sapphire ore
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new OreBlock(AbstractBlock.Properties
                    .of(Material.STONE)
                    .strength(3.0f,3.0f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );
}
