package remapped;

import java.util.Comparator;

public final class class_4242 implements Comparator<class_8145> {
   private static String[] field_20583;

   public int compare(class_8145 var1, class_8145 var2) {
      float var5 = class_7494.method_34122().field_9632.method_37175(var1);
      float var6 = class_7494.method_34122().field_9632.method_37175(var2);
      if (!(var5 - var6 < 0.0F)) {
         return var5 - var6 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
