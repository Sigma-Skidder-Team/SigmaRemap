package mapped;

import com.mentalfrostbyte.jello.viaversion.managers.ResourceManager;

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
      Map var3 = ((ResourceManager) ViaVersion3.method27612()).method21922();
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
                  return ViaVersion3.getInstance().method34427().method20574();
               } catch (Exception var8) {
                  var8.printStackTrace();
                  return ViaVerList._1_8_x.getVersionNumber();
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
