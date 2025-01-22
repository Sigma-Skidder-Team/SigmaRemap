package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class DeadCoralBlock extends Class3224 {
   private static String[] field18662;
   public static final VoxelShape field18664 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   public DeadCoralBlock(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18664;
   }
}
