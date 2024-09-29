package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class Class3194 extends Block {
   private static String[] field18470;

   public Class3194(Properties var1) {
      super(var1);
   }

   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.isIn(Blocks.field36395)
         || var1.isIn(Blocks.field36396)
         || var1.isIn(Blocks.field36397)
         || var1.isIn(Blocks.field36398)
         || var1.isIn(Blocks.FARMLAND);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var1.method23443(var4, var5) ? super.updatePostPlacement(var1, var2, var3, var4, var5, var6) : Blocks.AIR.getDefaultState();
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      return this.method11490(var2.getBlockState(var6), var2, var6);
   }

   @Override
   public boolean method11493(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23449().isEmpty();
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return var4 == PathType.field12616 && !this.field19005 ? true : super.allowsMovement(var1, var2, var3, var4);
   }
}
