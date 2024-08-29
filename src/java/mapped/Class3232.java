package mapped;

import net.minecraft.util.math.BlockPos;

public abstract class Class3232 extends Class3231 {
   public Class3232(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public VoxelShape method11635(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.method27425();
   }

   @Override
   public float method11636(BlockState var1, Class1665 var2, BlockPos var3) {
      return 1.0F;
   }

   @Override
   public boolean method11493(BlockState var1, Class1665 var2, BlockPos var3) {
      return true;
   }
}
