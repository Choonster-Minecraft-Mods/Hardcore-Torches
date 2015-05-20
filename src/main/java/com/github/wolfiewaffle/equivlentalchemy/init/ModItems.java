package com.github.wolfiewaffle.equivlentalchemy.init;

import net.minecraft.item.Item;

import com.github.wolfiewaffle.equivlentalchemy.help.RegisterHelper;
import com.github.wolfiewaffle.equivlentalchemy.items.EquivlentAlchemyItem;

public class ModItems
{
	public static Item philosophersStone = new EquivlentAlchemyItem().setUnlocalizedName("philosophersStone");
	public static void init()
	{
		RegisterHelper.registerItem(philosophersStone);
	}
}
