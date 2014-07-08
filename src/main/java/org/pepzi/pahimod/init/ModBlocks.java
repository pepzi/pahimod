package org.pepzi.pahimod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import org.pepzi.pahimod.block.BlockFlag;
import org.pepzi.pahimod.block.BlockPMod;
import org.pepzi.pahimod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockPMod flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock(flag, "flag");
    }
}
