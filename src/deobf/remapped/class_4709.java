package remapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public abstract class class_4709 extends class_111 {
   private static final class_2391[] field_22870 = new class_2391[]{
      class_2391.field_11927, class_2391.field_11921, class_2391.field_11930, class_2391.field_11928
   };
   private final int field_22869;
   private final Set<Integer> field_22871 = new HashSet<Integer>();
   private final Map<class_2391, Integer> field_22868 = new HashMap<class_2391, Integer>();

   public class_4709(String var1) {
      this.field_22869 = class_7943.method_35969(var1);
   }

   public class_3590 method_21785(String var1, String var2) {
      return var4 -> {
         if (var4.method_42777() == this.field_22869 || var1.equals(var4.method_42779())) {
            if (var4.method_42777() != this.field_22869) {
               this.field_22871.add(var4.method_42777());
            }

            class_7943.field_40656.put(var4.method_42777(), this);
         }

         if (var4.method_42779().equals(var2)) {
            String var7 = var4.method_42778("facing").toUpperCase(Locale.ROOT);
            this.field_22868.put(class_2391.valueOf(var7), var4.method_42777());
         }
      };
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      if (var3 != this.field_22869) {
         return var3;
      } else {
         for (class_2391 var9 : field_22870) {
            if (this.field_22871.contains(this.method_338(var1, var2.method_43341(var9)))) {
               return this.field_22868.get(var9);
            }
         }

         return this.field_22869;
      }
   }
}
