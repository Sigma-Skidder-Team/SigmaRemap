package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1130 implements class_7279 {
   private static final Logger field_6442 = LogManager.getLogger();
   private final class_4639 field_6441;

   private class_1130(class_4639 var1) {
      this.field_6441 = var1;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26355;
   }

   @Override
   public void method_12680(class_4737 var1) {
      if (!var1.method_21882(this.field_6441)) {
         class_7279.super.method_12680(var1);
         class_7279 var4 = var1.method_21893(this.field_6441);
         if (var4 != null) {
            var4.method_12680(var1.method_21894(".{" + this.field_6441 + "}", this.field_6441));
         } else {
            var1.method_21892("Unknown condition table called " + this.field_6441);
         }
      } else {
         var1.method_21892("Condition " + this.field_6441 + " is recursively called");
      }
   }

   public boolean test(class_2792 var1) {
      class_7279 var4 = var1.method_12692(this.field_6441);
      if (var1.method_12696(var4)) {
         boolean var5;
         try {
            var5 = var4.test(var1);
         } finally {
            var1.method_12690(var4);
         }

         return var5;
      } else {
         field_6442.warn("Detected infinite loop in loot tables");
         return false;
      }
   }
}
