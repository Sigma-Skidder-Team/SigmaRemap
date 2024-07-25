package remapped;

import java.util.EnumSet;

public class class_9836 extends class_3599 {
   private static String[] field_49811;
   private final class_378 field_49812;

   public class_9836(class_378 var1) {
      this.field_49812 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.JUMP, Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      return !this.field_49812.isPassenger();
   }

   @Override
   public void method_16794() {
      ((class_8509)this.field_49812.method_26905()).method_39182(1.0);
   }
}
