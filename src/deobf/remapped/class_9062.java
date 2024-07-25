package remapped;

import java.io.IOException;

public class class_9062 extends class_9139 {
   private static String[] field_46381;

   public class_9062(class_2367 var1, class_5322 var2, class_8748 var3) {
      super(var2);
      this.field_46380 = var1;
      this.field_46379 = var3;
   }

   @Override
   public void close() throws IOException {
      this.field_46379.close();
      super.close();
   }
}
