package remapped;

import java.util.Comparator;

public class class_5309 implements Comparator<Module> {
   private static String[] field_27107;

   public class_5309(ModuleManager var1) {
      this.field_27106 = var1;
   }

   public int compare(Module var1, Module var2) {
      return var1.method_41987().compareTo(var2.method_41987());
   }
}
