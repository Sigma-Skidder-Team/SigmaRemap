package remapped;

import java.util.EnumSet;

public class class_990 extends class_3599 {
   private static String[] field_5041;
   private final class_912 field_5040;
   private class_5834 field_5042;

   public class_990(class_912 var1) {
      this.field_5040 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9561, class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      this.field_5042 = this.field_5040.method_17809();
      if (this.field_5042 instanceof class_704) {
         double var3 = this.field_5042.method_37275(this.field_5040);
         return !(var3 > 256.0) ? class_912.method_3906(this.field_5040, (class_704)this.field_5042) : false;
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_5040.method_26927().method_5620();
   }

   @Override
   public void method_16794() {
      this.field_5040.method_26865().method_17230(this.field_5042.method_37302(), this.field_5042.method_37388(), this.field_5042.method_37156());
   }
}