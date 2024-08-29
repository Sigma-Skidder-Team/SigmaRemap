package mapped;

import java.util.Random;

public class Class3381 extends Block {
   private static String[] field18982;
   public static final VoxelShape field18983 = Block.method11539(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   public final Class7436 field18984;

   public Class3381(AbstractBlock var1, Class7436 var2) {
      super(var1);
      this.field18984 = var2;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field18983;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !this.method11492(var1, var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return method11548(var2, var3.down(), Direction.field673);
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX() + 0.5;
      double var9 = (double)var3.getY() + 0.7;
      double var11 = (double)var3.getZ() + 0.5;
      var2.method6746(Class7940.field34092, var7, var9, var11, 0.0, 0.0, 0.0);
      var2.method6746(this.field18984, var7, var9, var11, 0.0, 0.0, 0.0);
   }
}
