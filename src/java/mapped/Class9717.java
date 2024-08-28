package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class9717 {
   private static String[] field45403;
   private static Map<Integer, Class8851> field45404 = new HashMap<Integer, Class8851>();
   private static Class9147 field45405 = new Class9147(1);

   public static float method38075(int var0, float var1, float var2, float var3) {
      synchronized (field45404) {
         Integer var7 = var0;
         Class8851 var8 = field45404.get(var7);
         if (var8 == null) {
            var8 = new Class8851(var1, var2, var3);
            field45404.put(var7, var8);
         }

         return var8.method32201(var1, var2, var3);
      }
   }

   public static int method38076() {
      synchronized (field45405) {
         return field45405.method34165();
      }
   }

   public static void method38077() {
      synchronized (field45404) {
         field45404.clear();
      }
   }
}
