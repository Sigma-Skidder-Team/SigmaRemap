package net.minecraft.client.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import java.util.function.BiConsumer;

public abstract class AbstractGui {
   public static final ResourceLocation field6451 = new ResourceLocation("textures/gui/options_background.png");
   public static final ResourceLocation field6452 = new ResourceLocation("textures/gui/container/stats_icons.png");
   public static final ResourceLocation field6453 = new ResourceLocation("textures/gui/icons.png");
   private int field6454;

   public void method5684(MatrixStack var1, int var2, int var3, int var4, int var5) {
      if (var3 < var2) {
         int var8 = var2;
         var2 = var3;
         var3 = var8;
      }

      method5686(var1, var2, var4, var3 + 1, var4 + 1, var5);
   }

   public void method5685(MatrixStack var1, int var2, int var3, int var4, int var5) {
      if (var4 < var3) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      method5686(var1, var2, var3 + 1, var2 + 1, var4, var5);
   }

   public static void method5686(MatrixStack var0, int var1, int var2, int var3, int var4, int var5) {
      method5687(var0.getLast().getMatrix(), var1, var2, var3, var4, var5);
   }

   private static void method5687(Matrix4f var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 < var3) {
         int var8 = var1;
         var1 = var3;
         var3 = var8;
      }

      if (var2 < var4) {
         int var13 = var2;
         var2 = var4;
         var4 = var13;
      }

