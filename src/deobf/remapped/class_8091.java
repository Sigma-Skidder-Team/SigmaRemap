package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_8091 {
   private final class_5886 field_41441;
   private final List<class_8145> field_41442 = Lists.newArrayList();
   private final List<class_8145> field_41439 = Lists.newArrayList();

   public class_8091(class_5886 var1) {
      this.field_41441 = var1;
   }

   public void method_36737() {
      this.field_41442.clear();
      this.field_41439.clear();
   }

   public boolean method_36736(class_8145 var1) {
      if (!this.field_41442.contains(var1)) {
         if (!this.field_41439.contains(var1)) {
            this.field_41441.field_41768.method_29599().method_16056("canSee");
            boolean var4 = this.field_41441.method_26420(var1);
            this.field_41441.field_41768.method_29599().method_16054();
            if (!var4) {
               this.field_41439.add(var1);
            } else {
               this.field_41442.add(var1);
            }

            return var4;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
