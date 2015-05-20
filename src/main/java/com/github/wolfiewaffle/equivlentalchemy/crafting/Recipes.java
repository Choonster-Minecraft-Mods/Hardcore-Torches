package com.github.wolfiewaffle.equivlentalchemy.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.github.wolfiewaffle.equivlentalchemy.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.philosophersStone), new Object[] {"ABA", "BCB", "ABA", 'A', Items.snowball, 'B', Items.snowball, 'C', Items.diamond});
	}
}
