package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class Class3227 extends Class3224 {
   private static String[] field18662;
   private static final VoxelShape field18664 = Block.method11539(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   public Class3227(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18664;
   }
}
