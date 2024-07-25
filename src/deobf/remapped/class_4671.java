package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class class_4671 implements class_6310<class_392> {
   private static String[] field_22772;
   private int field_22771;
   private class_1425 field_22770;

   public class_4671() {
   }

   public class_4671(int var1, class_1425 var2) {
      this.field_22771 = var1;
      this.field_22770 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_22771 = var1.method_37778();
      this.field_22770 = class_1425.method_6538(var1.readUnsignedByte());
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_22771);
      var1.writeByte(class_1425.method_6536(this.field_22770));
   }

   public void method_21616(class_392 var1) {
      var1.method_1978(this);
   }

   @Nullable
   public Entity method_21615(World var1) {
      return var1.method_29534(this.field_22771);
   }

   @Nullable
   public class_1425 method_21613() {
      return this.field_22770;
   }
}
