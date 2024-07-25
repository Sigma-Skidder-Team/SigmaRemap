package remapped;

import java.util.Collections;
import javax.annotation.Nullable;

public interface class_9031 {
   void method_41427(class_8932<?> var1);

   @Nullable
   class_8932<?> method_41426();

   default void method_41424(PlayerEntity var1) {
      class_8932 var4 = this.method_41426();
      if (var4 != null && !var4.method_41053()) {
         var1.method_3223(Collections.<class_8932<?>>singleton(var4));
         this.method_41427((class_8932<?>)null);
      }
   }

   default boolean method_41425(World var1, class_9359 var2, class_8932<?> var3) {
      if (!var3.method_41053() && var1.getGameRules().getBoolean(GameRules.field_1029) && !var2.method_43266().method_5072(var3)) {
         return false;
      } else {
         this.method_41427(var3);
         return true;
      }
   }
}
