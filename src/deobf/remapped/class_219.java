package remapped;

import java.security.PrivilegedAction;

public class class_219 implements PrivilegedAction {
   private static String[] field_722;

   public class_219(class_8095 var1) {
      this.field_723 = var1;
   }

   @Override
   public Object run() {
      try {
         if (class_8095.method_36748(this.field_723) != null) {
            class_8095.method_36772(this.field_723, new class_8112(class_8095.method_36771(this.field_723), class_8095.method_36748(this.field_723)));
         } else {
            class_8095.method_36772(this.field_723, new class_8112(class_8095.method_36771(this.field_723)));
         }
      } catch (class_1162 var4) {
         class_2598.method_11785(var4);
         class_8095.method_36757(this.field_723, null);
      }

      return null;
   }
}
