package remapped;

import java.util.Comparator;

public class class_7327 implements Comparator<Module> {
   private static String[] field_37449;

   public class_7327(class_8438 var1) {
      this.field_37450 = var1;
   }

   public int compare(Module var1, Module var2) {
      int var5 = class_5320.field_27152.method_18547(var1.getName());
      int var6 = class_5320.field_27152.method_18547(var2.getName());
      if (var5 <= var6) {
         return var5 != var6 ? 1 : 0;
      } else {
         return -1;
      }
   }
}
