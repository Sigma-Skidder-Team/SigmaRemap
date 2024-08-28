package mapped;

import java.util.List;
import java.util.function.Function;

public enum Class1967 {
   field12829,
   field12830;

   private static final Class1967[] field12831 = new Class1967[]{field12829, field12830};

   public <T> int method8249(List<T> var1, T var2, Function<T, Class1810> var3, boolean var4) {
      Class1967 var7 = !var4 ? this : this.method8250();
      if (var7 != field12830) {
         int var10;
         for (var10 = var1.size() - 1; var10 >= 0; var10--) {
            Class1810 var11 = (Class1810)var3.apply(var1.get(var10));
            if (!var11.method7953() || var11.method7954() != this) {
               break;
            }
         }

         var1.add(var10 + 1, var2);
         return var10 + 1;
      } else {
         int var8;
         for (var8 = 0; var8 < var1.size(); var8++) {
            Class1810 var9 = (Class1810)var3.apply(var1.get(var8));
            if (!var9.method7953() || var9.method7954() != this) {
               break;
            }
         }

         var1.add(var8, var2);
         return var8;
      }
   }

   public Class1967 method8250() {
      return this != field12829 ? field12829 : field12830;
   }
}
