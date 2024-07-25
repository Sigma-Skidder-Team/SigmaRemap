package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class class_630 implements Runnable {
   private static final Map<String, Integer> field_3557 = new ConcurrentHashMap<String, Integer>();
   private static class_630 field_3559;

   public class_630() {
      field_3559 = this;
   }

   public static Integer method_2926(String var0) {
      Map var3 = ((class_6985)class_3446.method_15884()).method_31960();
      Integer var4 = (Integer)var3.get(var0);
      if (var4 != null) {
         return var4;
      } else {
         Integer var5 = field_3557.get(var0);
         if (var5 != null) {
            return var5;
         } else {
            Integer var6 = (Integer)var3.get("default");
            if (var6 != null) {
               return var6;
            } else {
               try {
                  return class_3446.method_15883().method_33738().method_3880();
               } catch (Exception var8) {
                  var8.printStackTrace();
                  return class_412.field_1747.method_2055();
               }
            }
         }
      }
   }

   @Override
   public void run() {
   }

   public static Map<String, Integer> method_2929() {
      return new HashMap<String, Integer>(field_3557);
   }

   public static class_630 method_2928() {
      return field_3559;
   }
}
