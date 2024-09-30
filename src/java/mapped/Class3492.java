package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;

public class Class3492 extends BushBlock {
   private static String[] field18470;
   public static final VoxelShape field19360 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public Class3492(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19360;
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      Block var6 = state.getBlock();
      return var6 == Blocks.SAND
         || var6 == Blocks.RED_SAND
         || var6 == Blocks.field36794
         || var6 == Blocks.field36730
         || var6 == Blocks.field36731
         || var6 == Blocks.field36732
         || var6 == Blocks.field36733
         || var6 == Blocks.field36734
         || var6 == Blocks.field36735
         || var6 == Blocks.field36736
         || var6 == Blocks.field36737
         || var6 == Blocks.field36738
         || var6 == Blocks.field36739
         || var6 == Blocks.field36740
         || var6 == Blocks.field36741
         || var6 == Blocks.field36742
         || var6 == Blocks.field36743
         || var6 == Blocks.field36744
         || var6 == Blocks.field36745
         || var6 == Blocks.DIRT
         || var6 == Blocks.COARSE_DIRT
         || var6 == Blocks.PODZOL;
   }
}
