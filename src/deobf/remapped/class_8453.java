package remapped;

import java.util.EnumSet;

public class class_8453 extends class_3599 {
   private static String[] field_43219;
   private final class_8990 field_43220;

   public class_8453(class_8990 var1) {
      this.field_43220 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9561, class_1891.field_9564));
   }

   @Override
   public boolean method_16799() {
      return this.field_43220.method_41216();
   }

   @Override
   public boolean method_16795() {
      if (this.field_43220.method_41215()) {
         if (this.field_43220.method_37134()) {
            return false;
         } else if (this.field_43220.method_37360()) {
            class_5834 var3 = this.field_43220.method_41207();
            if (var3 == null) {
               return true;
            } else {
               return this.field_43220.method_37275(var3) < 144.0 && var3.method_26531() != null ? false : this.field_43220.method_41216();
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_43220.method_26927().method_5620();
      this.field_43220.method_41214(true);
   }

   @Override
   public void method_16793() {
      this.field_43220.method_41214(false);
   }
}
