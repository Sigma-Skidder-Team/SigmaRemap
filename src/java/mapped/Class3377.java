package mapped;

import java.util.Random;

public class Class3377 extends Class3231 {
   private static String[] field18977;

   public Class3377(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      super.method11562(var1, var2, var3, var4, var5, var6);
      if (Class7858.method26311(Class8122.field34916, var6) == 0) {
         if (var1.method6812().method36877()) {
            var1.method6728(var3, false);
            return;
         }

         Class8649 var9 = var1.getBlockState(var3.method8313()).method23384();
         if (var9.method31087() || var9.method31085()) {
            var1.method6730(var3, Blocks.WATER.method11579());
         }
      }
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.method7020(Class1977.field12882, var3) > 11 - var1.method23387(var2, var3)) {
         this.method11968(var1, var2, var3);
      }
   }

   public void method11968(BlockState var1, World var2, BlockPos var3) {
      if (!var2.method6812().method36877()) {
         var2.method6730(var3, Blocks.WATER.method11579());
         var2.method6735(var3, Blocks.WATER, var3);
      } else {
         var2.method6728(var3, false);
      }
   }

   @Override
   public Class2315 method11689(BlockState var1) {
      return Class2315.field15862;
   }
}
