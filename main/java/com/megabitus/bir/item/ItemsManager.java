package com.megabitus.bir.item;

import com.megabitus.bir.helping.Names;
import com.megabitus.bir.helping.Reference;
import com.megabitus.bir.item.items.ItemEye;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Megabitus on 8/11/2014 and hour 10.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ItemsManager {
    public static final ItemBir eye = new ItemEye();

    public static void register(){
        GameRegistry.registerItem(eye, Names.Item_Eye);
    }
}
