package com.mustardd.surrealcraft;

import java.util.stream.Collectors;

import com.mustardd.surrealcraft.init.BlockInit;
import com.mustardd.surrealcraft.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

// The value here should match an entry in the META-INF/mods.toml file
// Mod ID. Always lowercase. Use anytime code requires modID
@Mod("surrealcraft")

public class Surrealcraft
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    // Initialize a modID constant
    public static final String MOD_ID = "surrealcraft";
    public Surrealcraft() {
        // Initialize a variable for the event bus for ease of use
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the setup method for modloading
        bus.addListener(this::setup);
        // Register the ITEMS
        ItemInit.ITEMS.register(bus);
        // Register the BLOCKS
        BlockInit.BLOCKS.register(bus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

}