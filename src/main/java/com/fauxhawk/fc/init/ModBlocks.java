package com.fauxhawk.fc.init;

import com.fauxhawk.fc.Reference.Reference;
import com.fauxhawk.fc.block.BoxWoodenGear;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block WoodenGearBox;

    public static void init() {WoodenGearBox = new BoxWoodenGear(Material.wood).setUnlocalizedName("BoxWoodenGear");}

    public static void register()
    {
        GameRegistry.registerBlock(WoodenGearBox, WoodenGearBox.getUnlocalizedName().substring(5));
    }

    public static void registerRenders()
    {
        registerRender(WoodenGearBox);
    }
    public static void registerRender(Block block)
    {
       Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.LOWERCASEMODID + ":" + "BoxWoodenGear" , "inventory"));

    }
}
