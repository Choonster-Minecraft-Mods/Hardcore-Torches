package com.github.wolfiewaffle.hardcoretorches.items;

import com.github.wolfiewaffle.hardcoretorches.blocks.BlockTorchLit;
import com.github.wolfiewaffle.hardcoretorches.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlockTorchLit extends ItemBlock
{
	public ItemBlockTorchLit(Block block) {
		super(block);
		setMaxDamage(BlockTorchLit.MAX_FUEL);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity player, int p0, boolean p1) {
		setDamage(itemstack, getDamage(itemstack) + 1); // Increment the damage

		if (getDamage(itemstack) > getMaxDamage(itemstack)){ // If the new damage is greater than the max damage, replace the item with a Burnt Torch
			itemstack.func_150996_a(Item.getItemFromBlock(ModBlocks.torchBurnt));
		}
	}
}
