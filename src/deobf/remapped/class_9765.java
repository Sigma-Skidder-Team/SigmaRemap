package remapped;

import java.util.Set;

public class class_9765 implements class_9420 {
   public class_9765(class_3229 var1) {
      this.field_49601 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      if (!var1.method_7225()) {
         return this.field_49601.method_42407((class_7984)var1);
      } else {
         return !this.field_49601.field_47063.containsKey(var1)
            ? this.field_49601.method_42415(((class_7984)var1).method_10282().size())
            : this.field_49601.field_47063.get(var1);
      }
   }

   @Override
   public void method_43612(class_1621 var1, Object var2) {
      if (!var1.method_7225()) {
         throw new class_5251("Unexpected recursive set structure. Node: " + var1);
      } else {
         this.field_49601.method_42408((class_7984)var1, (Set<Object>)var2);
      }
   }
}
