package net.optifine.shaders;

import java.nio.IntBuffer;
import java.util.List;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3i;
import net.optifine.render.GlBlendState;
import net.optifine.render.GlCullState;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class ShadersRender {
   private static final ResourceLocation field24257 = new ResourceLocation("textures/entity/end_portal.png");

   public static void method17147(Class7624 var0, double var1, double var3, double var5) {
      var0.method24979(var1, var3, var5);
   }

   public static void method17148() {
      if (Shaders.field40605) {
         Shaders.field40668 = true;
         Shaders.method33021(Shaders.field40823);
      }
   }

   public static void method17149() {
      if (Shaders.field40605) {
         Shaders.method33021(Shaders.field40823);
      }
   }

   public static void method17150() {
      if (Shaders.field40605) {
         Shaders.method33021(Shaders.field40823);
      }
   }

   public static void method17151() {
      if (Shaders.field40605) {
         Shaders.method33021(Shaders.field40819);
      }
   }

   public static void method17152() {
      if (Shaders.field40605) {
         Shaders.method33021(Shaders.field40840);
      }
   }

   public static void method17153() {
      if (Shaders.field40605) {
         Shaders.method33021(Shaders.field40819);
      }
   }

   public static void method17154(GameRenderer var0, MatrixStack var1, ActiveRenderInfo var2, float var3) {
      if (! Shaders.isShadowPass) {
         boolean var6 = Shaders.method33149();
         boolean var7 = Shaders.method33150();
         if (!var6 || !var7) {
            Shaders.method33097();
            Shaders.method33105(var1, false);
            GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            Shaders.method33155(var6, var7);
            var0.method747(var1, var2, var3, true, false, false);
            Shaders.method33106(var1);
            Shaders.method33156(!var6, !var7);
            Shaders.method33155(false, false);
         }
      }
   }

   public static void renderHand1(GameRenderer var0, MatrixStack var1, ActiveRenderInfo var2, float var3) {
      if (! Shaders.isShadowPass && ! Shaders.method33151()) {
         Shaders.method33097();
         GlStateManager.enableBlend();
         Shaders.method33105(var1, true);
         GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         Shaders.method33155(Shaders.method33157(), Shaders.method33158());
         var0.method747(var1, var2, var3, true, false, true);
         Shaders.method33106(var1);
         Shaders.method33156(true, true);
         Shaders.method33155(false, false);
      }
   }

   public static void method17156(FirstPersonRenderer var0, float var1, MatrixStack var2, Class7735 var3, ClientPlayerEntity var4, int var5, boolean var6) {
      GlStateManager.depthMask(true);
      if (var6) {
         GlStateManager.depthFunc(519);
         var2.push();
         IntBuffer var9 = Shaders.field40852;
         Shaders.method33020(Shaders.field40978);
         Shaders.field40617 = true;
         var0.method37590(var1, var2, var3, var4, var5);
         Shaders.field40617 = false;
         Shaders.method33020(var9);
         var2.pop();
      }

      GlStateManager.depthFunc(515);
      GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var0.method37590(var1, var2, var3, var4, var5);
   }

   public static void renderFPOverlay(GameRenderer var0, MatrixStack var1, ActiveRenderInfo var2, float var3) {
      if (! Shaders.isShadowPass) {
         Shaders.method33107();
         var0.method747(var1, var2, var3, false, true, false);
         Shaders.method33108();
      }
   }

   public static void method17158() {
      if (Shaders.field40605) {
         Shaders.method33021(Shaders.field40827);
         if (Shaders.field40827.method26485() == Shaders.field40823.method26485()) {
            Shaders.method33020(Shaders.field40979);
            GlStateManager.depthMask(false);
         }
      }
   }

   public static void method17159() {
      if (Shaders.field40605) {
         GlStateManager.depthMask(true);
         Shaders.method33021(Shaders.field40819);
      }
   }

   public static void method17160(GameRenderer var0, ActiveRenderInfo var1, int var2, float var3, long var4) {
      if (Shaders.field40804 > 0 && -- Shaders.field40793 <= 0) {
         Minecraft var8 = Minecraft.getInstance();
         var8.getProfiler().endStartSection("shadow pass");
         WorldRenderer var9 = var8.worldRenderer;
         Shaders.isShadowPass = true;
         Shaders.field40793 = Shaders.field40783;
         Shaders.method32984("pre shadow");
         GL30.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL30.glMatrixMode(5888);
         GL11.glPushMatrix();
         var8.getProfiler().endStartSection("shadow clear");
         EXTFramebufferObject.glBindFramebufferEXT(36160, Shaders.field40808);
         Shaders.method32984("shadow bind sfb");
         var8.getProfiler().endStartSection("shadow camera");
         method17161(var1, var8, var3);
         MatrixStack var10 = new MatrixStack();
         Shaders.method33053(var10, var1, var3);
         Shaders.method32984("shadow camera");
         Shaders.method33021(Shaders.field40814);
         GL30.glDrawBuffers(Shaders.field40977);
         Shaders.method32984("shadow drawbuffers");
         GL30.glReadBuffer(0);
         Shaders.method32984("shadow readbuffer");
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Shaders.field40975.get(0), 0);
         if (Shaders.field40803 != 0) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, Shaders.field40974.get(0), 0);
         }

         Shaders.method32983("shadow fb");
         GL30.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL30.glClear(Shaders.field40803 == 0 ? 256 : 16640);
         Shaders.method32984("shadow clear");
         var8.getProfiler().endStartSection("shadow frustum");
         Class7649 var11 = new Class7649();
         var8.getProfiler().endStartSection("shadow culling");
         Vector3d var12 = var1.getPos();
         var11.method25119(var12.x, var12.y, var12.z);
         GlStateManager.shadeModel(7425);
         GlStateManager.enableDepthTest();
         GlStateManager.depthFunc(515);
         GlStateManager.depthMask(true);
         GlStateManager.colorMask(true, true, true, true);
         GlStateManager.method23878(new GlCullState(false));
         GlStateManager.method23874(new GlBlendState(false));
         var8.getProfiler().endStartSection("shadow prepareterrain");
         var8.getTextureManager().bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
         var8.getProfiler().endStartSection("shadow setupterrain");
         int var13 = var8.worldRenderer.method936();
         var9.method874(var1, var11, false, var13, var8.player.isSpectator());
         var8.getProfiler().endStartSection("shadow updatechunks");
         var8.getProfiler().endStartSection("shadow terrain");
         double var14 = var12.getX();
         double var16 = var12.getY();
         double var18 = var12.getZ();
         GlStateManager.matrixMode(5888);
         GlStateManager.method23832();
         GlStateManager.disableAlphaTest();
         var9.method880(Class9025.field41288, var10, var14, var16, var18);
         Shaders.method32984("shadow terrain solid");
         GlStateManager.enableAlphaTest();
         var9.method880(Class9025.field41289, var10, var14, var16, var18);
         Shaders.method32984("shadow terrain cutoutmipped");
         var8.getTextureManager().getTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE).method1130(false, false);
         var9.method880(Class9025.field41290, var10, var14, var16, var18);
         Shaders.method32984("shadow terrain cutout");
         var8.getTextureManager().getTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE).method1137();
         GlStateManager.shadeModel(7424);
         GlStateManager.alphaFunc(516, 0.1F);
         GlStateManager.matrixMode(5888);
         GlStateManager.method23833();
         GlStateManager.method23832();
         var8.getProfiler().endStartSection("shadow entities");
         WorldRenderer var20 = var8.worldRenderer;
         EntityRendererManager var21 = var8.getRenderManager();
         Class7735 var22 = var20.method937().getBufferSource();
         boolean var23 = Shaders.isShadowPass && !var8.player.isSpectator();

         for (Class7002 var25 : var20.method938()) {
            Class8066 var26 = var25.field30281;
            Chunk var27 = var26.method27740();

            for (Entity var29 : var27.method7146()[var26.method27718().getY() / 16]) {
               if ((var21.method32218(var29, var11, var14, var16, var18) || var29.method3417(var8.player))
                  && (
                     var29 != var1.getRenderViewEntity()
                        || var23
                        || var1.method37511()
                        || var1.getRenderViewEntity() instanceof LivingEntity && ((LivingEntity)var1.getRenderViewEntity()).isSleeping()
                  )
                  && (!(var29 instanceof ClientPlayerEntity) || var1.getRenderViewEntity() == var29)) {
                  var20.field1000 = var29;
                  Shaders.method33079(var29);
                  var20.method879(var29, var14, var16, var18, var3, var10, var22);
                  var20.field1000 = null;
               }
            }
         }

         var20.method878(var10);
         var22.finish(RenderType.getEntitySolid(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
         var22.finish(RenderType.getEntityCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
         var22.finish(RenderType.getEntityCutoutNoCull(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
         var22.finish(RenderType.getEntitySmoothCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
         Shaders.endEntities();
         Shaders.beginBlockEntities();
         Class5947.method18475();
         boolean var33 = Reflector.field42943.exists();
         Class7649 var34 = var11;

         for (Class7002 var36 : var20.method939()) {
            List<TileEntity> var37 = var36.field30281.method27715().method24111();
            if (!var37.isEmpty()) {
               for (TileEntity var30 : var37) {
                  if (var33) {
                     AxisAlignedBB var31 = (AxisAlignedBB) Reflector.call(var30, Reflector.field42943);
                     if (var31 != null && !var34.method25122(var31)) {
                        continue;
                     }
                  }

                  Shaders.nextBlockEntity(var30);
                  BlockPos var32 = var30.getPos();
                  var10.push();
                  var10.translate((double)var32.getX() - var14, (double)var32.getY() - var16, (double)var32.getZ() - var18);
                  TileEntityRendererDispatcher.instance.method27962(var30, var3, var10, var22);
                  var10.pop();
               }
            }
         }

         var20.method878(var10);
         var22.finish(RenderType.method14300());
         var22.finish(Class8624.method30906());
         var22.finish(Class8624.method30907());
         var22.finish(Class8624.method30902());
         var22.finish(Class8624.method30903());
         var22.finish(Class8624.method30904());
         var22.finish(Class8624.method30905());
         var22.method25602();
         Shaders.method33093();
         Shaders.method32984("shadow entities");
         GlStateManager.matrixMode(5888);
         GlStateManager.method23833();
         GlStateManager.depthMask(true);
         GlStateManager.disableBlend();
         GlStateManager.method23879();
         GlStateManager.method23787();
         GlStateManager.blendFuncSeparate(770, 771, 1, 0);
         GlStateManager.alphaFunc(516, 0.1F);
         if (Shaders.field40804 >= 2) {
            GlStateManager.method23803(33989);
            Shaders.method32984("pre copy shadow depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Shaders.field40785, Shaders.field40786);
            Shaders.method32984("copy shadow depth");
            GlStateManager.method23803(33984);
         }

         GlStateManager.disableBlend();
         GlStateManager.depthMask(true);
         var8.getTextureManager().bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
         GlStateManager.shadeModel(7425);
         Shaders.method32984("shadow pre-translucent");
         GL30.glDrawBuffers(Shaders.field40977);
         Shaders.method32984("shadow drawbuffers pre-translucent");
         Shaders.method32983("shadow pre-translucent");
         if (Shaders.method32996()) {
            var8.getProfiler().endStartSection("shadow translucent");
            var9.method880(Class9025.field41291, var10, var14, var16, var18);
            Shaders.method32984("shadow translucent");
         }

         GlStateManager.method23875();
         GlStateManager.shadeModel(7424);
         GlStateManager.depthMask(true);
         GlStateManager.method23787();
         GlStateManager.disableBlend();
         GL30.glFlush();
         Shaders.method32984("shadow flush");
         Shaders.isShadowPass = false;
         var8.getProfiler().endStartSection("shadow postprocess");
         if (Shaders.field40599) {
            if (Shaders.field40804 >= 1) {
               if (Shaders.field40858[0]) {
                  GlStateManager.method23803(33988);
                  GlStateManager.bindTexture(Shaders.field40975.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, ! Shaders.field40859[0] ? 9987 : 9984);
               }

               if (Shaders.field40804 >= 2 && Shaders.field40858[1]) {
                  GlStateManager.method23803(33989);
                  GlStateManager.bindTexture(Shaders.field40975.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, ! Shaders.field40859[1] ? 9987 : 9984);
               }

               GlStateManager.method23803(33984);
            }

            if (Shaders.field40803 >= 1) {
               if (Shaders.field40860[0]) {
                  GlStateManager.method23803(33997);
                  GlStateManager.bindTexture(Shaders.field40974.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, ! Shaders.field40861[0] ? 9987 : 9984);
               }

               if (Shaders.field40803 >= 2 && Shaders.field40860[1]) {
                  GlStateManager.method23803(33998);
                  GlStateManager.bindTexture(Shaders.field40974.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, ! Shaders.field40861[1] ? 9987 : 9984);
               }

               GlStateManager.method23803(33984);
            }
         }

         Shaders.method32984("shadow postprocess");
         EXTFramebufferObject.glBindFramebufferEXT(36160, Shaders.field40807);
         GL11.glViewport(0, 0, Shaders.field40603, Shaders.field40604);
         Shaders.field40852 = null;
         var8.getTextureManager().bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
         Shaders.method33021(Shaders.field40823);
         GL30.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5888);
         Shaders.method32984("shadow end");
      }
   }

   public static void method17161(ActiveRenderInfo var0, Minecraft var1, float var2) {
      var0.update(
         var1.world,
         (Entity)(var1.getRenderViewEntity() != null ? var1.getRenderViewEntity() : var1.player),
         !var1.gameSettings.getPointOfView().func_243192_a(),
         var1.gameSettings.getPointOfView().func_243193_b(),
         var2
      );
   }

   public static void method17162(RenderType var0) {
      if (var0 == Class9025.field41288) {
         method17148();
      }

      if (var0 == Class9025.field41289) {
         method17149();
      }

      if (var0 == Class9025.field41290) {
         method17150();
      }

      if (var0 == Class9025.field41291) {
         method17152();
      }

      if (Shaders.method33001(var0)) {
         GlStateManager.method23788();
      }

      if (GLX.useVbo()) {
         GL20.glEnableVertexAttribArray(Shaders.field40671);
         GL20.glEnableVertexAttribArray(Shaders.field40672);
         GL20.glEnableVertexAttribArray(Shaders.field40670);
      }
   }

   public static void method17163(RenderType var0) {
      if (GLX.useVbo()) {
         GL20.glDisableVertexAttribArray(Shaders.field40671);
         GL20.glDisableVertexAttribArray(Shaders.field40672);
         GL20.glDisableVertexAttribArray(Shaders.field40670);
      }

      if (Shaders.method33001(var0)) {
         GlStateManager.method23787();
      }
   }

   public static void method17164(RenderType var0, BufferBuilder var1) {
      if (Shaders.field40605 && ! Shaders.isShadowPass) {
         if (!var0.method14367()) {
            if (!var0.method14234().equals("eyes")) {
               if (!var0.method14234().equals("crumbling")) {
                  if (var0 == RenderType.field21811) {
                     Shaders.method33119();
                  }
               } else {
                  method17158();
               }
            } else {
               Shaders.method33081();
            }
         } else {
            method17172();
         }
      }
   }

   public static void method17165(RenderType var0, BufferBuilder var1) {
      if (Shaders.field40605 && ! Shaders.isShadowPass) {
         if (!var0.method14367()) {
            if (!var0.method14234().equals("eyes")) {
               if (!var0.method14234().equals("crumbling")) {
                  if (var0 == RenderType.field21811) {
                     Shaders.method33120();
                  }
               } else {
                  method17159();
               }
            } else {
               Shaders.method33082();
            }
         } else {
            method17173();
         }
      }
   }

   public static void method17166() {
      GL20.glVertexAttribPointer(Shaders.field40671, 2, 5126, false, 64, 36L);
      GL20.glVertexAttribPointer(Shaders.field40672, 4, 5122, false, 64, 44L);
      GL20.glVertexAttribPointer(Shaders.field40670, 3, 5122, false, 64, 52L);
   }

   public static void method17167() {
      Shaders.method33021(Shaders.field40829);
   }

   public static void method17171() {
      GlStateManager.disableBlend();
   }

   public static void method17172() {
      Shaders.method33021(Shaders.field40833);
   }

   public static void method17173() {
      if (! Shaders.field40605) {
         Shaders.method33021(Shaders.field40813);
      } else if (Shaders.method33161() && Shaders.method33154()) {
         Shaders.method33021(Shaders.field40835);
      } else {
         Shaders.method33021(Shaders.field40831);
      }
   }

   public static boolean method17174(Class956 var0, float var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      if (! Shaders.isShadowPass && Shaders.field40848.method26485() == 0) {
         return false;
      } else {
         GlStateManager.disableLighting();
         Class8892 var9 = var3.getLast();
         Matrix4f var10 = var9.getMatrix();
         Matrix3f var11 = var9.method32362();
         IVertexBuilder var12 = var4.method25597(RenderType.getEntitySolid(field24257));
         float var13 = 0.5F;
         float var14 = var13 * 0.15F;
         float var15 = var13 * 0.3F;
         float var16 = var13 * 0.4F;
         float var17 = 0.0F;
         float var18 = 0.2F;
         float var19 = (float)(System.currentTimeMillis() % 100000L) / 100000.0F;
         float var20 = 0.0F;
         float var21 = 0.0F;
         float var22 = 0.0F;
         if (var0.method3870(Direction.SOUTH)) {
            Vector3i var23 = Direction.SOUTH.getDirectionVec();
            float var24 = (float)var23.getX();
            float var25 = (float)var23.getY();
            float var26 = (float)var23.getZ();
            float var27 = var11.method32832(var24, var25, var26);
            float var28 = var11.method32833(var24, var25, var26);
            float var29 = var11.method32834(var24, var25, var26);
            var12.pos(var10, var20, var21, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var27, var28, var29)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var27, var28, var29)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21 + 1.0F, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var27, var28, var29)
               .endVertex();
            var12.pos(var10, var20, var21 + 1.0F, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var27, var28, var29)
               .endVertex();
         }

         if (var0.method3870(Direction.NORTH)) {
            Vector3i var30 = Direction.NORTH.getDirectionVec();
            float var35 = (float)var30.getX();
            float var40 = (float)var30.getY();
            float var45 = (float)var30.getZ();
            float var50 = var11.method32832(var35, var40, var45);
            float var55 = var11.method32833(var35, var40, var45);
            float var60 = var11.method32834(var35, var40, var45);
            var12.pos(var10, var20, var21 + 1.0F, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var50, var55, var60)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21 + 1.0F, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var50, var55, var60)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var50, var55, var60)
               .endVertex();
            var12.pos(var10, var20, var21, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var50, var55, var60)
               .endVertex();
         }

         if (var0.method3870(Direction.EAST)) {
            Vector3i var31 = Direction.EAST.getDirectionVec();
            float var36 = (float)var31.getX();
            float var41 = (float)var31.getY();
            float var46 = (float)var31.getZ();
            float var51 = var11.method32832(var36, var41, var46);
            float var56 = var11.method32833(var36, var41, var46);
            float var61 = var11.method32834(var36, var41, var46);
            var12.pos(var10, var20 + 1.0F, var21 + 1.0F, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var51, var56, var61)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21 + 1.0F, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var51, var56, var61)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var51, var56, var61)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var51, var56, var61)
               .endVertex();
         }

         if (var0.method3870(Direction.WEST)) {
            Vector3i var32 = Direction.WEST.getDirectionVec();
            float var37 = (float)var32.getX();
            float var42 = (float)var32.getY();
            float var47 = (float)var32.getZ();
            float var52 = var11.method32832(var37, var42, var47);
            float var57 = var11.method32833(var37, var42, var47);
            float var62 = var11.method32834(var37, var42, var47);
            var12.pos(var10, var20, var21, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var52, var57, var62)
               .endVertex();
            var12.pos(var10, var20, var21, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var52, var57, var62)
               .endVertex();
            var12.pos(var10, var20, var21 + 1.0F, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var52, var57, var62)
               .endVertex();
            var12.pos(var10, var20, var21 + 1.0F, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var52, var57, var62)
               .endVertex();
         }

         if (var0.method3870(Direction.DOWN)) {
            Vector3i var33 = Direction.DOWN.getDirectionVec();
            float var38 = (float)var33.getX();
            float var43 = (float)var33.getY();
            float var48 = (float)var33.getZ();
            float var53 = var11.method32832(var38, var43, var48);
            float var58 = var11.method32833(var38, var43, var48);
            float var63 = var11.method32834(var38, var43, var48);
            var12.pos(var10, var20, var21, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var53, var58, var63)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var53, var58, var63)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var53, var58, var63)
               .endVertex();
            var12.pos(var10, var20, var21, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var53, var58, var63)
               .endVertex();
         }

         if (var0.method3870(Direction.UP)) {
            Vector3i var34 = Direction.UP.getDirectionVec();
            float var39 = (float)var34.getX();
            float var44 = (float)var34.getY();
            float var49 = (float)var34.getZ();
            float var54 = var11.method32832(var39, var44, var49);
            float var59 = var11.method32833(var39, var44, var49);
            float var64 = var11.method32834(var39, var44, var49);
            var12.pos(var10, var20, var21 + var2, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var54, var59, var64)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21 + var2, var22 + 1.0F)
               .color(var14, var15, var16, 1.0F)
               .tex(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var54, var59, var64)
               .endVertex();
            var12.pos(var10, var20 + 1.0F, var21 + var2, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var54, var59, var64)
               .endVertex();
            var12.pos(var10, var20, var21 + var2, var22)
               .color(var14, var15, var16, 1.0F)
               .tex(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var54, var59, var64)
               .endVertex();
         }

         GlStateManager.enableLighting();
         return true;
      }
   }
}
