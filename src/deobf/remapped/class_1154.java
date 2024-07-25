package remapped;

import java.util.List;
import java.util.function.Function;

public enum class_1154 {
   field_6565,
   field_6564;

   public <T> int method_5149(List<T> var1, T var2, Function<T, class_5522> var3, boolean var4) {
      class_1154 var7 = !var4 ? this : this.method_5147();
      if (var7 != field_6564) {
         int var10;
         for (var10 = var1.size() - 1; var10 >= 0; var10--) {
            class_5522 var11 = (class_5522)var3.apply(var1.get(var10));
            if (!var11.method_25029() || var11.method_25031() != this) {
               break;
            }
         }

         var1.add(var10 + 1, var2);
         return var10 + 1;
      } else {
         int var8;
         for (var8 = 0; var8 < var1.size(); var8++) {
            class_5522 var9 = (class_5522)var3.apply(var1.get(var8));
            if (!var9.method_25029() || var9.method_25031() != this) {
               break;
            }
         }

         var1.add(var8, var2);
         return var8;
      }
   }

   public class_1154 method_5147() {
      return this != field_6565 ? field_6565 : field_6564;
   }
}
