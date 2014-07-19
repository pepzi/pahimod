package org.pepzi.pahimod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf, 1), "cc", "dd", 'c', new ItemStack(Blocks.cobblestone), 'd', new ItemStack(Blocks.dirt));
    }
}
