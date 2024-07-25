package remapped;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class class_8391 {
   private static BufferedImage field_42946 = new BufferedImage(256, 256, 2);

   public static BufferedImage method_38663() {
      Graphics2D var2 = (Graphics2D)field_42946.getGraphics();
      var2.setComposite(AlphaComposite.Clear);
      var2.fillRect(0, 0, 256, 256);
      var2.setComposite(AlphaComposite.SrcOver);
      var2.setColor(Color.white);
      return field_42946;
   }

   public static class_2278 method_38661(String var0, Color var1) {
      return new class_347(var0, toString(var1));
   }

   public static class_2278 method_38660(String var0, int var1, String var2) {
      return new class_283(var0, String.valueOf(var1), var1, var2);
   }

   public static class_2278 method_38657(String var0, float var1, float var2, float var3, String var4) {
      return new class_8561(var0, String.valueOf(var1), var1, var2, var3, var4);
   }

   public static class_2278 method_38658(String var0, boolean var1, String var2) {
      return new class_7361(var0, String.valueOf(var1), var1, var2);
   }

   public static class_2278 method_38664(String var0, String var1, String[][] var2, String var3) {
      return new class_1139(var0, var1.toString(), var2, var1, var3);
   }

   public static String toString(Color var0) {
      if (var0 != null) {
         String var3 = Integer.toHexString(var0.getRed());
         if (var3.length() == 1) {
            var3 = "0" + var3;
         }

         String var4 = Integer.toHexString(var0.getGreen());
         if (var4.length() == 1) {
            var4 = "0" + var4;
         }

         String var5 = Integer.toHexString(var0.getBlue());
         if (var5.length() == 1) {
            var5 = "0" + var5;
         }

         return var3 + var4 + var5;
      } else {
         throw new IllegalArgumentException("color cannot be null.");
      }
   }

   public static Color method_38662(String var0) {
      return var0 != null && var0.length() == 6
         ? new Color(Integer.parseInt(var0.substring(0, 2), 16), Integer.parseInt(var0.substring(2, 4), 16), Integer.parseInt(var0.substring(4, 6), 16))
         : Color.white;
   }
}
