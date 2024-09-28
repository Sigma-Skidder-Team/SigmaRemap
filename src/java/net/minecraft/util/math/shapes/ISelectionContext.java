package net.minecraft.util.math.shapes;

import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;

public interface ISelectionContext {
   static ISelectionContext method14947() {
      return Class4833.field22607;
   }

   static ISelectionContext forEntity(Entity var0) {
      return new Class4833(var0);
   }

   boolean method14949();

   boolean method14950(VoxelShape var1, BlockPos var2, boolean var3);

   boolean method14951(Item var1);

   boolean method14952(FluidState var1, FlowingFluid var2);
}
