package com.aq.jaqmod.block;

import com.aq.jaqmod.AQDMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class AQBlock {

    public static final ResourceKey<Block> AQ_BLOCK_KEY = ResourceKey.create(Registries.BLOCK, AQDMod.id("AQ_Block"));

    public static final ResourceKey<Item> AQ_BLOCK_ITEM = ResourceKey.create(Registries.ITEM, AQDMod.id("AQ_Block"));

    

    

}
