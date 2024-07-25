package remapped;

import java.util.EnumSet;

public class class_2552 extends class_3599 {
   private static String[] field_12634;

   public class_2552(class_4653 var1) {
      this.field_12633 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.JUMP, Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      return this.field_12633.method_21507() > 0;
   }
}
