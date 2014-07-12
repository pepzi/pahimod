package org.pepzi.pahimod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.pepzi.pahimod.init.ModItems;
import org.pepzi.pahimod.reference.Reference;

public class CreativeTabPMod {
    public static final CreativeTabs PMOD_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "PahiMod";
        }
    };
}
