package mapped;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class Class170 implements Predicate<Class9632> {
   private static String[] field547;
   private final Class7608<Class3209> field548;
   private final Class39 field549;
   private final Map<String, String> field550;

   public Class170(Class7608<Class3209> var1, Map<String, String> var2, Class39 var3) {
      this.field548 = var1;
      this.field550 = var2;
      this.field549 = var3;
   }

   public boolean test(Class9632 var1) {
      Class7380 var4 = var1.method37548();
      if (!var4.method23446(this.field548)) {
         return false;
      } else {
         for (Entry var6 : this.field550.entrySet()) {
            Class8550 var7 = var4.method23383().method11577().method35396((String)var6.getKey());
            if (var7 == null) {
               return false;
            }

            Comparable var8 = (Comparable)var7.method30476((String)var6.getValue()).orElse(null);
            if (var8 == null) {
               return false;
            }

            if (var4.method23463(var7) != var8) {
               return false;
            }
         }

         if (this.field549 == null) {
            return true;
         } else {
            Class944 var9 = var1.method37549();
            return var9 != null && Class8354.method29280(this.field549, var9.method3646(new Class39()), true);
         }
      }
   }
}
