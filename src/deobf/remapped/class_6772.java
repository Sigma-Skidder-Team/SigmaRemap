package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_6772 {
   private final Map<String, boolean[]> field_34946 = new HashMap<String, boolean[]>();

   public void method_31082(String var1, boolean[] var2) {
      this.field_34946.put(var1, var2);
   }

   public boolean method_31081(String var1, class_2391 var2, boolean var3) {
      boolean[] var6 = null;
      if (var3) {
         var6 = this.field_34946.get("allFalseIfStairPre1_12");
      }

      if (var6 == null) {
         var6 = this.field_34946.get(var1);
      }

      return var6 != null && var6[var2.ordinal()];
   }
}
