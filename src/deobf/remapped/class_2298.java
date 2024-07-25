package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2298 extends class_5837 {
   private static final Logger field_11480 = LogManager.getLogger();
   private final class_7986 field_11478;

   private class_2298(class_7279[] var1, class_7986 var2) {
      super(var1);
      this.field_11478 = var2;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26382;
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      if (!var1.method_27959()) {
         field_11480.warn("Couldn't set damage of loot item {}", var1);
      } else {
         float var5 = 1.0F - this.field_11478.method_36244(var2.method_12693());
         var1.method_27999(class_9299.method_42848(var5 * (float)var1.method_27957()));
      }

      return var1;
   }

   public static class_5363<?> method_10570(class_7986 var0) {
      return method_26628(var1 -> new class_2298(var1, var0));
   }
}
