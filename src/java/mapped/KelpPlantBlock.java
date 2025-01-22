package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class KelpPlantBlock extends Class3445 implements Class3449 {
   private static String[] field19263;

   public KelpPlantBlock(Properties var1) {
      super(var1, Direction.UP, VoxelShapes.method27426(), true);
   }

   @Override
   public Class3452 method12124() {
      return (Class3452) Blocks.KELP;
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public boolean method11531(IBlockReader var1, BlockPos var2, BlockState var3, Fluid var4) {
      return false;
   }

   @Override
   public boolean method11532(IWorld var1, BlockPos var2, BlockState var3, FluidState var4) {
      return false;
   }
}
