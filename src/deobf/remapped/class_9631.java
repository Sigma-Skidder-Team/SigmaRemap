package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public final class class_9631 extends class_9001 {
   private static String[] field_49054;

   public class_9631(class_1972 var1, int var2, byte[] var3, int var4) {
      this.field_49055 = var1;
      this.field_49052 = var2;
      this.field_49053 = var3;
      this.field_49051 = var4;
   }

   @Nullable
   @Override
   public class_1972 method_41290() {
      return this.field_49055;
   }

   @Override
   public long method_41288() {
      return (long)this.field_49052;
   }

   @Override
   public void method_41289(class_3947 var1) throws IOException {
      var1.method_18249(this.field_49053, this.field_49051, this.field_49052);
   }
}
