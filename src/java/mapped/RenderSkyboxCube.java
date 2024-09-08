package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class RenderSkyboxCube {
   private final ResourceLocation[] field32058 = new ResourceLocation[6];

   public RenderSkyboxCube(ResourceLocation var1) {
      for (int var4 = 0; var4 < 6; var4++) {
         this.field32058[var4] = new ResourceLocation(var1.getNamespace(), var1.getPath() + '_' + var4 + ".png");
      }
   }

   public void method24087(Minecraft var1, float var2, float var3, float var4) {
      Tessellator var7 = Tessellator.getInstance();
      BufferBuilder var8 = var7.getBuffer();
      RenderSystem.matrixMode(5889);
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.method27888(Matrix4f.method35511(85.0, (float)var1.getMainWindow().getFramebufferWidth() / (float)var1.getMainWindow().getFramebufferHeight(), 0.05F, 10.0F));
      RenderSystem.matrixMode(5888);
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.method27883(180.0F, 1.0F, 0.0F, 0.0F);
      RenderSystem.enableBlend();
      RenderSystem.method27817();
      RenderSystem.method27850();
      RenderSystem.depthMask(false);
      RenderSystem.defaultBlendFunc();
      byte var9 = 2;

      for (int var10 = 0; var10 < 4; var10++) {
         RenderSystem.pushMatrix();
         float var11 = ((float)(var10 % 2) / 2.0F - 0.5F) / 256.0F;
         float var12 = ((float)(var10 / 2) / 2.0F - 0.5F) / 256.0F;
         float var13 = 0.0F;
         RenderSystem.translatef(var11, var12, 0.0F);
         RenderSystem.method27883(var2, 1.0F, 0.0F, 0.0F);
         RenderSystem.method27883(var3, 0.0F, 1.0F, 0.0F);

         for (int var14 = 0; var14 < 6; var14++) {
            var1.getTextureManager().bindTexture(this.field32058[var14]);
            var8.begin(7, DefaultVertexFormats.field43346);
            int var15 = Math.round(255.0F * var4) / (var10 + 1);
            if (var14 == 0) {
               var8.pos(-1.0, -1.0, 1.0).tex(0.0F, 0.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(-1.0, 1.0, 1.0).tex(0.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, 1.0, 1.0).tex(1.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, -1.0, 1.0).tex(1.0F, 0.0F).color(255, 255, 255, var15).endVertex();
            }

            if (var14 == 1) {
               var8.pos(1.0, -1.0, 1.0).tex(0.0F, 0.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, 1.0, 1.0).tex(0.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, 1.0, -1.0).tex(1.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, -1.0, -1.0).tex(1.0F, 0.0F).color(255, 255, 255, var15).endVertex();
            }

            if (var14 == 2) {
               var8.pos(1.0, -1.0, -1.0).tex(0.0F, 0.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, 1.0, -1.0).tex(0.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(-1.0, 1.0, -1.0).tex(1.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(-1.0, -1.0, -1.0).tex(1.0F, 0.0F).color(255, 255, 255, var15).endVertex();
            }

            if (var14 == 3) {
               var8.pos(-1.0, -1.0, -1.0).tex(0.0F, 0.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(-1.0, 1.0, -1.0).tex(0.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(-1.0, 1.0, 1.0).tex(1.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(-1.0, -1.0, 1.0).tex(1.0F, 0.0F).color(255, 255, 255, var15).endVertex();
            }

            if (var14 == 4) {
               var8.pos(-1.0, -1.0, -1.0).tex(0.0F, 0.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(-1.0, -1.0, 1.0).tex(0.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, -1.0, 1.0).tex(1.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, -1.0, -1.0).tex(1.0F, 0.0F).color(255, 255, 255, var15).endVertex();
            }

            if (var14 == 5) {
               var8.pos(-1.0, 1.0, 1.0).tex(0.0F, 0.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(-1.0, 1.0, -1.0).tex(0.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, 1.0, -1.0).tex(1.0F, 1.0F).color(255, 255, 255, var15).endVertex();
               var8.pos(1.0, 1.0, 1.0).tex(1.0F, 0.0F).color(255, 255, 255, var15).endVertex();
            }

            var7.draw();
         }

         RenderSystem.popMatrix();
         RenderSystem.method27870(true, true, true, false);
      }

      RenderSystem.method27870(true, true, true, true);
      RenderSystem.matrixMode(5889);
      RenderSystem.popMatrix();
      RenderSystem.matrixMode(5888);
      RenderSystem.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.enableDepthTest();
   }

   public CompletableFuture<Void> method24088(TextureManager var1, Executor var2) {
      CompletableFuture[] var5 = new CompletableFuture[6];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = var1.method1078(this.field32058[var6], var2);
      }

      return CompletableFuture.allOf(var5);
   }
}
