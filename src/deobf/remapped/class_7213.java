package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class class_7213 {
   private static String[] field_37044;
   private final List<class_876> field_37043 = Lists.newArrayList();

   public class_7213 method_33045(class_7373 var1, int var2) {
      if (var1 != null) {
         this.field_37043.add(new class_876(var1, var2));
      }

      return this;
   }

   @Nullable
   public class_7373 method_33047() {
      if (!this.field_37043.isEmpty()) {
         return (class_7373)(this.field_37043.size() != 1 ? new class_3545(this.field_37043) : this.field_37043.get(0).field_4522);
      } else {
         return null;
      }
   }
}
