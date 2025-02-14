package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class9039 {
   private final Map<String, boolean[]> field41359 = new HashMap<String, boolean[]>();

   public void method33537(String var1, boolean[] var2) {
      this.field41359.put(var1, var2);
   }

   public boolean method33538(String var1, Class1983 var2, boolean var3) {
      boolean[] var6 = null;
      if (var3) {
         var6 = this.field41359.get("allFalseIfStairPre1_12");
      }

      if (var6 == null) {
         var6 = this.field41359.get(var1);
      }

      return var6 != null && var6[var2.ordinal()];
   }
}
