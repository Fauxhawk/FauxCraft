package com.fauxhawk.fauxcraft.proxy;


import com.fauxhawk.fauxcraft.init.ModBlocks;
import com.fauxhawk.fauxcraft.init.ModItems;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        ModBlocks.registerRenders();
        ModItems.registerRenders();
    }

    @Override
         public ClientProxy getClientProxy()
         {
             return this;
         }


}
