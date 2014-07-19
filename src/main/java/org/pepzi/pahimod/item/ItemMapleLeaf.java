package org.pepzi.pahimod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.pepzi.pahimod.utility.LogHelper;

public class ItemMapleLeaf extends ItemPMod {
    public ItemMapleLeaf() {
        super();
        this.setUnlocalizedName("mapleLeaf");
        this.setMaxStackSize(16);
    }

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        LogHelper.info(itemStack.getDisplayName() + " right clicked.");
        return itemStack;
    }


}
w