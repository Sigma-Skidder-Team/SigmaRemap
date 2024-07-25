package remapped;

import java.io.IOException;

public class class_7028 implements Packet<class_1243> {
   private static String[] field_36197;
   private int field_36198;

   public class_7028() {
   }

   public class_7028(int var1) {
      this.field_36198 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_36198 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_36198);
   }

   public void method_32063(class_1243 var1) {
      var1.method_5567(this);
   }

   public int method_32062() {
      return this.field_36198;
   }
}
