package org.pepzi.pahimod.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import org.pepzi.pahimod.reference.Reference;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            logConfiguration();
        }
    }

    @SubscribeEvent()
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            logConfiguration();
        }
    }

    private static void logConfiguration() {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL,
                false, "This is an example configuration value");

                if (configuration.hasChanged()) {
                    configuration.save();
                }
    }
}