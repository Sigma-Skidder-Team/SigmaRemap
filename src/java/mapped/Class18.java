package mapped;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class18 extends LinkedHashMap {
   private static String[] field31;
   public final Class7431 field32;

   public Class18(Class7431 var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.field32 = var1;
   }

   @Override
   public boolean removeEldestEntry(Entry var1) {
      Class8741 var4 = (Class8741)var1.getValue();
      if (var4 != null) {
         Class7431.method23994(this.field32, var4.field39414);
      }

      return this.size() > 200;
   }
}
