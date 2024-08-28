package mapped;

import java.util.Random;

public class Class3479 extends Class3194 implements Class3196 {
   private static String[] field18470;
   public static final Class6408 field19332 = Block.method11539(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

   public Class3479(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19332;
   }

   @Override
   public void method11484(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (var4.nextInt(25) == 0) {
         int var7 = 5;
         byte var8 = 4;

         for (BlockPos var10 : BlockPos.method8359(var3.method8336(-4, -1, -4), var3.method8336(4, 1, 4))) {
            if (var2.method6738(var10).method23448(this)) {
               if (--var7 <= 0) {
                  return;
               }
            }
         }

         BlockPos var11 = var3.method8336(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);

         for (int var12 = 0; var12 < 4; var12++) {
            if (var2.method7007(var11) && var1.method23443(var2, var11)) {
               var3 = var11;
            }

            var11 = var3.method8336(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);
         }

         if (var2.method7007(var11) && var1.method23443(var2, var11)) {
            var2.method6725(var11, var1, 2);
         }
      }
   }

   @Override
   public boolean method11490(Class7380 var1, Class1665 var2, BlockPos var3) {
      return var1.method23409(var2, var3);
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.method8313();
      Class7380 var7 = var2.method6738(var6);
      return var7.method23446(Class7645.field32814) ? true : var2.method7021(var3, 0) < 13 && this.method11490(var7, var2, var6);
   }

   public boolean method12174(Class1657 var1, BlockPos var2, Class7380 var3, Random var4) {
      var1.method6728(var2, false);
      Class7909 var7;
      if (this != Blocks.BROWN_MUSHROOM) {
         if (this != Blocks.RED_MUSHROOM) {
            var1.method6725(var2, var3, 3);
            return false;
         }

         var7 = Class9104.field41769;
      } else {
         var7 = Class9104.field41768;
      }

      if (!var7.method26521(var1, var1.method6883().method7370(), var4, var2)) {
         var1.method6725(var2, var3, 3);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, Class7380 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(Class1655 var1, Random var2, BlockPos var3, Class7380 var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   public void method11488(Class1657 var1, Random var2, BlockPos var3, Class7380 var4) {
      this.method12174(var1, var3, var4, var2);
   }
}
