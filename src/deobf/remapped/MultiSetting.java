package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiSetting extends Setting<List<String>> {
   private boolean field_22310;

   public MultiSetting(String var1, String var2, boolean var3, String... var4) {
      super(var1, var2, class_5195.field_26719, Arrays.<String>asList(var4));
      this.method_21250(var3);
   }

   @Override
   public class_1293 method_23035(class_1293 var1) {
      var1.method_5820("name", this.method_23032());
      var1.method_5820("value", new class_1336(this.field_25890));
      return var1;
   }

   @Override
   public class_1293 method_23042(class_1293 var1) {
      class_1336 var4 = class_3332.method_15293(var1, "value");
      this.field_25890 = new ArrayList<String>();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.method_6142(); var5++) {
            this.field_25890.add(var4.method_6133(var5));
         }
      }

      return var1;
   }

   public boolean method_21251() {
      return this.field_22310;
   }

   public void method_21250(boolean var1) {
      this.field_22310 = var1;
   }
}
