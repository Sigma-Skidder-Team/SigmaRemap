package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;

public class Class5127 implements Class5119 {
   private static String[] field23314;
   private final Minecraft field23315;

   public Class5127(Minecraft var1) {
      this.field23315 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      if (! Shaders.field40609) {
         if (Class7944.method26921()) {
            Shaders.method33119();
         }

         RenderSystem.enableDepthTest();
         RenderSystem.method27866(7425);
         RenderSystem.disableAlphaTest();
         RenderSystem.method27939();
         Entity var11 = this.field23315.gameRenderer.getActiveRenderInfo().getRenderViewEntity();
         Tessellator var12 = Tessellator.getInstance();
         BufferBuilder var13 = var12.getBuffer();
         double var14 = 0.0 - var5;
         double var16 = 256.0 - var5;
         RenderSystem.disableTexture();
         RenderSystem.disableBlend();
         double var18 = (double)(var11.chunkCoordX << 4) - var3;
         double var20 = (double)(var11.chunkCoordZ << 4) - var7;
         RenderSystem.lineWidth(1.0F);
         var13.begin(3, DefaultVertexFormats.POSITION_COLOR);

         for (int var22 = -16; var22 <= 32; var22 += 16) {
            for (int var23 = -16; var23 <= 32; var23 += 16) {
               var13.pos(var18 + (double)var22, var14, var20 + (double)var23).color(1.0F, 0.0F, 0.0F, 0.0F).endVertex();
               var13.pos(var18 + (double)var22, var14, var20 + (double)var23).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
               var13.pos(var18 + (double)var22, var16, var20 + (double)var23).color(1.0F, 0.0F, 0.0F, 0.5F).endVertex();
               var13.pos(var18 + (double)var22, var16, var20 + (double)var23).color(1.0F, 0.0F, 0.0F, 0.0F).endVertex();
            }
         }

         for (int var26 = 2; var26 < 16; var26 += 2) {
            var13.pos(var18 + (double)var26, var14, var20).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
            var13.pos(var18 + (double)var26, var14, var20).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18 + (double)var26, var16, var20).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18 + (double)var26, var16, var20).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
            var13.pos(var18 + (double)var26, var14, var20 + 16.0).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
            var13.pos(var18 + (double)var26, var14, var20 + 16.0).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18 + (double)var26, var16, var20 + 16.0).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18 + (double)var26, var16, var20 + 16.0).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
         }

         for (int var27 = 2; var27 < 16; var27 += 2) {
            var13.pos(var18, var14, var20 + (double)var27).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
            var13.pos(var18, var14, var20 + (double)var27).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18, var16, var20 + (double)var27).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18, var16, var20 + (double)var27).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
            var13.pos(var18 + 16.0, var14, var20 + (double)var27).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
            var13.pos(var18 + 16.0, var14, var20 + (double)var27).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18 + 16.0, var16, var20 + (double)var27).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18 + 16.0, var16, var20 + (double)var27).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
         }

         for (int var28 = 0; var28 <= 256; var28 += 2) {
            double var24 = (double)var28 - var5;
            var13.pos(var18, var24, var20).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
            var13.pos(var18, var24, var20).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18, var24, var20 + 16.0).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18 + 16.0, var24, var20 + 16.0).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18 + 16.0, var24, var20).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18, var24, var20).color(1.0F, 1.0F, 0.0F, 1.0F).endVertex();
            var13.pos(var18, var24, var20).color(1.0F, 1.0F, 0.0F, 0.0F).endVertex();
         }

         var12.draw();
         RenderSystem.lineWidth(2.0F);
         var13.begin(3, DefaultVertexFormats.POSITION_COLOR);

         for (int var29 = 0; var29 <= 16; var29 += 16) {
            for (int var31 = 0; var31 <= 16; var31 += 16) {
               var13.pos(var18 + (double)var29, var14, var20 + (double)var31).color(0.25F, 0.25F, 1.0F, 0.0F).endVertex();
               var13.pos(var18 + (double)var29, var14, var20 + (double)var31).color(0.25F, 0.25F, 1.0F, 1.0F).endVertex();
               var13.pos(var18 + (double)var29, var16, var20 + (double)var31).color(0.25F, 0.25F, 1.0F, 1.0F).endVertex();
               var13.pos(var18 + (double)var29, var16, var20 + (double)var31).color(0.25F, 0.25F, 1.0F, 0.0F).endVertex();
            }
         }

         for (int var30 = 0; var30 <= 256; var30 += 16) {
            double var32 = (double)var30 - var5;
            var13.pos(var18, var32, var20).color(0.25F, 0.25F, 1.0F, 0.0F).endVertex();
            var13.pos(var18, var32, var20).color(0.25F, 0.25F, 1.0F, 1.0F).endVertex();
            var13.pos(var18, var32, var20 + 16.0).color(0.25F, 0.25F, 1.0F, 1.0F).endVertex();
            var13.pos(var18 + 16.0, var32, var20 + 16.0).color(0.25F, 0.25F, 1.0F, 1.0F).endVertex();
            var13.pos(var18 + 16.0, var32, var20).color(0.25F, 0.25F, 1.0F, 1.0F).endVertex();
            var13.pos(var18, var32, var20).color(0.25F, 0.25F, 1.0F, 1.0F).endVertex();
            var13.pos(var18, var32, var20).color(0.25F, 0.25F, 1.0F, 0.0F).endVertex();
         }

         var12.draw();
         RenderSystem.lineWidth(1.0F);
         RenderSystem.enableBlend();
         RenderSystem.enableTexture();
         RenderSystem.method27866(7424);
         if (Class7944.method26921()) {
            Shaders.method33120();
         }
      }
   }
}
