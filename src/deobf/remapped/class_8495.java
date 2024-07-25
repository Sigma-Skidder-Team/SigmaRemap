package remapped;

import java.io.IOException;

public class class_8495 implements class_3155 {
   private class_8495(class_4979 var1) {
      this.field_43515 = var1;
   }

   @Override
   public void method_14555() throws IOException {
      if (!(class_4979.method_22929(this.field_43515) instanceof class_1927)) {
         throw new class_5633("expected DocumentEndEvent, but got " + class_4979.method_22929(this.field_43515));
      } else {
         this.field_43515.method_22883();
         if (((class_1927)class_4979.method_22929(this.field_43515)).method_8953()) {
            this.field_43515.method_22895("...", true, false, false);
            this.field_43515.method_22883();
         }

         this.field_43515.method_22907();
         class_4979.method_22893(this.field_43515, new class_6266(this.field_43515, false));
      }
   }
}
