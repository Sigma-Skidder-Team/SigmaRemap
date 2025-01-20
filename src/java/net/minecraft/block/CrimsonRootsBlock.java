package net.minecraft.block;

import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class CrimsonRootsBlock extends BushBlock {
   private static String[] field18470;
   public static final VoxelShape field19365 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public CrimsonRootsBlock(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19365;
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return state.isIn(BlockTags.field32799) || state.isIn(Blocks.SOUL_SOIL) || super.isValidGround(state, var2, var3);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }
}
