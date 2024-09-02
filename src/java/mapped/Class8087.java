package mapped;

import com.google.common.collect.Maps;
import com.mojang.util.UUIDTypeAdapter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Map;
import java.util.UUID;
import javax.imageio.ImageIO;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8087 {
   private static final Map<String, Class7275> field34751 = Maps.newHashMap();
   private static final Map<String, Boolean> field34752 = Maps.newHashMap();
   private static final Map<String, String> field34753 = Maps.newHashMap();
   private static final Logger field34754 = LogManager.getLogger();
   private static final ResourceLocation field34755 = new ResourceLocation("textures/gui/presets/isles.png");

   public static void method27972(String var0, String var1) {
      if (var1 != null) {
         int var4 = method27976(var0, var1);
         RenderSystem.method27865(var4);
      } else {
         Minecraft.getInstance().getTextureManager().bindTexture(field34755);
      }
   }

   public static void method27973(String var0, Runnable var1) {
      RenderSystem.method27815();

      try {
         method27975(var0);
         var1.run();
      } finally {
         RenderSystem.method27816();
      }
   }

   private static void method27974(UUID var0) {
      Minecraft.getInstance().getTextureManager().bindTexture(Class7209.method22637(var0));
   }

   private static void method27975(String var0) {
      UUID var3 = UUIDTypeAdapter.fromString(var0);
      if (!field34751.containsKey(var0)) {
         if (!field34752.containsKey(var0)) {
            field34752.put(var0, false);
            method27974(var3);
            Class385 var4 = new Class385("Realms Texture Downloader", var0);
            var4.setDaemon(true);
            var4.start();
         } else if (field34752.get(var0)) {
            if (!field34753.containsKey(var0)) {
               method27974(var3);
            } else {
               int var5 = method27976(var0, field34753.get(var0));
               RenderSystem.method27865(var5);
            }
         } else {
            method27974(var3);
         }
      } else {
         RenderSystem.method27865(Class7275.method22907(field34751.get(var0)));
      }
   }

   private static int method27976(String var0, String var1) {
      int var5;
      if (field34751.containsKey(var0)) {
         Class7275 var4 = field34751.get(var0);
         if (Class7275.method22908(var4).equals(var1)) {
            return Class7275.method22907(var4);
         }

         RenderSystem.method27864(Class7275.method22907(var4));
         var5 = Class7275.method22907(var4);
      } else {
         var5 = GlStateManager.method23810();
      }

      IntBuffer var15 = null;
      int var6 = 0;
      int var7 = 0;

      try {
         ByteArrayInputStream var8 = new ByteArrayInputStream(new Base64().decode(var1));

         BufferedImage var9;
         try {
            var9 = ImageIO.read(var8);
         } finally {
            IOUtils.closeQuietly(var8);
         }

         var6 = var9.getWidth();
         var7 = var9.getHeight();
         int[] var10 = new int[var6 * var7];
         var9.getRGB(0, 0, var6, var7, var10, 0, var6);
         var15 = ByteBuffer.allocateDirect(4 * var6 * var7).order(ByteOrder.nativeOrder()).asIntBuffer();
         var15.put(var10);
         ((Buffer)var15).flip();
      } catch (IOException var14) {
         var14.printStackTrace();
      }

      RenderSystem.method27860(33984);
      RenderSystem.method27865(var5);
      Class8535.method30375(var15, var6, var7);
      field34751.put(var0, new Class7275(var1, var5));
      return var5;
   }

   // $VF: synthetic method
   public static Logger method27977() {
      return field34754;
   }

   // $VF: synthetic method
   public static Map method27978() {
      return field34752;
   }

   // $VF: synthetic method
   public static Map method27979() {
      return field34753;
   }
}
