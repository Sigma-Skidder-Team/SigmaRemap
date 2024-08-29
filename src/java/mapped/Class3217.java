package mapped;

import net.minecraft.util.math.BlockPos;

public class Class3217 extends Class3213 {
   private static String[] field18622;
   private final BlockState field18626;

   public Class3217(Block var1, AbstractBlock var2) {
      super(var2);
      this.field18626 = var1.method11579();
   }

   @Override
   public void method11599(World var1, BlockPos var2, BlockState var3, BlockState var4, Class907 var5) {
      if (method11604(var1, var2, var4)) {
         var1.setBlockState(var2, this.field18626, 3);
      }
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      BlockState var6 = var4.getBlockState(var5);
      return !method11604(var4, var5, var6) ? super.method11495(var1) : this.field18626;
   }

   private static boolean method11604(Class1665 var0, BlockPos var1, BlockState var2) {
      return method11606(var2) || method11605(var0, var1);
   }

   private static boolean method11605(Class1665 var0, BlockPos var1) {
      boolean var4 = false;
      Mutable var5 = var1.method8354();

      for (Direction var9 : Direction.values()) {
         BlockState var10 = var0.getBlockState(var5);
         if (var9 != Direction.DOWN || method11606(var10)) {
            var5.method8377(var1, var9);
            var10 = var0.getBlockState(var5);
            if (method11606(var10) && !var10.method23454(var0, var1, var9.method536())) {
               var4 = true;
               break;
            }
         }
      }

      return var4;
   }

   private static boolean method11606(BlockState var0) {
      return var0.method23449().method23486(Class8953.field40469);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !method11605(var4, var5) ? super.method11491(var1, var2, var3, var4, var5, var6) : this.field18626;
   }

   @Override
   public int method11601(BlockState var1, Class1665 var2, BlockPos var3) {
      return var1.method23394(var2, var3).field31006;
   }
}
