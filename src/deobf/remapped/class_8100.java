package remapped;

import java.io.IOException;

public class class_8100 extends class_9139 {
   private static String[] field_41491;

   public class_8100(class_3076 var1, class_5322 var2) {
      super(var2);
      this.field_41492 = var1;
   }

   @Override
   public void close() throws IOException {
      this.field_41492.field_15119.method_1518(false, this.field_41492);
      super.close();
   }
}
