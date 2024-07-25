package remapped;

import java.io.IOException;

public class class_5912 implements class_6310<class_1243> {
   private static String[] field_29988;
   private String field_29989;

   public class_5912() {
   }

   public class_5912(String var1) {
      this.field_29989 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_29989 = var1.method_37784(32767);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(this.field_29989);
   }

   public void method_27019(class_1243 var1) {
      var1.method_5544(this);
   }

   public String method_27017() {
      return this.field_29989;
   }
}
