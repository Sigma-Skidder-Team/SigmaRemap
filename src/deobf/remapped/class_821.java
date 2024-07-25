package remapped;

import java.util.Iterator;
import org.json.JSONException;

public class class_821 {
   public static class_1293 method_3601(String var0) throws JSONException {
      class_1293 var3 = new class_1293();
      class_3734 var4 = new class_3734(var0);

      while (var4.method_17294()) {
         String var5 = class_1067.method_4684(var4.method_17297('='));
         var4.method_17290('=');
         var3.method_5820(var5, class_1067.method_4684(var4.method_17297(';')));
         var4.method_17289();
      }

      return var3;
   }

   public static String toString(class_1293 var0) throws JSONException {
      boolean var3 = false;
      Iterator var4 = var0.method_5841();
      StringBuilder var5 = new StringBuilder();

      while (var4.hasNext()) {
         String var6 = (String)var4.next();
         if (!var0.method_5855(var6)) {
            if (var3) {
               var5.append(';');
            }

            var5.append(class_1067.method_4682(var6));
            var5.append("=");
            var5.append(class_1067.method_4682(var0.method_5861(var6)));
            var3 = true;
         }
      }

      return var5.toString();
   }
}
