package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_2614 {
   private static Map field_12903 = null;
   private static boolean field_12905 = Boolean.getBoolean("player.models.reload");
   private static long field_12906 = System.currentTimeMillis();

   public static void method_11859(class_2344 var0, class_9716 var1, class_7966 var2, class_2565 var3, int var4, int var5) {
      class_2697 var8 = method_11857(var1);
      if (var8 != null) {
         var8.method_12152(var0, var1, var2, var3, var4, var5);
      }
   }

   public static synchronized class_2697 method_11857(class_9716 var0) {
      if (field_12905 && System.currentTimeMillis() > field_12906 + 5000L) {
         class_5989 var3 = class_1893.method_8510().field_9632;
         if (var3 != null) {
            method_11860(var3.method_44878(), (class_2697)null);
            field_12906 = System.currentTimeMillis();
         }
      }

      String var8 = var0.method_44878();
      if (var8 != null) {
         class_2697 var4 = (class_2697)method_11861().get(var8);
         if (var4 == null) {
            var4 = new class_2697();
            method_11861().put(var8, var4);
            class_4880 var5 = new class_4880(var8);
            String var6 = class_6014.method_27454() + "/users/" + var8 + ".cfg";
            class_4351 var7 = new class_4351(var6, var5);
            var7.start();
         }

         return var4;
      } else {
         return null;
      }
   }

   public static synchronized void method_11860(String var0, class_2697 var1) {
      method_11861().put(var0, var1);
   }

   private static Map method_11861() {
      if (field_12903 == null) {
         field_12903 = new HashMap();
      }

      return field_12903;
   }
}
