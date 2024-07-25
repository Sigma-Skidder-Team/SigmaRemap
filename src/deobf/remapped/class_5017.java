package remapped;

import com.google.common.base.MoreObjects;
import java.util.List;

public class class_5017 {
   private static String[] field_25957;
   private final class_4439 field_25956;
   private final List<class_7912> field_25958;
   private final int field_25955;

   public class_5017(class_4439 var1, List<class_7912> var2, int var3) {
      this.field_25956 = var1;
      this.field_25958 = var2;
      this.field_25955 = var3;
   }

   public class_7912 method_23093(int var1) {
      return var1 >= 0 && var1 < this.field_25958.size()
         ? (class_7912)MoreObjects.firstNonNull(this.field_25958.get(var1), class_3421.field_16839)
         : class_3421.field_16839;
   }

   public int method_23095() {
      return this.field_25955;
   }
}
