package mapped;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public class Class1698 implements AutoCloseable {
   private static String[] field9241;
   private int field9242;
   private final Class7831 field9243;
   private int field9244;
   private Class8836 field9245;
   private Class8697 field9246;
   private int field9247;

   public Class1698(Class7831 var1) {
      this.field9243 = var1;
      RenderSystem.method27936(var1x -> this.field9242 = var1x);
   }

   public void method7302() {
      GlStateManager.method23747(34962, this.field9242);
   }

   public void method7303(BufferBuilder var1) {
      if (RenderSystem.isOnRenderThread()) {
         this.method7305(var1);
      } else {
         RenderSystem.recordRenderCall(() -> this.method7305(var1));
      }
   }

   public CompletableFuture<Void> method7304(BufferBuilder var1) {
      if (RenderSystem.isOnRenderThread()) {
         this.method7305(var1);
         return CompletableFuture.<Void>completedFuture((Void)null);
      } else {
         return CompletableFuture.runAsync(() -> this.method7305(var1), var0 -> RenderSystem.recordRenderCall(var0::run));
      }
   }

   private void method7305(BufferBuilder var1) {
      Pair var4 = var1.method17070();
      this.field9247 = 0;
      Class9105 var5 = (Class9105)var4.getFirst();
      if (var5.method33953() != 7) {
         this.field9247 = var5.method33953();
      }

      if (this.field9245 == null) {
         if (this.field9242 != -1) {
            ByteBuffer var6 = (ByteBuffer)var4.getSecond();
            this.field9244 = var6.remaining() / this.field9243.method26216();
            this.method7302();
            RenderSystem.method27910(34962, var6, 35044);
            method7308();
         }
      } else {
         ByteBuffer var7 = (ByteBuffer)var4.getSecond();
         this.field9245.method31978(var7, this.field9246);
      }
   }

   public void method7306(Matrix4f var1, int var2) {
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.method27888(var1);
      if (this.field9247 > 0) {
         var2 = this.field9247;
      }

      if (this.field9245 == null) {
         RenderSystem.method27892(var2, 0, this.field9244);
      } else {
         this.field9245.method31985(var2, this.field9246);
      }

      RenderSystem.popMatrix();
   }

   public void method7307(int var1) {
      if (this.field9247 > 0) {
         var1 = this.field9247;
      }

      if (this.field9245 == null) {
         RenderSystem.method27892(var1, 0, this.field9244);
      } else {
         this.field9245.method31985(var1, this.field9246);
      }
   }

   public static void method7308() {
      GlStateManager.method23747(34962, 0);
   }

   @Override
   public void close() {
      if (this.field9242 >= 0) {
         RenderSystem.method27911(this.field9242);
         this.field9242 = -1;
      }
   }

   public void method7309(Class8836 var1) {
      if (var1 != null) {
         this.close();
         this.field9245 = var1;
         this.field9246 = new Class8697();
      }
   }

   public Class8836 method7310() {
      return this.field9245;
   }
}
