package mapped;

import java.util.Set;
import java.util.function.Predicate;

public class Class171 implements Predicate<Class9632> {
   private static String[] field551;
   private final Class7380 field552;
   private final Set<Class8550<?>> field553;
   private final Class39 field554;

   public Class171(Class7380 var1, Set<Class8550<?>> var2, Class39 var3) {
      this.field552 = var1;
      this.field553 = var2;
      this.field554 = var3;
   }

   public boolean test(Class9632 var1) {
      Class7380 var4 = var1.method37548();
      if (!var4.method23448(this.field552.method23383())) {
         return false;
      } else {
         for (Class8550 var6 : this.field553) {
            if (var4.method23463(var6) != this.field552.method23463(var6)) {
               return false;
            }
         }

         if (this.field554 == null) {
            return true;
         } else {
            Class944 var7 = var1.method37549();
            return var7 != null && Class8354.method29280(this.field554, var7.method3646(new Class39()), true);
         }
      }
   }
}
