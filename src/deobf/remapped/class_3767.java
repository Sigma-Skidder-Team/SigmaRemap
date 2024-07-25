package remapped;

import java.io.IOException;

public class class_3767 implements Packet<class_392> {
   private static String[] field_18421;
   private int field_18420;

   public class_3767() {
   }

   public class_3767(int var1) {
      this.field_18420 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_18420 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_18420);
   }

   public void method_17442(class_392 var1) {
      var1.method_1972(this);
   }

   public int method_17440() {
      return this.field_18420;
   }
}
