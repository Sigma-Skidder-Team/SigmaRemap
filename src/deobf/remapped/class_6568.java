package remapped;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public class class_6568 {
   private static String[] field_33502;

   public static class_8343 method_30015(String var0, BufferedImage var1) throws IOException {
      return method_30017(var0, var1, 3553, 6408, 9729, 9729);
   }

   public static class_8343 method_30016(String var0, BufferedImage var1, int var2) throws IOException {
      return method_30017(var0, var1, 3553, 6408, var2, var2);
   }

   public static class_8343 method_30017(String var0, BufferedImage var1, int var2, int var3, int var4, int var5) throws IOException {
      class_4585 var8 = new class_4585();
      short var9 = 0;
      int var10 = class_8256.method_37849();
      class_9162 var11 = new class_9162(var0, var2, var10);
      class_3980.method_18363().method_5911(3553);
      class_3980.method_18363().method_5904(var2, var10);
      var11.method_42225(var1.getWidth());
      var11.method_42215(var1.getHeight());
      if (!var1.getColorModel().hasAlpha()) {
         var9 = 6407;
      } else {
         var9 = 6408;
      }

      ByteBuffer var13 = var8.method_21242(var1, false, false, null);
      var11.method_42226(var8.method_5151());
      var11.method_42216(var8.method_5150());
      var11.method_42221(var8.method_5154() == 32);
      if (var2 == 3553) {
         class_3980.method_18363().method_5908(var2, 10241, var4);
         class_3980.method_18363().method_5908(var2, 10240, var5);
         if (!class_3980.method_18363().method_5923()) {
            class_3980.method_18363().method_5908(3553, 10242, 10496);
            class_3980.method_18363().method_5908(3553, 10243, 10496);
         } else {
            class_3980.method_18363().method_5908(3553, 10242, 34627);
            class_3980.method_18363().method_5908(3553, 10243, 34627);
         }
      }

      GL11.glPixelStorei(3312, 0);
      GL11.glPixelStorei(3313, 0);
      GL11.glPixelStorei(3314, 0);
      GL11.glPixelStorei(3315, 0);
      GL11.glPixelStorei(3316, 0);
      GL11.glPixelStorei(3317, 4);
      class_3980.method_18363().method_5939(var2, 0, var3, var11.method_38420(), var11.method_38422(), 0, var9, 5121, var13);
      return var11;
   }

   private static void method_30018(BufferedImage var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Graphics2D var9 = (Graphics2D)var0.getGraphics();
      var9.drawImage(var0.getSubimage(var1, var2, var3, var4), var1 + var5, var2 + var6, null);
   }
}
