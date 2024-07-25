package remapped;

import java.io.IOException;

public class class_3211 implements Packet<class_1243> {
   private static String[] field_16019;
   public String field_16018;

   public class_3211() {
   }

   public class_3211(String var1) {
      if (var1.length() > 256) {
         var1 = var1.substring(0, 256);
      }

      this.field_16018 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_16018 = var1.method_37784(256);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(this.field_16018);
   }

   public void method_14752(class_1243 var1) {
      var1.method_5581(this);
   }

   public String method_14751() {
      return this.field_16018;
   }
}
