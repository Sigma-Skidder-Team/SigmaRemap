package remapped;

import java.util.List;

public class class_3343 implements class_9420 {
   public class_3343(class_3229 var1) {
      this.field_16494 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      class_1596 var4 = (class_1596)var1;
      return !var1.method_7225() ? this.field_16494.method_42405(var4) : this.field_16494.method_42412(var4);
   }

   @Override
   public void method_43612(class_1621 var1, Object var2) {
      if (!var1.method_7225()) {
         throw new class_5251("Unexpected recursive sequence structure. Node: " + var1);
      } else {
         this.field_16494.method_42433((class_1596)var1, (List)var2);
      }
   }
}
