package remapped;

import java.util.EnumSet;

public abstract class class_9883 extends class_3599 {
   public class_9883(class_9825 var1) {
      this.field_50133 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   public boolean method_45532() {
      return class_9825.method_45284(this.field_50133)
            .method_6203(this.field_50133.method_37302(), this.field_50133.method_37309(), this.field_50133.method_37156())
         < 4.0;
   }
}
