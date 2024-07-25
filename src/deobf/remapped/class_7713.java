package remapped;

import java.util.EnumSet;

public class class_7713 extends class_3599 {
   private static String[] field_39122;
   private final class_405 field_39121;

   public class_7713(class_405 var1) {
      this.field_39121 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9561, class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      if (this.field_39121.isAlive()) {
         if (!this.field_39121.method_37285()) {
            if (this.field_39121.method_37360()) {
               if (!this.field_39121.field_41743) {
                  class_704 var3 = this.field_39121.method_978();
                  if (var3 != null) {
                     return !(this.field_39121.method_37275(var3) > 16.0) ? var3.field_3874 != null : false;
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
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_39121.method_26927().method_5620();
   }

   @Override
   public void method_16793() {
      this.field_39121.method_975((class_704)null);
   }
}
