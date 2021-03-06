package com.github.wolfiewaffle.hardcoretorches.tileentities;

import com.github.wolfiewaffle.hardcoretorches.blocks.BlockTorchLit;
import com.github.wolfiewaffle.hardcoretorches.init.ModBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTorchLit extends TileEntity 
{
	public static final String publicName = "tileEntityTorchLit";
    private String name = "tileEntityTorchLit";
    
    public String getName() {
    	return name;
    }
    
    private int torchFuel = BlockTorchLit.MAX_FUEL;
    
    public int getFuelAmount() {
		return this.torchFuel;
	}

	public void setFuel(int f) {
		this.torchFuel = f;
	}
    
    @Override
    public void writeToNBT(NBTTagCompound par1) {
       super.writeToNBT(par1);
       par1.setInteger("torchFuelNBT", getFuelAmount());
    }
    
    @Override
    public void readFromNBT(NBTTagCompound par1) {
       super.readFromNBT(par1);
       this.torchFuel = par1.getInteger("torchfuelNBT");
    }
    
    @Override
    public void updateEntity() {
		if (worldObj.isRemote){ return; }

		torchFuel = torchFuel - 1; // Decrement the torch fuel
		markDirty();

		if (torchFuel < 0) { // If the new fuel value is less than 0, replace the block with a Burnt Torch
			System.out.printf("Torch at %d,%d,%d has burnt (fuel %d)\n", xCoord, yCoord, zCoord, torchFuel);
    		this.worldObj.setBlock(xCoord, yCoord, zCoord, ModBlocks.torchBurnt, worldObj.getBlockMetadata(xCoord, yCoord, zCoord), 3);
    	}
    }
}