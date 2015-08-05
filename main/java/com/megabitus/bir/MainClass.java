package com.megabitus.bir;

import com.megabitus.bir.handler.ConfigHandler;
import com.megabitus.bir.handler.RegisterHandler;
import com.megabitus.bir.helping.LogHelper;
import com.megabitus.bir.helping.Reference;
import com.megabitus.bir.proxy.CommonProxy;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MainClass {
	
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
       //ConfigHandler.init(event.getSuggestedConfigurationFile());
       //FMLCommonHandler.instance().bus().register(new ConfigHandler());
       RegisterHandler.registerMain();
       LogHelper.info("Has passed the PreInitialization!");
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.registerRenders();
        LogHelper.info("Has passed the Initialization!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Has passed the PostInitialization!");
    }
}