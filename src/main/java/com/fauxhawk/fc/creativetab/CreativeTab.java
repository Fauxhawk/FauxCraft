package com.fauxhawk.fc.creativetab;


import com.fauxhawk.fc.Reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class CreativeTab
{
    public static final CreativeTabs FauxCraftTAB = new CreativeTabs(Reference.LOWERCASEMODID)
    {
        @Override
        public Item getTabIconItem()
        {
            return null;
        }
    };
}
