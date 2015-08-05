package com.megabitus.bir.block;

import java.util.Random;

import com.megabitus.bir.helping.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Megabitus on 8/11/2014 and hour 17.
 */
public class BlockBir extends Block {
    public BlockBir(Material material){
        super(material);
       // this.setCreativeTab(CreativeTabBir.BIR_TAB);
    }
    public BlockBir(){
        this(Material.rock);
    }
}
