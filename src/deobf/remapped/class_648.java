package remapped;

import java.io.IOException;

public class class_648 implements class_3155 {
   private class_648(class_4979 var1) {
      this.field_3621 = var1;
   }

   @Override
   public void method_14555() throws IOException {
      if (!(class_4979.method_22929(this.field_3621) instanceof class_4363)) {
         this.field_3621.method_22895(",", false, false, false);
         if (class_4979.method_22915(this.field_3621)
            || class_4979.method_22909(this.field_3621) > class_4979.method_22889(this.field_3621) && class_4979.method_22886(this.field_3621)
            || class_4979.method_22887(this.field_3621)) {
            this.field_3621.method_22883();
         }

         if (!class_4979.method_22915(this.field_3621) && class_4979.method_22912(this.field_3621)) {
            class_4979.method_22933(this.field_3621).method_39588(new class_8815(this.field_3621, null));
            class_4979.method_22918(this.field_3621, false, true, true);
         } else {
            this.field_3621.method_22895("?", true, false, false);
            class_4979.method_22933(this.field_3621).method_39588(new class_5582(this.field_3621, null));
            class_4979.method_22918(this.field_3621, false, true, false);
         }
      } else {
         class_4979.method_22916(this.field_3621, (Integer)class_4979.method_22879(this.field_3621).method_39590());
         class_4979.method_22937(this.field_3621);
         if (class_4979.method_22915(this.field_3621)) {
            this.field_3621.method_22895(",", false, false, false);
            this.field_3621.method_22883();
         }

         if (class_4979.method_22887(this.field_3621)) {
            this.field_3621.method_22883();
         }

         this.field_3621.method_22895("}", false, false, false);
         class_4979.method_22893(this.field_3621, (class_3155)class_4979.method_22933(this.field_3621).method_39590());
      }
   }
}
