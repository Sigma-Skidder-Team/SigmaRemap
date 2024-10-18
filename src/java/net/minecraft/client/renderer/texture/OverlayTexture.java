package net.minecraft.client.renderer.texture;

import com.mojang.blaze3d.systems.RenderSystem;
import net.optifine.shaders.Shaders;

public class OverlayTexture implements AutoCloseable {
   private static String[] field797;
   public static final int NO_OVERLAY = method730(0, 10);
   private final DynamicTexture field799 = new DynamicTexture(16, 16, false);

   public OverlayTexture() {
      NativeImage var3 = this.field799.method1141();

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            if (var4 >= 8) {
               int var6 = (int)((1.0F - (float)var5 / 15.0F * 0.75F) * 255.0F);
               var3.method7890(var5, var4, var6 << 24 | 16777215);
            } else {
               var3.method7890(var5, var4, -1308622593);
            }
         }
      }

      RenderSystem.activeTexture(33985);
      this.field799.method1133();
      RenderSystem.matrixMode(5890);
      RenderSystem.loadIdentity();
      float var7 = 0.06666667F;
      RenderSystem.scalef(0.06666667F, 0.06666667F, 0.06666667F);
      RenderSystem.matrixMode(5888);
      this.field799.method1133();
      var3.method7895(0, 0, 0, 0, 0, var3.method7886(), var3.method7887(), false, true, false, false);
      RenderSystem.activeTexture(33984);
   }

   @Override
   public void close() {
      this.field799.close();
   }

   public void method727() {
      if (! Shaders.method33168()) {
         RenderSystem.method27926(this.field799::getGlTextureId, 16);
      }
   }

   public static int method728(float var0) {
      return (int)(var0 * 15.0F);
   }

   public static int method729(boolean var0) {
      return !var0 ? 10 : 3;
   }

   public static int method730(int var0, int var1) {
      return var0 | var1 << 16;
   }

   public static int method731(float var0, boolean var1) {
      return method730(method728(var0), method729(var1));
   }

   public void method732() {
      if (! Shaders.method33168()) {
         RenderSystem.method27927();
      }
   }
}
