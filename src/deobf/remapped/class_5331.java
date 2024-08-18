package remapped;

import java.util.EnumSet;

public class class_5331 extends class_3599 {
   private static String[] field_27197;
   private final class_4612 field_27195;
   private LivingEntity field_27196;
   private double field_27193;
   private double field_27199;
   private double field_27198;
   private final double field_27194;
   private final float field_27192;

   public class_5331(class_4612 var1, double var2, float var4) {
      this.field_27195 = var1;
      this.field_27194 = var2;
      this.field_27192 = var4;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      this.field_27196 = this.field_27195.getAttackTarget();
      if (this.field_27196 != null) {
         if (!(this.field_27196.method_37275(this.field_27195) > (double)(this.field_27192 * this.field_27192))) {
            Vector3d var3 = class_3425.method_15837(this.field_27195, 16, 7, this.field_27196.method_37245());
            if (var3 != null) {
               this.field_27193 = var3.field_7336;
               this.field_27199 = var3.field_7333;
               this.field_27198 = var3.field_7334;
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
   }

   @Override
   public boolean method_16799() {
      return !this.field_27195.method_26927().method_5591()
         && this.field_27196.isAlive()
         && this.field_27196.method_37275(this.field_27195) < (double)(this.field_27192 * this.field_27192);
   }

   @Override
   public void method_16793() {
      this.field_27196 = null;
   }

   @Override
   public void method_16796() {
      this.field_27195.method_26927().method_5595(this.field_27193, this.field_27199, this.field_27198, this.field_27194);
   }
}
