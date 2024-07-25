package remapped;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class class_7058 {
   public static class_8343 method_32449(String var0, BufferedImage var1) {
      try {
         BufferedImage var4 = ImageIO.read(class_727.method_3328().getClass().getClassLoader().getResourceAsStream(var0));
         BufferedImage var5 = new BufferedImage(var1.getWidth(), var1.getHeight(), var4.getType());

         for (int var6 = 0; var6 < var4.getHeight(); var6++) {
            for (int var7 = 0; var7 < var4.getWidth(); var7++) {
               Color var8 = new Color(var4.getRGB(var7, var6), true);
               System.out.println(var8.getAlpha());
               int var9 = class_314.method_1444(var1.getRGB(var7, var6), (float)var8.getAlpha() / 255.0F);
               var5.setRGB(var7, var6, var9);
            }
         }

         return class_6568.method_30015("mask", var5);
      } catch (IOException var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static class_8343 method_32450(BufferedImage var0) {
      return method_32449("com/mentalfrostbyte/gui/resources/user/mask.png", var0);
   }
}
