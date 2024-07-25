package remapped;

import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;

public class class_2652 extends class_3599 {
   private final class_5886 field_13054;
   private final Predicate<class_5886> field_13062;
   private class_5886 field_13055;
   private final double field_13058;
   private final class_1249 field_13063;
   private int field_13059;
   private final float field_13060;
   private float field_13056;
   private final float field_13057;

   public class_2652(class_5886 var1, double var2, float var4, float var5) {
      this.field_13054 = var1;
      this.field_13062 = var1x -> var1x != null && var1.getClass() != var1x.getClass();
      this.field_13058 = var2;
      this.field_13063 = var1.method_26927();
      this.field_13060 = var4;
      this.field_13057 = var5;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
      if (!(var1.method_26927() instanceof class_8985) && !(var1.method_26927() instanceof class_5133)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean method_16795() {
      List var3 = this.field_13054
         .field_41768
         .<class_5886>method_25869(class_5886.class, this.field_13054.method_37241().method_18898((double)this.field_13057), this.field_13062);
      if (!var3.isEmpty()) {
         for (class_5886 var5 : var3) {
            if (!var5.method_37109()) {
               this.field_13055 = var5;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean method_16799() {
      return this.field_13055 != null
         && !this.field_13063.method_5591()
         && this.field_13054.method_37275(this.field_13055) > (double)(this.field_13060 * this.field_13060);
   }

   @Override
   public void method_16796() {
      this.field_13059 = 0;
      this.field_13056 = this.field_13054.method_26931(class_1108.field_6359);
      this.field_13054.method_26895(class_1108.field_6359, 0.0F);
   }

   @Override
   public void method_16793() {
      this.field_13055 = null;
      this.field_13063.method_5620();
      this.field_13054.method_26895(class_1108.field_6359, this.field_13056);
   }

   @Override
   public void method_16794() {
      if (this.field_13055 != null && !this.field_13054.method_26920()) {
         this.field_13054.method_26865().method_17240(this.field_13055, 10.0F, (float)this.field_13054.method_26862());
         if (--this.field_13059 <= 0) {
            this.field_13059 = 10;
            double var3 = this.field_13054.method_37302() - this.field_13055.method_37302();
            double var5 = this.field_13054.method_37309() - this.field_13055.method_37309();
            double var7 = this.field_13054.method_37156() - this.field_13055.method_37156();
            double var9 = var3 * var3 + var5 * var5 + var7 * var7;
            if (var9 <= (double)(this.field_13060 * this.field_13060)) {
               this.field_13063.method_5620();
               class_3711 var11 = this.field_13055.method_26865();
               if (var9 <= (double)this.field_13060
                  || var11.method_17237() == this.field_13054.method_37302()
                     && var11.method_17244() == this.field_13054.method_37309()
                     && var11.method_17242() == this.field_13054.method_37156()) {
                  double var12 = this.field_13055.method_37302() - this.field_13054.method_37302();
                  double var14 = this.field_13055.method_37156() - this.field_13054.method_37156();
                  this.field_13063
                     .method_5595(
                        this.field_13054.method_37302() - var12, this.field_13054.method_37309(), this.field_13054.method_37156() - var14, this.field_13058
                     );
               }
            } else {
               this.field_13063.method_5616(this.field_13055, this.field_13058);
            }
         }
      }
   }
}
