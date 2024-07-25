package remapped;

import java.io.IOException;

public class class_2126 extends class_7201 {
   private static String[] field_10646;

   public class_2126(class_1617 var1, boolean var2, class_8067 var3, class_3947 var4, class_327 var5) {
      super(var2, var3, var4);
      this.field_10648 = var1;
      this.field_10647 = var5;
   }

   @Override
   public void close() throws IOException {
      this.field_10647.method_1518(true, this.field_10647.method_1521());
   }
}
