package remapped;

import java.util.LinkedHashSet;
import java.util.Set;

public final class class_5740 {
   private static String[] field_29083;
   private final Set<class_2535> field_29082 = new LinkedHashSet<class_2535>();

   public synchronized void method_25986(class_2535 var1) {
      this.field_29082.add(var1);
   }

   public synchronized void method_25984(class_2535 var1) {
      this.field_29082.remove(var1);
   }

   public synchronized boolean method_25985(class_2535 var1) {
      return this.field_29082.contains(var1);
   }
}
