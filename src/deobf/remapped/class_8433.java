package remapped;

import java.io.IOException;

public class class_8433 implements class_6310<class_8886> {
   private static String[] field_43156;
   private int field_43155;

   public class_8433() {
   }

   public class_8433(int var1) {
      this.field_43155 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_43155 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_43155);
   }

   public void method_38801(class_8886 var1) {
      var1.method_40904(this);
   }

   public int method_38799() {
      return this.field_43155;
   }
}
