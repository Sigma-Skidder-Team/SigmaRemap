package remapped;

import java.io.File;
import java.io.IOException;
import javax.annotation.Nullable;

public final class class_6386 extends class_9001 {
   private static String[] field_32609;

   public class_6386(class_1972 var1, File var2) {
      this.field_32608 = var1;
      this.field_32607 = var2;
   }

   @Nullable
   @Override
   public class_1972 method_41290() {
      return this.field_32608;
   }

   @Override
   public long method_41288() {
      return this.field_32607.length();
   }

   @Override
   public void method_41289(class_3947 var1) throws IOException {
      class_5322 var4 = null;

      try {
         var4 = class_1259.method_5665(this.field_32607);
         var1.method_18237(var4);
      } finally {
         class_8515.method_39200(var4);
      }
   }
}
