package remapped;

import java.util.Comparator;

public class class_401 implements Comparator<class_8145> {
   private static String[] field_1674;

   public class_401(class_9543 var1) {
      this.field_1673 = var1;
   }

   public int compare(class_8145 var1, class_8145 var2) {
      float var5 = class_9543.method_44025().field_9632.method_37175(var1);
      float var6 = class_9543.method_44013().field_9632.method_37175(var2);
      if (!(var5 - var6 < 0.0F)) {
         return var5 - var6 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
