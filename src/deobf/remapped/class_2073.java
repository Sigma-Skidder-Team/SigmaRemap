package remapped;

import java.io.IOException;

public class class_2073 implements class_6310<class_392> {
   private static String[] field_10444;
   private class_1331 field_10445;
   private float field_10443;

   public class_2073() {
   }

   public class_2073(class_1331 var1, float var2) {
      this.field_10445 = var1;
      this.field_10443 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_10445 = var1.method_37748();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_10445);
   }

   public void method_9678(class_392 var1) {
      var1.method_1893(this);
   }

   public class_1331 method_9676() {
      return this.field_10445;
   }

   public float method_9679() {
      return this.field_10443;
   }
}
