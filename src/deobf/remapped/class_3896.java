package remapped;

import java.util.Comparator;

public class class_3896 implements Comparator<Module> {
   private static String[] field_18953;

   public class_3896(class_4221 var1) {
      this.field_18954 = var1;
   }

   public int compare(Module var1, Module var2) {
      if (class_4221.method_19658(this.field_18954, var1) <= class_4221.method_19658(this.field_18954, var2)) {
         return class_4221.method_19658(this.field_18954, var1) >= class_4221.method_19658(this.field_18954, var2)
            ? var1.getName2().compareTo(var2.getName2())
            : 1;
      } else {
         return -1;
      }
   }
}
