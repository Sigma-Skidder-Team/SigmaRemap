package mapped;

import javax.annotation.Nullable;
import java.util.Collections;

public interface Class923 {
   void method3636(Class4843<?> var1);

   @Nullable
   Class4843<?> method3637();

   default void method3638(PlayerEntity var1) {
      Class4843 var4 = this.method3637();
      if (var4 != null && !var4.method14965()) {
         var1.method2778(Collections.<Class4843<?>>singleton(var4));
         this.method3636((Class4843<?>)null);
      }
   }

   default boolean method3639(Class1655 var1, Class878 var2, Class4843<?> var3) {
      if (!var3.method14965() && var1.method6789().method17135(Class5462.field24243) && !var2.method2810().method21360(var3)) {
         return false;
      } else {
         this.method3636(var3);
         return true;
      }
   }
}
