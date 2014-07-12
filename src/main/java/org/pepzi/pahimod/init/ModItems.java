package org.pepzi.pahimod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import org.pepzi.pahimod.creativetab.CreativeTabPMod;
import org.pepzi.pahimod.item.ItemMapleLeaf;
import org.pepzi.pahimod.item.ItemPMod;
import org.pepzi.pahimod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemPMod mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
