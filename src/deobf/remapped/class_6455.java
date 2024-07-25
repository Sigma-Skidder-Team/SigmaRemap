package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6455 {
   private static final Logger field_32913 = LogManager.getLogger();
   private final class_2770 field_32912;
   private final class_5120[] field_32910 = new class_5120[class_8978.method_41170()];
   private class_5120 field_32909;

   public class_6455(class_2770 var1) {
      this.field_32912 = var1;
      this.method_29422(class_8978.field_46000);
   }

   public void method_29422(class_8978<?> var1) {
      if (this.field_32909 == null || var1 != this.field_32909.method_23464()) {
         if (this.field_32909 != null) {
            this.field_32909.method_23471();
         }

         this.field_32909 = this.<class_5120>method_29420(var1);
         if (!this.field_32912.field_41768.field_33055) {
            this.field_32912.method_37372().method_36633(class_2770.field_13536, var1.method_41171());
         }

         field_32913.debug("Dragon is now in phase {} on the {}", var1, !this.field_32912.field_41768.field_33055 ? "server" : "client");
         this.field_32909.method_23469();
      }
   }

   public class_5120 method_29421() {
      return this.field_32909;
   }

   public <T extends class_5120> T method_29420(class_8978<T> var1) {
      int var4 = var1.method_41171();
      if (this.field_32910[var4] == null) {
         this.field_32910[var4] = var1.method_41166(this.field_32912);
      }

      return (T)this.field_32910[var4];
   }
}
