package com.agriculturalexpansion.handler;

import java.util.List;

import com.agriculturalexpansion.extend.AECrop;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WailaDataProvider implements IWailaDataProvider {
	
	public static void callbackRegister(IWailaRegistrar registrar) {
        registrar.registerStackProvider(new WailaDataProvider(), AECrop.class);
	}

	@Override
	public NBTTagCompound getNBTData(EntityPlayerMP arg0, TileEntity arg1, NBTTagCompound arg2, World arg3, BlockPos arg4) {
		return null;
	}

	@Override
	public List<String> getWailaBody(ItemStack arg0, List<String> arg1, IWailaDataAccessor arg2, IWailaConfigHandler arg3) {
		return null;
	}

	@Override
	public List<String> getWailaHead(ItemStack arg0, List<String> arg1, IWailaDataAccessor arg2, IWailaConfigHandler arg3) {
		return null;
	}

	@Override
	public ItemStack getWailaStack(IWailaDataAccessor arg0, IWailaConfigHandler arg1) {
		return new ItemStack(arg0.getBlockState().getBlock());
	}

	@Override
	public List<String> getWailaTail(ItemStack arg0, List<String> arg1, IWailaDataAccessor arg2, IWailaConfigHandler arg3) {
		return null;
	}

}
