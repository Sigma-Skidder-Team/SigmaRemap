package remapped;

import java.util.EnumSet;

public class class_5591 extends class_3599 {
   private final class_8990 field_28380;
   private class_5834 field_28374;
   private final class_4924 field_28376;
   private final double field_28379;
   private final class_1249 field_28383;
   private int field_28382;
   private final float field_28381;
   private final float field_28375;
   private float field_28378;
   private final boolean field_28377;

   public class_5591(class_8990 var1, double var2, float var4, float var5, boolean var6) {
      this.field_28380 = var1;
      this.field_28376 = var1.world;
      this.field_28379 = var2;
      this.field_28383 = var1.method_26927();
      this.field_28375 = var4;
      this.field_28381 = var5;
      this.field_28377 = var6;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
      if (!(var1.method_26927() instanceof class_8985) && !(var1.method_26927() instanceof class_5133)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean method_16795() {
      class_5834 var3 = this.field_28380.method_41207();
      if (var3 != null) {
         if (!var3.method_37221()) {
            if (!this.field_28380.method_41216()) {
               if (!(this.field_28380.method_37275(var3) < (double)(this.field_28375 * this.field_28375))) {
                  this.field_28374 = var3;
                  return true;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      if (!this.field_28383.method_5591()) {
         return !this.field_28380.method_41216() ? !(this.field_28380.method_37275(this.field_28374) <= (double)(this.field_28381 * this.field_28381)) : false;
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_28382 = 0;
      this.field_28378 = this.field_28380.method_26931(class_1108.field_6359);
      this.field_28380.method_26895(class_1108.field_6359, 0.0F);
   }

   @Override
   public void method_16793() {
      this.field_28374 = null;
      this.field_28383.method_5620();
      this.field_28380.method_26895(class_1108.field_6359, this.field_28378);
   }

   @Override
   public void method_16794() {
      this.field_28380.method_26865().method_17240(this.field_28374, 10.0F, (float)this.field_28380.method_26862());
      if (--this.field_28382 <= 0) {
         this.field_28382 = 10;
         if (!this.field_28380.method_26920() && !this.field_28380.isPassenger()) {
            if (!(this.field_28380.method_37275(this.field_28374) >= 144.0)) {
               this.field_28383.method_5616(this.field_28374, this.field_28379);
            } else {
               this.method_25392();
            }
         }
      }
   }

   private void method_25392() {
      BlockPos var3 = this.field_28374.method_37075();

      for (int var4 = 0; var4 < 10; var4++) {
         int var5 = this.method_25393(-3, 3);
         int var6 = this.method_25393(-1, 1);
         int var7 = this.method_25393(-3, 3);
         boolean var8 = this.method_25394(var3.method_12173() + var5, var3.method_12165() + var6, var3.method_12185() + var7);
         if (var8) {
            return;
         }
      }
   }

   private boolean method_25394(int var1, int var2, int var3) {
      if (Math.abs((double)var1 - this.field_28374.getPosX()) < 2.0 && Math.abs((double)var3 - this.field_28374.getPosZ()) < 2.0) {
         return false;
      } else if (this.method_25395(new BlockPos(var1, var2, var3))) {
         this.field_28380.method_37144((double)var1 + 0.5, (double)var2, (double)var3 + 0.5, this.field_28380.rotationYaw, this.field_28380.rotationPitch);
         this.field_28383.method_5620();
         return true;
      } else {
         return false;
      }
   }

   private boolean method_25395(BlockPos var1) {
      class_1108 var4 = class_2266.method_10452(this.field_28376, var1.method_6089());
      if (var4 == class_1108.field_6343) {
         class_2522 var5 = this.field_28376.method_28262(var1.method_6100());
         if (!this.field_28377 && var5.method_8360() instanceof class_4423) {
            return false;
         } else {
            BlockPos var6 = var1.method_6093(this.field_28380.method_37075());
            return this.field_28376.method_6683(this.field_28380, this.field_28380.method_37241().method_18919(var6));
         }
      } else {
         return false;
      }
   }

   private int method_25393(int var1, int var2) {
      return this.field_28380.method_26594().nextInt(var2 - var1 + 1) + var1;
   }
}
