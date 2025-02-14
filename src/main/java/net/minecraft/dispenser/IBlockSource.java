package net.minecraft.dispenser;

import mapped.IPosition;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public interface IBlockSource extends IPosition {
   @Override
   double getX();

   @Override
   double getY();

   @Override
   double getZ();

   BlockPos method11323();

   BlockState method11324();

   <T extends TileEntity> T method11325();

   ServerWorld method11326();
}
