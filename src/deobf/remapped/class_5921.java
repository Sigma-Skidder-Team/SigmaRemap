package remapped;

import java.net.URI;
import java.util.Map;

public class class_5921 extends class_3198 {
   public String[] field_30042;
   public boolean field_30045 = true;
   public boolean field_30044;
   public String field_30048;
   public String field_30043;
   public Map<String, class_3198> field_30047;

   private static class_5921 method_27090(URI var0, class_5921 var1) {
      if (var1 == null) {
         var1 = new class_5921();
      }

      var1.field_30048 = var0.getHost();
      var1.field_15978 = "https".equals(var0.getScheme()) || "wss".equals(var0.getScheme());
      var1.field_15982 = var0.getPort();
      String var4 = var0.getRawQuery();
      if (var4 != null) {
         var1.field_30043 = var4;
      }

      return var1;
   }
}
