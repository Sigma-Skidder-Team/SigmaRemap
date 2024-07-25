package remapped;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class class_6698 extends class_1078 {
   private static String[] field_34594;

   public class_6698(class_9124 var1) {
      super(var1);
      this.field_34595 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      Object var4 = super.method_43611(var1);
      return var4 instanceof class_941 && !(var4 instanceof ConcurrentSkipListMap) ? new ConcurrentSkipListMap((Map)var4) : var4;
   }
}
