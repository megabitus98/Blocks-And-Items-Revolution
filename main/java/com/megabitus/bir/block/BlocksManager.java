package com.megabitus.bir.block;

import com.megabitus.bir.block.blocks.BlockTelotriteOre;
import com.megabitus.bir.helping.Names;
import com.megabitus.bir.helping.Reference;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Megabitus on 8/11/2014 and hour 10.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class BlocksManager {
    public static final BlockBir telotriteOre = new BlockTelotriteOre();
    
    public static void register()
    {
        GameRegistry.registerBlock(telotriteOre, Names.Block_Telotrite_Ore);
    }
}
