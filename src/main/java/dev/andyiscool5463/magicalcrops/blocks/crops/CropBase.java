package dev.andyiscool5463.magicalcrops.blocks.crops;

import java.util.Random;


import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class CropBase extends BlockCrops {
	public static final PropertyInteger CROP_AGE = PropertyInteger.create("age", 0, 7);
	public final Item seed;
	public final Item drop;
	
	
	public CropBase(String name, Item Sseed, Item Ddrop) {
		super();
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		seed = Sseed;
		drop = Ddrop;
	}


	protected PropertyInteger getAgeProperty()
	{
		return CROP_AGE;
	}

	public int getMaxAge()
	{
		return 7;
	}
	protected Item getSeed()
	{
		return seed;
	}

	protected Item getCrop()
	{
		return drop;
	}
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (rand.nextInt(3) == 0)
		{
			this.checkAndDropBlock(worldIn, pos, state);
		}
		else
		{
			super.updateTick(worldIn, pos, state, rand);
		}
	}
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		entityIn.attackEntityFrom(DamageSource.CACTUS, 1.5F);
	}
	protected int getBonemealAgeIncrease(World worldIn)
	{
		return MathHelper.getInt(worldIn.rand, 1, 3);
	}

	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {CROP_AGE});
	}

}

