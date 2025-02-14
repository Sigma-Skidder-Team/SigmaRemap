package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class6269 implements Class6267 {
   private static String[] field27749;
   private Map<String, Class1877> field27750 = new HashMap<String, Class1877>();

   public Class6269(Class6679[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         Class6679 var5 = var1[var4];
         if (var5 instanceof Class6682) {
            Class6682 var6 = (Class6682)var5;
            Class1877 var7 = new Class1877(var6);
            this.field27750.put(var5.method20366(), var7);
         }
      }
   }

   @Override
   public Class1878 method19230(String var1) {
      return this.field27750.get(var1);
   }
}
