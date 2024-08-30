package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.util.TextureUtil;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Class9112 {
   public static Texture method33991(String var0, BufferedImage var1) {
      try {
         BufferedImage var4 = ImageIO.read(Client.getInstance().getClass().getClassLoader().getResourceAsStream(var0));
         BufferedImage var5 = new BufferedImage(var1.getWidth(), var1.getHeight(), var4.getType());

         for (int var6 = 0; var6 < var4.getHeight(); var6++) {
            for (int var7 = 0; var7 < var4.getWidth(); var7++) {
               Color var8 = new Color(var4.getRGB(var7, var6), true);
               System.out.println(var8.getAlpha());
               int var9 = ColorUtils.applyAlpha(var1.getRGB(var7, var6), (float)var8.getAlpha() / 255.0F);
               var5.setRGB(var7, var6, var9);
            }
         }

         return TextureUtil.method32933("mask", var5);
      } catch (IOException var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static Texture method33992(BufferedImage var0) {
      return method33991("com/mentalfrostbyte/gui/resources/user/mask.png", var0);
   }
}
