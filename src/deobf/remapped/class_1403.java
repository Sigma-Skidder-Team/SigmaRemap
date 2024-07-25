package remapped;

import java.security.PrivilegedAction;

public class class_1403 implements PrivilegedAction {
   public class_1403(class_7501 var1) {
      this.field_7635 = var1;
   }

   @Override
   public Object run() {
      try {
         class_7501.field_38280 = new class_1948("org/newdawn/slick/data/defaultfont.fnt", "org/newdawn/slick/data/defaultfont.png");
      } catch (class_1162 var4) {
         class_2598.method_11785(var4);
      }

      return null;
   }
}
