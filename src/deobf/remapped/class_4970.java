package remapped;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;

public class class_4970 {
   private static String[] field_25743;
   private static final Logger field_25744 = LogManager.getLogger();

   public static int method_22837() {
      RenderSystem.assertThread(RenderSystem::method_16440);
      if (!class_7665.field_38958) {
         return GlStateManager.method_8807();
      } else {
         int[] var2 = new int[ThreadLocalRandom.current().nextInt(15) + 1];
         GlStateManager.method_8906(var2);
         int var3 = GlStateManager.method_8807();
         GlStateManager.method_8859(var2);
         return var3;
      }
   }

   public static void method_22838(int var0) {
      RenderSystem.assertThread(RenderSystem::method_16440);
      GlStateManager.method_8904(var0);
   }

   public static void method_22840(int var0, int var1, int var2) {
      method_22843(class_2757.field_13482, var0, 0, var1, var2);
   }

   public static void method_22842(class_2757 var0, int var1, int var2, int var3) {
      method_22843(var0, var1, 0, var2, var3);
   }

   public static void method_22841(int var0, int var1, int var2, int var3) {
      method_22843(class_2757.field_13482, var0, var1, var2, var3);
   }

   public static void method_22843(class_2757 var0, int var1, int var2, int var3, int var4) {
      RenderSystem.assertThread(RenderSystem::method_16440);
      method_22839(var1);
      if (var2 >= 0) {
         GlStateManager.method_8879(3553, 33085, var2);
         GlStateManager.method_8879(3553, 33082, 0);
         GlStateManager.method_8879(3553, 33083, var2);
         GlStateManager.method_8878(3553, 34049, 0.0F);
      }

      for (int var7 = 0; var7 <= var2; var7++) {
         GlStateManager.method_8886(3553, var7, var0.method_12552(), var3 >> var7, var4 >> var7, 0, 6408, 5121, (IntBuffer)null);
      }
   }

   private static void method_22839(int var0) {
      RenderSystem.assertThread(RenderSystem::method_16440);
      GlStateManager.method_8791(var0);
   }

   public static ByteBuffer method_22844(InputStream var0) throws IOException {
      ByteBuffer var3;
      if (!(var0 instanceof FileInputStream)) {
         var3 = MemoryUtil.memAlloc(8192);
         ReadableByteChannel var4 = Channels.newChannel(var0);

         while (var4.read(var3) != -1) {
            if (var3.remaining() == 0) {
               var3 = MemoryUtil.memRealloc(var3, var3.capacity() * 2);
            }
         }
      } else {
         FileInputStream var6 = (FileInputStream)var0;
         FileChannel var5 = var6.getChannel();
         var3 = MemoryUtil.memAlloc((int)var5.size() + 1);

         while (var5.read(var3) != -1) {
         }
      }

      return var3;
   }

   public static String method_22845(InputStream var0) {
      RenderSystem.assertThread(RenderSystem::method_16366);
      ByteBuffer var3 = null;

      try {
         var3 = method_22844(var0);
         int var4 = var3.position();
         ((Buffer)var3).rewind();
         return MemoryUtil.memASCII(var3, var4);
      } catch (IOException var9) {
      } finally {
         if (var3 != null) {
            MemoryUtil.memFree(var3);
         }
      }

      return null;
   }

   public static void method_22836(IntBuffer var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::method_16366);
      GL11.glPixelStorei(3312, 0);
      GL11.glPixelStorei(3313, 0);
      GL11.glPixelStorei(3314, 0);
      GL11.glPixelStorei(3315, 0);
      GL11.glPixelStorei(3316, 0);
      GL11.glPixelStorei(3317, 4);
      GL11.glTexImage2D(3553, 0, 6408, var1, var2, 0, 32993, 33639, var0);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10241, 9729);
   }
}
