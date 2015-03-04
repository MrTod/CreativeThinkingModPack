package com.ct.creativethinking.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemSaplingBlocks extends ItemBlock
{

    public static final String[] sapling = new String[] {"Oreo"};

    public ItemSaplingBlocks(Block block){
        super(block);
        this.setHasSubtypes(true);
    }
    public String getUnlocalizedName(ItemStack itemstack){
        int i = itemstack.getItemDamage();
        if (i< 0 || i >= sapling.length){
            i =0;
        }
        return super.getUnlocalizedName() + "." + sapling[i];
    }
    public int getMetadata (int meta){
        return meta;
    }
}
