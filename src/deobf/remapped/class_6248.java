package remapped;

import java.io.IOException;

public class class_6248 implements Packet<class_1243> {
   private static String[] field_31965;
   private int field_31964;
   private String field_31963;

   public class_6248() {
   }

   public class_6248(int var1, String var2) {
      this.field_31964 = var1;
      this.field_31963 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_31964 = var1.method_37778();
      this.field_31963 = var1.method_37784(32500);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_31964);
      var1.method_37761(this.field_31963, 32500);
   }

   public void method_28524(class_1243 var1) {
      var1.method_5554(this);
   }

   public int method_28522() {
      return this.field_31964;
   }

   public String method_28521() {
      return this.field_31963;
   }
}
