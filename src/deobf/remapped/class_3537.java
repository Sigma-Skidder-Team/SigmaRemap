package remapped;

import java.util.EnumSet;

public class class_3537 extends class_3599 {
   private static String[] field_17306;
   private final class_4612 field_17304;
   private double field_17307;
   private double field_17303;
   private double field_17308;
   private final double field_17305;

   public class_3537(class_4612 var1, double var2) {
      this.field_17304 = var1;
      this.field_17305 = var2;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      if (!this.field_17304.method_26867()) {
         class_1343 var3 = class_3425.method_15837(this.field_17304, 16, 7, class_1343.method_6200(this.field_17304.method_26885()));
         if (var3 != null) {
            this.field_17307 = var3.field_7336;
            this.field_17303 = var3.field_7333;
            this.field_17308 = var3.field_7334;
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
      return !this.field_17304.method_26927().method_5591();
   }

   @Override
   public void method_16796() {
      this.field_17304.method_26927().method_5595(this.field_17307, this.field_17303, this.field_17308, this.field_17305);
   }
}
