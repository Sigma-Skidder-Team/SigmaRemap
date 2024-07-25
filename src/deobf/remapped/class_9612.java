package remapped;

import java.util.EnumSet;

public class class_9612 extends class_3599 {
   private static String[] field_48979;
   private final class_378 field_48980;

   public class_9612(class_378 var1) {
      this.field_48980 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.JUMP, Flag.MOVE));
      var1.method_26927().method_5611(true);
   }

   @Override
   public boolean method_16795() {
      return (this.field_48980.method_37285() || this.field_48980.method_37370()) && this.field_48980.method_26905() instanceof class_8509;
   }

   @Override
   public void method_16794() {
      if (this.field_48980.method_26594().nextFloat() < 0.8F) {
         this.field_48980.method_26886().method_18772();
      }

      ((class_8509)this.field_48980.method_26905()).method_39182(1.2);
   }
}
