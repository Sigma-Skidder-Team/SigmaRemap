package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Class512 implements Runnable {
   private static final Map<String, Integer> field2428 = new ConcurrentHashMap<String, Integer>();
   private static Class512 field2429;

   public Class512() {
      field2429 = this;
   }

   public static Integer method1892(String var0) {
      Map var3 = ((Class7040)Class8042.method27612()).method21922();
      Integer var4 = (Integer)var3.get(var0);
      if (var4 != null) {
         return var4;
      } else {
         Integer var5 = field2428.get(var0);
         if (var5 != null) {
            return var5;
         } else {
            Integer var6 = (Integer)var3.get("default");
            if (var6 != null) {
               return var6;
            } else {
               try {
                  return Class8042.method27614().method34427().method20574();
               } catch (Exception var8) {
                  var8.printStackTrace();
                  return Class5989.field26129.method18582();
               }
            }
         }
      }
   }

   @Override
   public void run() {
   }

   public static Map<String, Integer> method1893() {
      return new HashMap<String, Integer>(field2428);
   }

   public static Class512 method1894() {
      return field2429;
   }
}