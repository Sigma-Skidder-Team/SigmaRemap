package remapped;

import java.util.HashSet;
import java.util.Set;

public class class_2671 extends class_111 {
   private static final Set<Integer> field_13125 = new HashSet<Integer>();

   public static class_3590 method_12035() {
      class_2671 var2 = new class_2671();
      return var1 -> {
         if (var1.method_42779().equals("minecraft:vine")) {
            field_13125.add(var1.method_42777());
            class_7943.field_40656.put(var1.method_42777(), var2);
         }
      };
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      if (!this.method_12033(var1, var2)) {
         class_9371 var6 = var2.method_43341(class_2391.field_11924);
         int var7 = this.method_338(var1, var6);
         return field_13125.contains(var7) && this.method_12033(var1, var6) ? var3 : 0;
      } else {
         return var3;
      }
   }

   private boolean method_12033(class_1455 var1, class_9371 var2) {
      return this.method_12034(var1, var2, class_2391.field_11927)
         || this.method_12034(var1, var2, class_2391.field_11928)
         || this.method_12034(var1, var2, class_2391.field_11921)
         || this.method_12034(var1, var2, class_2391.field_11930);
   }

   private boolean method_12034(class_1455 var1, class_9371 var2, class_2391 var3) {
      return class_7943.field_40657.contains(this.method_338(var1, var2.method_43341(var3)));
   }
}
