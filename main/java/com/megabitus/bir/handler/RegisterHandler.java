package com.megabitus.bir.handler;

import com.megabitus.bir.block.BlocksManager;
import com.megabitus.bir.item.ItemsManager;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Megabitus on 8/11/2014 and hour 20.
 */

public class RegisterHandler {
    public static void registerMain(){
        BlocksManager.register();
        ItemsManager.register();
        recipes();
    }
    private static void recipes(){
      
    }
}
