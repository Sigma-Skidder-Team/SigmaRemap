package remapped;

import java.io.IOException;

public class class_5135 implements class_3155 {
   private boolean field_26475;

   public class_5135(class_4979 var1, boolean var2) {
      this.field_26476 = var1;
      this.field_26475 = var2;
   }

   @Override
   public void method_14555() throws IOException {
      if (!this.field_26475 && class_4979.method_22929(this.field_26476) instanceof class_6130) {
         class_4979.method_22916(this.field_26476, (Integer)class_4979.method_22879(this.field_26476).method_39590());
         class_4979.method_22893(this.field_26476, (class_3155)class_4979.method_22933(this.field_26476).method_39590());
      } else {
         this.field_26476.method_22883();
         class_4979.method_22934(this.field_26476, class_4979.method_22898(this.field_26476));
         this.field_26476.method_22895("-", true, false, true);
         class_4979.method_22933(this.field_26476).method_39588(new class_5135(this.field_26476, false));
         class_4979.method_22918(this.field_26476, false, false, false);
      }
   }
}
