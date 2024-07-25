package remapped;

import java.util.EnumSet;

public class class_1738 extends class_3599 {
   private static String[] field_8953;
   public int field_8952;

   public class_1738(class_5542 var1) {
      this.field_8951 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9560, class_1891.field_9561, class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      return this.field_8951.method_25212();
   }

   @Override
   public boolean method_16799() {
      return this.method_16795() && this.field_8952 > 0;
   }

   @Override
   public void method_16796() {
      this.field_8952 = 40;
   }

   @Override
   public void method_16793() {
      class_5542.method_25203(this.field_8951, false);
   }

   @Override
   public void method_16794() {
      this.field_8952--;
   }
}
