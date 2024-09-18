package net.minecraft.client.renderer.texture;

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

import mapped.Class2083;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;

public class TextureUtil {
   private static String[] field38381;
   private static final Logger field38382 = LogManager.getLogger();

   public static int generateTextureId() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (!SharedConstants.developmentMode) {
         return GlStateManager.method23810();
      } else {
         int[] var2 = new int[ThreadLocalRandom.current().nextInt(15) + 1];
         GlStateManager.method23811(var2);
         int var3 = GlStateManager.method23810();
         GlStateManager.method23813(var2);
         return var3;
      }
   }

   public static void releaseTextureId(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GlStateManager.method23812(var0);
   }

   public static void method30368(int var0, int var1, int var2) {
      method30371(Class2083.field13564, var0, 0, var1, var2);
   }

   public static void method30369(Class2083 var0, int var1, int var2, int var3) {
      method30371(var0, var1, 0, var2, var3);
   }

   public static void method30370(int var0, int var1, int var2, int var3) {
      method30371(Class2083.field13564, var0, var1, var2, var3);
   }

   public static void method30371(Class2083 var0, int var1, int var2, int var3, int var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      method30372(var1);
      if (var2 >= 0) {
         GlStateManager.texParameter(3553, 33085, var2);
         GlStateManager.texParameter(3553, 33082, 0);
         GlStateManager.texParameter(3553, 33083, var2);
         GlStateManager.method23807(3553, 34049, 0.0F);
      }

      for (int var7 = 0; var7 <= var2; var7++) {
         GlStateManager.texImage2D(3553, var7, var0.method8738(), var3 >> var7, var4 >> var7, 0, 6408, 5121, (IntBuffer)null);
      }
   }

   private static void method30372(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GlStateManager.bindTexture(var0);
   }

   public static ByteBuffer method30373(InputStream var0) throws IOException {
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

   public static String method30374(InputStream var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      ByteBuffer var3 = null;

      try {
         var3 = method30373(var0);
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

   public static void method30375(IntBuffer var0, int var1, int var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
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
