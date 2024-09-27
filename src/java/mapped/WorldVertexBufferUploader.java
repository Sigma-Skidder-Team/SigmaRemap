package mapped;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import net.optifine.Config;
import org.lwjgl.system.MemoryUtil;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class WorldVertexBufferUploader {
   private static String[] field21479;

   public static void draw(BufferBuilder var0) {
      if (RenderSystem.isOnRenderThread()) {
         Pair var3 = var0.method17070();
         Class9105 var4 = (Class9105)var3.getFirst();
         method13896((ByteBuffer)var3.getSecond(), var4.method33953(), var4.method33951(), var4.method33952());
      } else {
         RenderSystem.recordRenderCall(() -> {
            Pair var3x = var0.method17070();
            Class9105 var4x = (Class9105)var3x.getFirst();
            method13896((ByteBuffer)var3x.getSecond(), var4x.method33953(), var4x.method33951(), var4x.method33952());
         });
      }
   }

   private static void method13896(ByteBuffer var0, int var1, Class7831 var2, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      ((Buffer)var0).clear();
      if (var3 > 0) {
         var2.method26218(MemoryUtil.memAddress(var0));
         if (!Config.isShaders()) {
            GlStateManager.method23854(var1, 0, var3);
         } else {
            Class7698.method25387(var1, 0, var3, var2, var0);
         }

         var2.method26219();
      }
   }
}
