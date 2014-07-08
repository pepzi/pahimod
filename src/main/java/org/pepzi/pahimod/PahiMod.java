package org.pepzi.pahimod;

import cpw.mods.fml.common.FMLCommonHandler;
import org.pepzi.pahimod.handler.ConfigurationHandler;
import org.pepzi.pahimod.init.ModBlocks;
import org.pepzi.pahimod.init.ModItems;
import org.pepzi.pahimod.proxy.IProxy;
import org.pepzi.pahimod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.pepzi.pahimod.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class PahiMod {
    @Mod.Instance(Reference.MOD_ID)
    public static PahiMod instance;

    @SidedProxy(clientSide = Reference.MOD_CLIENT_PROXY,
                serverSide = Reference.MOD_SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete");

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler()
    public void init(FMLInitializationEvent event) {
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialization Complete");
    }
}
