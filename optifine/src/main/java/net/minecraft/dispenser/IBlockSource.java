package net.minecraft.dispenser;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public interface IBlockSource extends ILocatableSource
{
    double getX();

    double getY();

    double getZ();

    BlockPos getBlockPos();

    BlockState getBlockState();

    <T extends TileEntity> T getBlockTileEntity();
}
