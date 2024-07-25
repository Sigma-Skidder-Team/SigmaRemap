package remapped;

import java.util.EnumSet;

public class class_9037 extends class_3599 {
   private static String[] field_46240;
   public final class_4612 field_46244;
   private final double field_46241;
   private final boolean field_46246;
   private class_3998 field_46242;
   private double field_46247;
   private double field_46239;
   private double field_46245;
   private int field_46237;
   private int field_46238;
   private final int field_46236 = 20;
   private long field_46243;

   public class_9037(class_4612 var1, double var2, boolean var4) {
      this.field_46244 = var1;
      this.field_46241 = var2;
      this.field_46246 = var4;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      long var3 = this.field_46244.world.method_29546();
      if (var3 - this.field_46243 >= 20L) {
         this.field_46243 = var3;
         class_5834 var5 = this.field_46244.method_17809();
         if (var5 != null) {
            if (var5.method_37330()) {
               this.field_46242 = this.field_46244.method_26927().method_5598(var5, 0);
               return this.field_46242 == null
                  ? this.method_41492(var5) >= this.field_46244.method_37273(var5.method_37302(), var5.method_37309(), var5.method_37156())
                  : true;
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
      class_5834 var3 = this.field_46244.method_17809();
      if (var3 != null) {
         if (!var3.method_37330()) {
            return false;
         } else if (this.field_46246) {
            return !this.field_46244.method_26880(var3.method_37075())
               ? false
               : !(var3 instanceof class_704) || !var3.method_37221() && !((class_704)var3).method_3186();
         } else {
            return !this.field_46244.method_26927().method_5591();
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_46244.method_26927().method_5607(this.field_46242, this.field_46241);
      this.field_46244.method_26891(true);
      this.field_46237 = 0;
      this.field_46238 = 0;
   }

   @Override
   public void method_16793() {
      class_5834 var3 = this.field_46244.method_17809();
      if (!class_3572.field_17479.test(var3)) {
         this.field_46244.method_26860((class_5834)null);
      }

      this.field_46244.method_26891(false);
      this.field_46244.method_26927().method_5620();
   }

   @Override
   public void method_16794() {
      class_5834 var3 = this.field_46244.method_17809();
      this.field_46244.method_26865().method_17240(var3, 30.0F, 30.0F);
      double var4 = this.field_46244.method_37273(var3.method_37302(), var3.method_37309(), var3.method_37156());
      this.field_46237 = Math.max(this.field_46237 - 1, 0);
      if ((this.field_46246 || this.field_46244.method_26928().method_36736(var3))
         && this.field_46237 <= 0
         && (
            this.field_46247 == 0.0 && this.field_46239 == 0.0 && this.field_46245 == 0.0
               || var3.method_37273(this.field_46247, this.field_46239, this.field_46245) >= 1.0
               || this.field_46244.method_26594().nextFloat() < 0.05F
         )) {
         this.field_46247 = var3.method_37302();
         this.field_46239 = var3.method_37309();
         this.field_46245 = var3.method_37156();
         this.field_46237 = 4 + this.field_46244.method_26594().nextInt(7);
         if (!(var4 > 1024.0)) {
            if (var4 > 256.0) {
               this.field_46237 += 5;
            }
         } else {
            this.field_46237 += 10;
         }

         if (!this.field_46244.method_26927().method_5616(var3, this.field_46241)) {
            this.field_46237 += 15;
         }
      }

      this.field_46238 = Math.max(this.field_46238 - 1, 0);
      this.method_41489(var3, var4);
   }

   public void method_41489(class_5834 var1, double var2) {
      double var6 = this.method_41492(var1);
      if (var2 <= var6 && this.field_46238 <= 0) {
         this.method_41491();
         this.field_46244.method_26597(Hand.MAIN_HAND);
         this.field_46244.method_26442(var1);
      }
   }

   public void method_41491() {
      this.field_46238 = 20;
   }

   public boolean method_41493() {
      return this.field_46238 <= 0;
   }

   public int method_41494() {
      return this.field_46238;
   }

   public int method_41490() {
      return 20;
   }

   public double method_41492(class_5834 var1) {
      return (double)(this.field_46244.method_37086() * 2.0F * this.field_46244.method_37086() * 2.0F + var1.method_37086());
   }
}
