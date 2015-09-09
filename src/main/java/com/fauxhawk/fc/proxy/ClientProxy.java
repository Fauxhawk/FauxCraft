package com.fauxhawk.fc.proxy;


import com.fauxhawk.fc.init.ModBlocks;
import com.fauxhawk.fc.init.ModItems;

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
