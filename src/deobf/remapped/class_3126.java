package remapped;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class class_3126 extends LinkedHashMap {
   private static String[] field_15523;

   public class_3126(class_3786 var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.field_15522 = var1;
   }

   @Override
   public boolean removeEldestEntry(Entry var1) {
      class_5733 var4 = (class_5733)var1.getValue();
      if (var4 != null) {
         class_3786.method_17581(this.field_15522, var4.field_28966);
      }

      return this.size() > 200;
   }
}
