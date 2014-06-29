package org.pepzi.pahimod;

import org.pepzi.pahimod.proxy.IProxy;
import org.pepzi.pahimod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class PahiMod {
    @Mod.Instance(Reference.MOD_ID)
    public static PahiMod instance;

    @SidedProxy(clientSide = Reference.MOD_CLIENT_PROXY,
                serverSide = Reference.MOD_SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler()
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
