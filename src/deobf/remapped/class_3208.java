package remapped;

import java.io.IOException;

public class class_3208 implements class_3155 {
   private boolean field_16011;

   public class_3208(class_4979 var1, boolean var2) {
      this.field_16013 = var1;
      this.field_16011 = var2;
   }

   @Override
   public void method_14555() throws IOException {
      if (!this.field_16011 && class_4979.method_22929(this.field_16013) instanceof class_4363) {
         class_4979.method_22916(this.field_16013, (Integer)class_4979.method_22879(this.field_16013).method_39590());
         class_4979.method_22893(this.field_16013, (class_3155)class_4979.method_22933(this.field_16013).method_39590());
      } else {
         this.field_16013.method_22883();
         if (!class_4979.method_22912(this.field_16013)) {
            this.field_16013.method_22895("?", true, false, true);
            class_4979.method_22933(this.field_16013).method_39588(new class_3585(this.field_16013, null));
            class_4979.method_22918(this.field_16013, false, true, false);
         } else {
            class_4979.method_22933(this.field_16013).method_39588(new class_5252(this.field_16013, null));
            class_4979.method_22918(this.field_16013, false, true, true);
         }
      }
   }
}
