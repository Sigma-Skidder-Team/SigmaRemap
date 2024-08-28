package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class2632 extends Class2628 {
   private static String[] field16944;
   private final Block field16945;
   private final Class1006 field16946;
   private int field16947;

   public Class2632(Block var1, Class1046 var2, double var3, int var5) {
      super(var2, var3, 24, var5);
      this.field16945 = var1;
      this.field16946 = var2;
   }

   @Override
   public boolean method10803() {
      if (this.field16946.field5024.method6789().method17135(Class5462.field24224)) {
         if (this.field16930 <= 0) {
            if (!this.method10841()) {
               this.field16930 = this.method10833(this.field16928);
               return false;
            } else {
               this.field16930 = 20;
               return true;
            }
         } else {
            this.field16930--;
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method10841() {
      return this.field16933 != null && this.method10840(this.field16928.field5024, this.field16933) ? true : this.method10839();
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field16946.field5045 = 1.0F;
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field16947 = 0;
   }

   public void method10842(Class1660 var1, BlockPos var2) {
   }

   public void method10843(Class1655 var1, BlockPos var2) {
   }

   @Override
   public void method10805() {
      super.method10805();
      Class1655 var3 = this.field16946.field5024;
      BlockPos var4 = this.field16946.method3432();
      BlockPos var5 = this.method10844(var4, var3);
      Random var6 = this.field16946.method3013();
      if (this.method10838() && var5 != null) {
         if (this.field16947 > 0) {
            Vector3d var7 = this.field16946.method3433();
            this.field16946.method3435(var7.field18048, 0.3, var7.field18050);
            if (!var3.field9020) {
               double var8 = 0.08;
               ((ServerWorld)var3)
                  .method6939(
                     new Class7438(Class7940.field34082, new ItemStack(Class8514.field37904)),
                     (double)var5.method8304() + 0.5,
                     (double)var5.getY() + 0.7,
                     (double)var5.method8306() + 0.5,
                     3,
                     ((double)var6.nextFloat() - 0.5) * 0.08,
                     ((double)var6.nextFloat() - 0.5) * 0.08,
                     ((double)var6.nextFloat() - 0.5) * 0.08,
                     0.15F
                  );
            }
         }

         if (this.field16947 % 2 == 0) {
            Vector3d var14 = this.field16946.method3433();
            this.field16946.method3435(var14.field18048, -0.3, var14.field18050);
            if (this.field16947 % 6 == 0) {
               this.method10842(var3, this.field16933);
            }
         }

         if (this.field16947 > 60) {
            var3.method6728(var5, false);
            if (!var3.field9020) {
               for (int var15 = 0; var15 < 20; var15++) {
                  double var16 = var6.nextGaussian() * 0.02;
                  double var10 = var6.nextGaussian() * 0.02;
                  double var12 = var6.nextGaussian() * 0.02;
                  ((ServerWorld)var3)
                     .method6939(
                        Class7940.field34089,
                        (double)var5.method8304() + 0.5,
                        (double)var5.getY(),
                        (double)var5.method8306() + 0.5,
                        1,
                        var16,
                        var10,
                        var12,
                        0.15F
                     );
               }

               this.method10843(var3, var5);
            }
         }

         this.field16947++;
      }
   }

   @Nullable
   private BlockPos method10844(BlockPos var1, Class1665 var2) {
      if (var2.method6738(var1).method23448(this.field16945)) {
         return var1;
      } else {
         BlockPos[] var5 = new BlockPos[]{
            var1.method8313(), var1.method8345(), var1.method8347(), var1.method8341(), var1.method8343(), var1.method8313().method8313()
         };

         for (BlockPos var9 : var5) {
            if (var2.method6738(var9).method23448(this.field16945)) {
               return var9;
            }
         }

         return null;
      }
   }

   @Override
   public boolean method10840(Class1662 var1, BlockPos var2) {
      Class1670 var5 = var1.method6724(var2.method8304() >> 4, var2.method8306() >> 4, Class9176.field42145, false);
      return var5 == null
         ? false
         : var5.method6738(var2).method23448(this.field16945)
            && var5.method6738(var2.method8311()).method23393()
            && var5.method6738(var2.method8339(2)).method23393();
   }
}
