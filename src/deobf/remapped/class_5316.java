package remapped;

import java.util.Arrays;

public final class class_5316 {
   private final class_6991 field_27121;
   private final class_6349[] field_27120;

   public class_6991 method_24252() {
      return this.field_27121;
   }

   public class_6349[] method_24253() {
      return this.field_27120;
   }

   @Override
   public String toString() {
      return "HoverEvent(action=" + this.method_24252() + ", value=" + Arrays.deepToString(this.method_24253()) + ")";
   }

   public class_5316(class_6991 var1, class_6349[] var2) {
      this.field_27121 = var1;
      this.field_27120 = var2;
   }
}
