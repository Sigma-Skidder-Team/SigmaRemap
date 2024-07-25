package remapped;

import java.util.LinkedHashMap;
import java.util.Set;

public class class_9819 implements class_4650 {
   private static String[] field_49757;

   public class_9819(class_8200 var1) {
      this.field_49758 = var1;
   }

   @Override
   public class_1621 method_21502(Object var1) {
      LinkedHashMap var4 = new LinkedHashMap();

      for (Object var7 : (Set)var1) {
         var4.put(var7, null);
      }

      return this.field_49758.method_588(this.field_49758.method_37561(var1.getClass(), class_9592.field_48883), var4, class_435.field_1823);
   }
}
