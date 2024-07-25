package remapped;

import java.util.Comparator;

public class class_6917 implements Comparator<class_3357> {
   private static String[] field_35546;

   public class_6917(class_8734 var1) {
      this.field_35545 = var1;
   }

   public int compare(class_3357 var1, class_3357 var2) {
      Entity var5 = var1.method_15377();
      Entity var6 = var2.method_15377();
      float var7 = this.field_35545.field_44744.field_9632.method_37175(var5);
      float var8 = this.field_35545.field_44744.field_9632.method_37175(var6);
      if (!(var7 - var8 < 0.0F)) {
         return var7 - var8 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
