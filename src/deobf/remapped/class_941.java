package remapped;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class class_941 extends class_2201 {
   private static String[] field_4804;

   public class_941(class_9124 var1) {
      super(var1);
      this.field_4803 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      Object var4 = super.method_43611(var1);
      return var4 instanceof class_941 && !(var4 instanceof ConcurrentSkipListMap) ? new ConcurrentSkipListMap((Map)var4) : var4;
   }
}
