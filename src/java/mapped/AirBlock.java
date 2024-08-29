package mapped;

import net.minecraft.util.math.BlockPos;

public class AirBlock extends Block {
   private static String[] field19128;

   public AirBlock(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9885;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.method27425();
   }
}
