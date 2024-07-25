package remapped;

import java.io.IOException;

public class class_6438 implements class_3155 {
   private class_6438(class_4979 var1) {
      this.field_32866 = var1;
   }

   @Override
   public void method_14555() throws IOException {
      if (!(class_4979.method_22929(this.field_32866) instanceof class_6137)) {
         throw new class_5633("expected StreamStartEvent, but got " + class_4979.method_22929(this.field_32866));
      } else {
         this.field_32866.method_22878();
         class_4979.method_22893(this.field_32866, new class_7364(this.field_32866, null));
      }
   }
}
