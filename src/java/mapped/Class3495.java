package mapped;

import net.minecraft.util.math.BlockPos;

public class Class3495 extends Class3194 {
   private static String[] field18470;
   public static final VoxelShape field19365 = Block.method11539(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public Class3495(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field19365;
   }

   @Override
   public boolean method11490(BlockState var1, Class1665 var2, BlockPos var3) {
      return var1.method23446(BlockTags.field32799) || var1.method23448(Blocks.SOUL_SOIL) || super.method11490(var1, var2, var3);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }
}