      float var14 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var9 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var5 & 0xFF) / 255.0F;
      BufferBuilder var12 = Tessellator.getInstance().getBuffer();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      var12.begin(7, DefaultVertexFormats.POSITION_COLOR);
      var12.pos(var0, (float)var1, (float)var4, 0.0F).color(var9, var10, var11, var14).endVertex();
      var12.pos(var0, (float)var3, (float)var4, 0.0F).color(var9, var10, var11, var14).endVertex();
      var12.pos(var0, (float)var3, (float)var2, 0.0F).color(var9, var10, var11, var14).endVertex();
      var12.pos(var0, (float)var1, (float)var2, 0.0F).color(var9, var10, var11, var14).endVertex();
      var12.finishDrawing();
      WorldVertexBufferUploader.draw(var12);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   public void method5688(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      RenderSystem.disableTexture();
      RenderSystem.enableBlend();
      RenderSystem.method27817();
      RenderSystem.defaultBlendFunc();
      RenderSystem.method27866(7425);
      Tessellator var10 = Tessellator.getInstance();
      BufferBuilder var11 = var10.getBuffer();
      var11.begin(7, DefaultVertexFormats.POSITION_COLOR);
      method5689(var1.getLast().getMatrix(), var11, var2, var3, var4, var5, this.field6454, var6, var7);
      var10.draw();
      RenderSystem.method27866(7424);
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
      RenderSystem.enableTexture();
   }

   public static void method5689(Matrix4f var0, BufferBuilder var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      float var11 = (float)(var7 >> 24 & 0xFF) / 255.0F;
      float var12 = (float)(var7 >> 16 & 0xFF) / 255.0F;
      float var13 = (float)(var7 >> 8 & 0xFF) / 255.0F;
      float var14 = (float)(var7 & 0xFF) / 255.0F;
      float var15 = (float)(var8 >> 24 & 0xFF) / 255.0F;
      float var16 = (float)(var8 >> 16 & 0xFF) / 255.0F;
      float var17 = (float)(var8 >> 8 & 0xFF) / 255.0F;
      float var18 = (float)(var8 & 0xFF) / 255.0F;
      var1.pos(var0, (float)var4, (float)var3, (float)var6).color(var12, var13, var14, var11).endVertex();
      var1.pos(var0, (float)var2, (float)var3, (float)var6).color(var12, var13, var14, var11).endVertex();
      var1.pos(var0, (float)var2, (float)var5, (float)var6).color(var16, var17, var18, var15).endVertex();
      var1.pos(var0, (float)var4, (float)var5, (float)var6).color(var16, var17, var18, var15).endVertex();
   }

   public static void method5690(MatrixStack var0, FontRenderer var1, String var2, int var3, int var4, int var5) {
      var1.drawStringWithShadow(var0, var2, (float)(var3 - var1.getStringWidth(var2) / 2), (float)var4, var5);
   }

   public static void drawCenteredString(MatrixStack var0, FontRenderer var1, ITextComponent var2, int var3, int var4, int var5) {
      Class9125 var8 = var2.func_241878_f();
      var1.method38802(var0, var8, (float)(var3 - var1.method38822(var8) / 2), (float)var4, var5);
   }

   public static void drawString(MatrixStack var0, FontRenderer var1, String var2, int var3, int var4, int var5) {
      var1.drawStringWithShadow(var0, var2, (float)var3, (float)var4, var5);
   }

   public static void method5693(MatrixStack var0, FontRenderer var1, ITextComponent var2, int var3, int var4, int var5) {
      var1.method38803(var0, var2, (float)var3, (float)var4, var5);
   }

   public void method5694(int var1, int var2, BiConsumer<Integer, Integer> var3) {
      RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.field16000, DestFactor.field12932, GlStateManager.SourceFactor.field15997, DestFactor.field12932);
      var3.accept(var1 + 1, var2);
      var3.accept(var1 - 1, var2);
      var3.accept(var1, var2 + 1);
      var3.accept(var1, var2 - 1);
      RenderSystem.method27834(GlStateManager.SourceFactor.field15997, DestFactor.field12932);
      var3.accept(var1, var2);
   }

   public static void method5695(MatrixStack var0, int var1, int var2, int var3, int var4, int var5, TextureAtlasSprite var6) {
      method5701(
         var0.getLast().getMatrix(),
         var1,
         var1 + var4,
         var2,
         var2 + var5,
         var3,
         var6.getMinU(),
         var6.getMaxU(),
         var6.getMinV(),
         var6.getMaxV()
      );
   }

   public void blit(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      method5697(var1, var2, var3, this.field6454, (float)var4, (float)var5, var6, var7, 256, 256);
   }

   public static void method5697(MatrixStack var0, int var1, int var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      method5700(var0, var1, var1 + var6, var2, var2 + var7, var3, var6, var7, var4, var5, var9, var8);
   }

   public static void method5698(MatrixStack var0, int var1, int var2, int var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      method5700(var0, var1, var1 + var3, var2, var2 + var4, 0, var7, var8, var5, var6, var9, var10);
   }

   public static void method5699(MatrixStack var0, int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8) {
      method5698(var0, var1, var2, var5, var6, var3, var4, var5, var6, var7, var8);
   }

   private static void method5700(
           MatrixStack var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11
   ) {
      method5701(
         var0.getLast().getMatrix(),
         var1,
         var2,
         var3,
         var4,
         var5,
         (var8 + 0.0F) / (float)var10,
         (var8 + (float)var6) / (float)var10,
         (var9 + 0.0F) / (float)var11,
         (var9 + (float)var7) / (float)var11
      );
   }

   private static void method5701(Matrix4f var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9) {
      BufferBuilder var12 = Tessellator.getInstance().getBuffer();
      var12.begin(7, DefaultVertexFormats.field43344);
      var12.pos(var0, (float)var1, (float)var4, (float)var5).tex(var6, var9).endVertex();
      var12.pos(var0, (float)var2, (float)var4, (float)var5).tex(var7, var9).endVertex();
      var12.pos(var0, (float)var2, (float)var3, (float)var5).tex(var7, var8).endVertex();
      var12.pos(var0, (float)var1, (float)var3, (float)var5).tex(var6, var8).endVertex();
      var12.finishDrawing();
      RenderSystem.disableAlphaTest();
      WorldVertexBufferUploader.draw(var12);
   }

   public int method5702() {
      return this.field6454;
   }

   public void method5703(int var1) {
      this.field6454 = var1;
   }
}
