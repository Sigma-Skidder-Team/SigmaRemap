package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public enum Class2156 {
   field14140 {
      @Override
      public boolean method8876(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
         return Block.method11549(var1.method23416(var2, var3), var4);
      }
   },
   field14141 {
      private final int field14144 = 1;
      private final VoxelShape field14145 = Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean method8876(BlockState blockState, IBlockReader class1665, BlockPos var3, Direction var4) {
         return ! VoxelShapes.compare(blockState.method23416(class1665, var3).method19526(var4), this.field14145, IBooleanFunction.field44039);
      }
   },
   field14142 {
      private final int field14146 = 2;
      private final VoxelShape field14147 = VoxelShapes.combineAndSimplify(VoxelShapes.method27426(), Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), IBooleanFunction.ONLY_FIRST);

      @Override
      public boolean method8876(BlockState blockState, IBlockReader class1665, BlockPos var3, Direction var4) {
         return ! VoxelShapes.compare(blockState.method23416(class1665, var3).method19526(var4), this.field14147, IBooleanFunction.field44039);
      }
   };

   private static final Class2156[] field14143 = new Class2156[]{field14140, field14141, field14142};

   private Class2156() {
   }

   public abstract boolean method8876(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4);
}
