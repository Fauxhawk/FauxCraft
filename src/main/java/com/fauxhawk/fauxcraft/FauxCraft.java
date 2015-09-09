package com.fauxhawk.fauxcraft;

import com.fauxhawk.fauxcraft.Reference.Messages;
import com.fauxhawk.fauxcraft.init.ModItems;
import com.fauxhawk.fauxcraft.proxy.CommonProxy;
import com.fauxhawk.fauxcraft.util.LogHelper;
import net.minecraftforge.fml.common.Mod;
import com.fauxhawk.fauxcraft.Reference.Reference;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid=Reference.MODID, name=Reference.NAME, version=Reference.VERSION, certificateFingerprint = Reference.FINGERPRINT, dependencies = Reference.DEPENDENCIES, guiFactory = Reference.GUI_FACTORY_CLASS)

public class FauxCraft
{

    @Mod.Instance(Reference.MODID)
    public static FauxCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event)
    {
        if(Reference.FINGERPRINT.equals("@FINGERPRINT@"))
        {
            LogHelper.info(Messages.NO_FINGERPRINT_MESSAGE);
        }
        else
        {
            LogHelper.warn(Messages.INVALID_FINGERPRINT_MESSAGE);
        }
    }
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        ModItems.init();
        ModItems.register();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }
}
