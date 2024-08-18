package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_5661 extends class_6967 {
   private static String[] field_28703;
   private final class_6414 field_28701;
   private final MobEntity field_28700;
   private int field_28702;

   public class_5661(class_6414 var1, class_4612 var2, double var3, int var5) {
      super(var2, var3, 24, var5);
      this.field_28701 = var1;
      this.field_28700 = var2;
   }

   @Override
   public boolean method_16795() {
      if (this.field_28700.world.getGameRules().getBoolean(GameRules.MOB_GRIEFING)) {
         if (this.field_35805 <= 0) {
            if (!this.method_25621()) {
               this.field_35805 = this.method_31862(this.field_35801);
               return false;
            } else {
               this.field_35805 = 20;
               return true;
            }
         } else {
            this.field_35805--;
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method_25621() {
      return this.field_35802 != null && this.method_31855(this.field_35801.world, this.field_35802) ? true : this.method_31856();
   }

   @Override
   public void method_16793() {
      super.method_16793();
      this.field_28700.field_41706 = 1.0F;
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_28702 = 0;
   }

   public void method_25623(class_9379 var1, BlockPos var2) {
   }

   public void method_25622(World var1, BlockPos var2) {
   }

   @Override
   public void method_16794() {
      super.method_16794();
      World var3 = this.field_28700.world;
      BlockPos var4 = this.field_28700.method_37075();
      BlockPos var5 = this.method_25624(var4, var3);
      Random var6 = this.field_28700.method_26594();
      if (this.method_31860() && var5 != null) {
         if (this.field_28702 > 0) {
            Vector3d var7 = this.field_28700.method_37098();
            this.field_28700.method_37214(var7.field_7336, 0.3, var7.field_7334);
            if (!var3.field_33055) {
               double var8 = 0.08;
               ((class_6331)var3)
                  .method_28957(
                     new class_8661(class_3090.field_15351, new ItemStack(class_4897.field_24962)),
                     (double)var5.getX() + 0.5,
                     (double)var5.getY() + 0.7,
                     (double)var5.getZ() + 0.5,
                     3,
                     ((double)var6.nextFloat() - 0.5) * 0.08,
                     ((double)var6.nextFloat() - 0.5) * 0.08,
                     ((double)var6.nextFloat() - 0.5) * 0.08,
                     0.15F
                  );
            }
         }

         if (this.field_28702 % 2 == 0) {
            Vector3d var14 = this.field_28700.method_37098();
            this.field_28700.method_37214(var14.field_7336, -0.3, var14.field_7334);
            if (this.field_28702 % 6 == 0) {
               this.method_25623(var3, this.field_35802);
            }
         }

         if (this.field_28702 > 60) {
            var3.method_7508(var5, false);
            if (!var3.field_33055) {
               for (int var15 = 0; var15 < 20; var15++) {
                  double var16 = var6.nextGaussian() * 0.02;
                  double var10 = var6.nextGaussian() * 0.02;
                  double var12 = var6.nextGaussian() * 0.02;
                  ((class_6331)var3)
                     .method_28957(
                        class_3090.field_15343,
                        (double)var5.getX() + 0.5,
                        (double)var5.getY(),
                        (double)var5.getZ() + 0.5,
                        1,
                        var16,
                        var10,
                        var12,
                        0.15F
                     );
               }

               this.method_25622(var3, var5);
            }
         }

         this.field_28702++;
      }
   }

   @Nullable
   private BlockPos method_25624(BlockPos var1, class_6163 var2) {
      if (var2.method_28262(var1).method_8350(this.field_28701)) {
         return var1;
      } else {
         BlockPos[] var5 = new BlockPos[]{
            var1.method_6100(), var1.method_6108(), var1.method_6090(), var1.method_6094(), var1.method_6073(), var1.method_6100().method_6100()
         };

         for (BlockPos var9 : var5) {
            if (var2.method_28262(var9).method_8350(this.field_28701)) {
               return var9;
            }
         }

         return null;
      }
   }

   @Override
   public boolean method_31855(class_4924 var1, BlockPos var2) {
      class_5990 var5 = var1.method_22555(var2.getX() >> 4, var2.getZ() >> 4, class_7335.field_37514, false);
      return var5 == null
         ? false
         : var5.method_28262(var2).method_8350(this.field_28701)
            && var5.method_28262(var2.method_6081()).method_8345()
            && var5.method_28262(var2.method_6082(2)).method_8345();
   }
}
