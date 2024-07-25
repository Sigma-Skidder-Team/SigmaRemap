package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public final class class_224 extends class_9001 {
   private static String[] field_734;

   public class_224(class_1972 var1, class_9091 var2) {
      this.field_733 = var1;
      this.field_732 = var2;
   }

   @Nullable
   @Override
   public class_1972 method_41290() {
      return this.field_733;
   }

   @Override
   public long method_41288() throws IOException {
      return (long)this.field_732.method_41902();
   }

   @Override
   public void method_41289(class_3947 var1) throws IOException {
      var1.method_18247(this.field_732);
   }
}
