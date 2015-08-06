package com.megabitus.bir.item;

import com.megabitus.bir.helping.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Megabitus on 8/11/2014 and hour 10.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ItemsManager {
    public static Item eye;

    public static void init(){
    	eye = new Item().setUnlocalizedName("eye");
        
    }
    public static void register(){
    	GameRegistry.registerItem(eye, eye.getUnlocalizedName().substring(5));
    }
    public static void registerRenders(){
    	registerRender(eye);
    }
    public static void registerRender(Item item){
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
