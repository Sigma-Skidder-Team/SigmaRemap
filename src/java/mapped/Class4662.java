package mapped;

import java.util.HashMap;
import java.util.Map;

public abstract class Class4662 {
   public final ViaVersion7 field22195;
   public final Class8584 field22196;
   public final Map<String, Class6978> field22197 = new HashMap<String, Class6978>();

   public Class4662(ViaVersion7 var1, Class8584 var2) {
      this.field22195 = var1;
      this.field22196 = var2;
   }

   public void method14630(Class8563 var1, String var2) throws Exception {
      Class6978 var5 = this.field22197.get(var2);
      if (var5 != null) {
         var5.method21541(var1);
      }
   }

   public void method14631(Class1913 var1) {
      this.field22195.method19360(var1, new Class3870(this));
   }
}
