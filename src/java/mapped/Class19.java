package mapped;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class19 extends LinkedHashMap {
   private static String[] field33;
   public final Class7426 field34;

   public Class19(Class7426 var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.field34 = var1;
   }

   @Override
   public boolean removeEldestEntry(Entry var1) {
      Class7426.method23944(this.field34, (Class9685)var1.getValue());
      Class7426.method23945(this.field34, Class7426.method23946(this.field34).field45288);
      return false;
   }
}
