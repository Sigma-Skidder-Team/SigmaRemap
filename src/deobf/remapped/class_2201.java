package remapped;

import java.util.Map;

public class class_2201 implements class_9420 {
   public class_2201(class_3229 var1) {
      this.field_10918 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      class_7984 var4 = (class_7984)var1;
      return !var1.method_7225() ? this.field_10918.method_42423(var4) : this.field_10918.method_42409(var4.method_10282().size());
   }

   @Override
   public void method_43612(class_1621 var1, Object var2) {
      if (!var1.method_7225()) {
         throw new class_5251("Unexpected recursive mapping structure. Node: " + var1);
      } else {
         this.field_10918.method_42414((class_7984)var1, (Map<Object, Object>)var2);
      }
   }
}
