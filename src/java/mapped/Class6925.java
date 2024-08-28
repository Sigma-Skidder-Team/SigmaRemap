package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class6925 implements Class6926<Class72, Map> {
   private static String[] field30074;

   public Map method21342(Class72 var1) {
      HashMap var4 = new HashMap();
      Map<String, Class61> var5 = var1.method205();

      for (String var7 : var5.keySet()) {
         Class61 var8 = (Class61)var5.get(var7);
         var4.put(var8.method206(), Class8742.method31540(var8));
      }

      return var4;
   }

   @Override
   public Class72 method21341(String var1, Map var2) {
      HashMap var5 = new HashMap();

      for (Object var7 : var2.keySet()) {
         String var8 = (String)var7;
         var5.put(var8, Class8742.<Object, Class61>method31541(var8, var2.get(var8)));
      }

      return new Class72(var1, var5);
   }
}
