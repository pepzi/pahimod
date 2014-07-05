package org.pepzi.pahimod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import org.pepzi.pahimod.item.ItemMapleLeaf;
import org.pepzi.pahimod.item.ItemPMod;

public class ModItems {
    public static final ItemPMod mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
