package com.github.alphacode.alphacore;

import com.github.alphacode.alphacore.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
@Mod(modid = AlphaCore.MODID, name = AlphaCore.NAME, version = AlphaCore.VERSION)
public class AlphaCore

{
    public static final String MODID = "alphacore";
    public static final String NAME = "AlphaCore";
    public static final String VERSION = "0.0.1";

    private static Logger logger;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
    @SidedProxy(clientSide = "com.github.alphacode.alphacore.client.ClientProxy",
            serverSide = "com.github.alphacode.alphacore.common.CommonProxy")
    public static com.github.alphacode.alphacore.common.CommonProxy proxy;}
