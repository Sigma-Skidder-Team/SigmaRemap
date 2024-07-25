package remapped;

import java.util.HashMap;
import javax.imageio.ImageIO;
import org.newdawn.slick.SlickException;

public class class_5687 {
   private static HashMap field_28800 = new HashMap();

   public static void method_25722(String var0, class_5106 var1) {
      field_28800.put(var0, var1);
   }

   public static String[] method_25721() {
      return field_28800.keySet().<String>toArray(new String[0]);
   }

   public static class_5106 method_25723(String var0) throws SlickException {
      class_5106 var3 = (class_5106)field_28800.get(var0);
      if (var3 == null) {
         var3 = (class_5106)field_28800.get(var0.toLowerCase());
         if (var3 == null) {
            var3 = (class_5106)field_28800.get(var0.toUpperCase());
            if (var3 == null) {
               throw new class_1162("No image writer available for: " + var0);
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
      class_6762 var5 = new class_6762();

      for (int var6 = 0; var6 < var4.length; var6++) {
         method_25722(var4[var6], var5);
      }

      class_7545 var9 = new class_7545();
      method_25722("tga", var9);
   }
}
