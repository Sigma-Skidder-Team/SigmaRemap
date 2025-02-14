package mapped;

import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;


public class Class8728 {
   private static Map<String, Class8579> field39367 = new HashMap();

   public static void method31496(String var0, Class8579 var1) {
      field39367.put(var0, var1);
   }

   public static String[] method31497() {
      return field39367.keySet().toArray(new String[0]);
   }

   public static Class8579 method31498(String var0) throws Class2451 {
      Class8579 var3 = (Class8579)field39367.get(var0);
      if (var3 == null) {
         var3 = (Class8579)field39367.get(var0.toLowerCase());
         if (var3 == null) {
            var3 = (Class8579)field39367.get(var0.toUpperCase());
            if (var3 == null) {
               throw new Class2451("No image writer available for: " + var0);
            } else {
               return var3;
            }
         } else {
            return var3;
         }
      } else {
         return var3;
      }
   }

   static {
      String[] var4 = ImageIO.getWriterFormatNames();
      Class8580 var5 = new Class8580();

      for (int var6 = 0; var6 < var4.length; var6++) {
         method31496(var4[var6], var5);
      }

      Class8581 var9 = new Class8581();
      method31496("tga", var9);
   }
}
