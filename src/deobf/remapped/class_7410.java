package remapped;

import java.util.EnumSet;
import java.util.List;

public class class_7410 extends class_3599 {
   private static String[] field_37835;

   public class_7410(class_5542 var1) {
      this.field_37836 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      if (!this.field_37836.method_26520(class_6943.field_35707).method_28022()) {
         return false;
      } else if (this.field_37836.method_17809() != null || this.field_37836.method_26531() != null) {
         return false;
      } else if (class_5542.method_25208(this.field_37836)) {
         if (this.field_37836.method_26594().nextInt(10) != 0) {
            return false;
         } else {
            List var3 = this.field_37836
               .field_41768
               .<class_91>method_25869(class_91.class, this.field_37836.method_37241().method_18899(8.0, 8.0, 8.0), class_5542.method_25175());
            return !var3.isEmpty() && this.field_37836.method_26520(class_6943.field_35707).method_28022();
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16794() {
      List var3 = this.field_37836
         .field_41768
         .<class_91>method_25869(class_91.class, this.field_37836.method_37241().method_18899(8.0, 8.0, 8.0), class_5542.method_25175());
      ItemStack var4 = this.field_37836.method_26520(class_6943.field_35707);
      if (var4.method_28022() && !var3.isEmpty()) {
         this.field_37836.method_26927().method_5616((Entity)var3.get(0), 1.2F);
      }
   }

   @Override
   public void method_16796() {
      List var3 = this.field_37836
         .field_41768
         .<class_91>method_25869(class_91.class, this.field_37836.method_37241().method_18899(8.0, 8.0, 8.0), class_5542.method_25175());
      if (!var3.isEmpty()) {
         this.field_37836.method_26927().method_5616((Entity)var3.get(0), 1.2F);
      }
   }
}
