package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
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
         || var6 == Blocks.TERRACOTTA
         || var6 == Blocks.WHITE_TERRACOTTA
         || var6 == Blocks.ORANGE_TERRACOTTA
         || var6 == Blocks.MAGENTA_TERRACOTTA
         || var6 == Blocks.LIGHT_BLUE_TERRACOTTA
         || var6 == Blocks.YELLOW_TERRACOTTA
         || var6 == Blocks.LIME_TERRACOTTA
         || var6 == Blocks.PINK_TERRACOTTA
         || var6 == Blocks.GRAY_TERRACOTTA
         || var6 == Blocks.LIGHT_GRAY_TERRACOTTA
         || var6 == Blocks.CYAN_TERRACOTTA
         || var6 == Blocks.PURPLE_TERRACOTTA
         || var6 == Blocks.BLUE_TERRACOTTA
         || var6 == Blocks.BROWN_TERRACOTTA
         || var6 == Blocks.GREEN_TERRACOTTA
         || var6 == Blocks.RED_TERRACOTTA
         || var6 == Blocks.BLACK_TERRACOTTA
         || var6 == Blocks.DIRT
         || var6 == Blocks.COARSE_DIRT
         || var6 == Blocks.PODZOL;
   }
}
