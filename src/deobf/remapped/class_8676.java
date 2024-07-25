package remapped;

import java.util.List;

public class class_8676 extends class_3599 {
   private static String[] field_44533;
   private final class_5467 field_44530;
   private class_5467 field_44534;
   private final double field_44531;
   private int field_44532;

   public class_8676(class_5467 var1, double var2) {
      this.field_44530 = var1;
      this.field_44531 = var2;
   }

   @Override
   public boolean method_16795() {
      if (this.field_44530.method_8634() < 0) {
         List var3 = this.field_44530.world.method_25868(this.field_44530.getClass(), this.field_44530.getBoundingBox().method_18899(8.0, 4.0, 8.0));
         class_5467 var4 = null;
         double var5 = Double.MAX_VALUE;

         for (class_5467 var8 : var3) {
            if (var8.method_8634() >= 0) {
               double var9 = this.field_44530.method_37275(var8);
               if (!(var9 > var5)) {
                  var5 = var9;
                  var4 = var8;
               }
            }
         }

         if (var4 == null) {
            return false;
         } else if (!(var5 < 9.0)) {
            this.field_44534 = var4;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      if (this.field_44530.method_8634() < 0) {
         if (!this.field_44534.isAlive()) {
            return false;
         } else {
            double var3 = this.field_44530.method_37275(this.field_44534);
            return !(var3 < 9.0) && !(var3 > 256.0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_44532 = 0;
   }

   @Override
   public void method_16793() {
      this.field_44534 = null;
   }

   @Override
   public void method_16794() {
      if (--this.field_44532 <= 0) {
         this.field_44532 = 10;
         this.field_44530.method_26927().method_5616(this.field_44534, this.field_44531);
      }
   }
}
