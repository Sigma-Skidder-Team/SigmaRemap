package remapped;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class class_5082 implements Predicate<class_9115> {
   private static String[] field_26236;
   private final class_2307<class_6414> field_26238;
   private final class_5734 field_26237;
   private final Map<String, String> field_26235;

   private class_5082(class_2307<class_6414> var1, Map<String, String> var2, class_5734 var3) {
      this.field_26238 = var1;
      this.field_26235 = var2;
      this.field_26237 = var3;
   }

   public boolean test(class_9115 var1) {
      class_2522 var4 = var1.method_41968();
      if (!var4.method_8349(this.field_26238)) {
         return false;
      } else {
         for (Entry var6 : this.field_26235.entrySet()) {
            class_5019 var7 = var4.method_8360().method_29306().method_36440((String)var6.getKey());
            if (var7 == null) {
               return false;
            }

            Comparable var8 = (Comparable)var7.method_23108((String)var6.getValue()).orElse(null);
            if (var8 == null) {
               return false;
            }

            if (var4.method_10313(var7) != var8) {
               return false;
            }
         }

         if (this.field_26237 == null) {
            return true;
         } else {
            class_3757 var9 = var1.method_41967();
            return var9 != null && class_4338.method_20182(this.field_26237, var9.method_17396(new class_5734()), true);
         }
      }
   }
}
