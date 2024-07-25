package remapped;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_1741 {
   private static final Logger field_8966 = Logger.getLogger(class_1741.class.getName());

   private class_1741() {
   }

   public static boolean method_7757(Object var0) {
      return method_7759(var0);
   }

   private static boolean method_7759(Object var0) {
      if (var0 == null) {
         return false;
      } else if (var0 instanceof byte[]) {
         return true;
      } else {
         if (var0 instanceof class_1336) {
            class_1336 var3 = (class_1336)var0;
            int var4 = var3.method_6142();

            for (int var5 = 0; var5 < var4; var5++) {
               Object var6;
               try {
                  var6 = var3.method_6163(var5) ? null : var3.method_6130(var5);
               } catch (class_7584 var9) {
                  field_8966.log(Level.WARNING, "An error occured while retrieving data from JSONArray", (Throwable)var9);
                  return false;
               }

               if (method_7759(var6)) {
                  return true;
               }
            }
         } else if (var0 instanceof class_1293) {
            class_1293 var10 = (class_1293)var0;
            Iterator var11 = var10.method_5841();

            while (var11.hasNext()) {
               String var12 = (String)var11.next();

               Object var13;
               try {
                  var13 = var10.method_5805(var12);
               } catch (class_7584 var8) {
                  field_8966.log(Level.WARNING, "An error occured while retrieving data from JSONObject", (Throwable)var8);
                  return false;
               }

               if (method_7759(var13)) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
