package com.megabitus.bir.block;

import com.megabitus.bir.block.blocks.BlockTeleoriteOre;
import com.megabitus.bir.helping.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class BlocksManager {
	
	public static Block telotrite_ore;
	
    public static void init(){
    	telotrite_ore = new BlockTeleoriteOre(Material.rock).setUnlocalizedName("telotrite_ore");      
    }
    public static void register(){
    	GameRegistry.registerBlock(telotrite_ore, telotrite_ore.getUnlocalizedName().substring(5));
    }
    public static void registerRenders(){
    	registerRender(telotrite_ore);
    }
    private static void registerRender(Block block){
    	Item item = Item.getItemFromBlock(block);
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
