package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3451 extends Class3452 implements Class3449 {
   private static String[] field19265;
   public static final VoxelShape field19266 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public Class3451(Properties var1) {
      super(var1, Direction.UP, field19266, true, 0.14);
   }

   @Override
   public boolean method12127(BlockState var1) {
      return var1.isIn(Blocks.WATER);
   }

   @Override
   public Block method12125() {
      return Blocks.field36962;
   }

   @Override
   public boolean method12123(Block var1) {
      return var1 != Blocks.field36890;
   }

   @Override
   public boolean method11531(IBlockReader var1, BlockPos var2, BlockState var3, Fluid var4) {
      return false;
   }

   @Override
   public boolean method11532(IWorld var1, BlockPos var2, BlockState var3, FluidState var4) {
      return false;
   }

   @Override
   public int method12128(Random var1) {
      return 1;
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      FluidState var4 = var1.getWorld().getFluidState(var1.getPos());
      return var4.method23486(FluidTags.field40469) && var4.method23477() == 8 ? super.getStateForPlacement(var1) : null;
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return Fluids.WATER.getStillFluidState(false);
   }
}
