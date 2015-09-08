package com.fauxhawk.fauxcraft.proxy;


public interface IProxy
{
    public abstract ClientProxy getClientProxy();

    public abstract void initReneringAndTextures();

    public abstract void registerEventHandlers();

    public abstract void registerKeybindings();

}
