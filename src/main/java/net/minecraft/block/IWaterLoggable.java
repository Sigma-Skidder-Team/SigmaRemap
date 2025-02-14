package net.minecraft.block;

import mapped.*;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public interface IWaterLoggable extends Class3405, Class3449 {
   @Override
   default boolean method11531(IBlockReader var1, BlockPos var2, BlockState var3, Fluid var4) {
      return !var3.<Boolean>get(BlockStateProperties.WATERLOGGED) && var4 == Fluids.WATER;
   }

   @Override
   default boolean method11532(IWorld var1, BlockPos var2, BlockState var3, FluidState var4) {
      if (!var3.<Boolean>get(BlockStateProperties.WATERLOGGED) && var4.getFluid() == Fluids.WATER) {
         if (!var1.isRemote()) {
            var1.setBlockState(var2, var3.with(BlockStateProperties.WATERLOGGED, Boolean.valueOf(true)), 3);
            var1.getPendingFluidTicks().scheduleTick(var2, var4.getFluid(), var4.getFluid().getTickRate(var1));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default Fluid method11533(IWorld var1, BlockPos var2, BlockState var3) {
      if (!var3.<Boolean>get(BlockStateProperties.WATERLOGGED)) {
         return Fluids.EMPTY;
      } else {
         var1.setBlockState(var2, var3.with(BlockStateProperties.WATERLOGGED, Boolean.valueOf(false)), 3);
         return Fluids.WATER;
      }
   }
}
