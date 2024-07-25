package remapped;

import java.io.IOException;

public class class_3196 implements Packet<class_1243> {
   private static String[] field_15964;
   private boolean field_15965;

   public class_3196() {
   }

   public class_3196(boolean var1) {
      this.field_15965 = var1;
   }

   public void method_14710(class_1243 var1) {
      var1.method_5538(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_15965 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeBoolean(this.field_15965);
   }

   public boolean method_14709() {
      return this.field_15965;
   }
}
