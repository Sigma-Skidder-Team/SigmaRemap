package remapped;

import java.util.EnumSet;

public class class_5472 extends class_5668 {
   private static String[] field_27888;

   public class_5472(class_5886 var1) {
      super(var1, 6, class_298.method_1337());
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16799() {
      class_298 var3 = (class_298)this.field_9241;
      return var3.method_18600() && super.method_16799();
   }

   @Override
   public boolean method_16795() {
      class_298 var3 = (class_298)this.field_9241;
      return var3.method_18600() && class_298.method_1339(var3).nextInt(10) == 0 && super.method_16795();
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_9241.method_26441(0);
   }
}
