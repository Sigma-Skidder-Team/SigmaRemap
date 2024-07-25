package remapped;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final class class_593 {
   private final List<class_9471> field_3431 = new ArrayList<class_9471>();

   public class_593 method_2786(String var1, String... var2) {
      if (var1 == null) {
         throw new NullPointerException("pattern == null");
      } else {
         for (String var8 : var2) {
            this.field_3431.add(new class_9471(var1, var8));
         }

         return this;
      }
   }

   public class_4446 method_2787() {
      return new class_4446(new LinkedHashSet<class_9471>(this.field_3431), null);
   }
}
