package com.fauxhawk.fc.init;

import com.fauxhawk.fc.Reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static Item WoodenGear;


    public static void init()
    {
      WoodenGear = new Item().setUnlocalizedName("WoodenGear");
    }

    public static void register()
    {
        GameRegistry.registerItem(WoodenGear, WoodenGear.getUnlocalizedName().substring(5));
    }

    public static void registerRenders()
    {
        registerRender(WoodenGear);
    }

    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.LOWERCASEMODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
