package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_1145 implements class_1564<class_5531, Map> {
   private static String[] field_6523;

   public Map method_5066(class_5531 var1) {
      HashMap var4 = new HashMap();
      Map var5 = var1.method_25124();

      for (String var7 : var5.keySet()) {
         class_5287 var8 = (class_5287)var5.get(var7);
         var4.put(var8.method_24126(), class_5737.method_25980(var8));
      }

      return var4;
   }

   public class_5531 method_5065(String var1, Map var2) {
      HashMap var5 = new HashMap();

      for (Object var7 : var2.keySet()) {
         String var8 = (String)var7;
         var5.put(var8, class_5737.<Object, class_5287>method_25979(var8, var2.get(var8)));
      }

      return new class_5531(var1, var5);
   }
}
