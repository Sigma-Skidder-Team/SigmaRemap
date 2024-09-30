package net.minecraft.block;

import net.minecraft.pathfinding.PathType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class BushBlock extends Block {

   public BushBlock(Properties var1) {
      super(var1);
   }

   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return state.isIn(Blocks.GRASS_BLOCK)
         || state.isIn(Blocks.DIRT)
         || state.isIn(Blocks.COARSE_DIRT)
         || state.isIn(Blocks.PODZOL)
         || state.isIn(Blocks.FARMLAND);
   }

   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var1.isValidPosition(var4, var5) ? super.updatePostPlacement(var1, var2, var3, var4, var5, var6) : Blocks.AIR.getDefaultState();
   }

   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      return this.isValidGround(var2.getBlockState(var6), var2, var6);
   }

   public boolean propagatesSkylightDown(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23449().isEmpty();
   }

   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return var4 == PathType.AIR && !this.canCollide ? true : super.allowsMovement(var1, var2, var3, var4);
   }
}
