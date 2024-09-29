package mapped;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.FramebufferConstants;

import java.nio.IntBuffer;

public class Framebuffer {
   public int framebufferTextureWidth;
   public int framebufferTextureHeight;
   public int framebufferWidth;
   public int framebufferHeight;
   public final boolean useDepth;
   public int framebufferObject;
   private int framebufferTexture;
   public int depthBuffer;
   public final float[] framebufferColor;
   public int framebufferFilter;

   public Framebuffer(int var1, int var2, boolean var3, boolean var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.useDepth = var3;
      this.framebufferObject = -1;
      this.framebufferTexture = -1;
      this.depthBuffer = -1;
      this.framebufferColor = new float[4];
      this.framebufferColor[0] = 1.0F;
      this.framebufferColor[1] = 1.0F;
      this.framebufferColor[2] = 1.0F;
      this.framebufferColor[3] = 0.0F;
      this.resize(var1, var2, var4);
   }

   public void resize(int var1, int var2, boolean var3) {
      if (RenderSystem.isOnRenderThread()) {
         this.resizeRaw(var1, var2, var3);
      } else {
         RenderSystem.recordRenderCall(() -> this.resizeRaw(var1, var2, var3));
      }
   }

   private void resizeRaw(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GlStateManager.enableDepthTest();
      if (this.framebufferObject >= 0) {
         this.deleteFramebuffer();
      }

      this.createBuffers(var1, var2, var3);
      GlStateManager.bindFramebuffer(FramebufferConstants.GL_FRAMEBUFFER, 0);
   }

   public void deleteFramebuffer() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.unbindFramebufferTexture();
      this.unbindFramebuffer();
      if (this.depthBuffer > -1) {
         TextureUtil.releaseTextureId(this.depthBuffer);
         this.depthBuffer = -1;
      }

      if (this.framebufferTexture > -1) {
         TextureUtil.releaseTextureId(this.framebufferTexture);
         this.framebufferTexture = -1;
      }

      if (this.framebufferObject > -1) {
         GlStateManager.bindFramebuffer(FramebufferConstants.GL_FRAMEBUFFER, 0);
         GlStateManager.deleteFramebuffers(this.framebufferObject);
         this.framebufferObject = -1;
      }
   }

   public void func_237506_a_(Framebuffer var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (!GlStateManager.isFabulous()) {
         GlStateManager.bindFramebuffer(FramebufferConstants.GL_FRAMEBUFFER, this.framebufferObject);
         int var4 = GlStateManager.getFrameBufferAttachmentParam();
         if (var4 != 0) {
            int var5 = GlStateManager.getActiveTextureId();
            GlStateManager.bindTexture(var4);
            GlStateManager.bindFramebuffer(FramebufferConstants.GL_FRAMEBUFFER, var1.framebufferObject);
            GlStateManager.copySubImage(3553, 0, 0, 0, 0, 0, Math.min(this.framebufferTextureWidth, var1.framebufferTextureWidth), Math.min(this.framebufferTextureHeight, var1.framebufferTextureHeight));
            GlStateManager.bindTexture(var5);
         }
      } else {
         GlStateManager.bindFramebuffer(36008, var1.framebufferObject);
         GlStateManager.bindFramebuffer(36009, this.framebufferObject);
         GlStateManager.blitFramebuffer(0, 0, var1.framebufferTextureWidth, var1.framebufferTextureHeight, 0, 0, this.framebufferTextureWidth, this.framebufferTextureHeight, 256, 9728);
      }

      GlStateManager.bindFramebuffer(FramebufferConstants.GL_FRAMEBUFFER, 0);
   }

   public void createBuffers(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.framebufferWidth = var1;
      this.framebufferHeight = var2;
      this.framebufferTextureWidth = var1;
      this.framebufferTextureHeight = var2;
      this.framebufferObject = GlStateManager.method23755();
      this.framebufferTexture = TextureUtil.generateTextureId();
      if (this.useDepth) {
         this.depthBuffer = TextureUtil.generateTextureId();
         GlStateManager.bindTexture(this.depthBuffer);
         GlStateManager.texParameter(3553, 10241, 9728);
         GlStateManager.texParameter(3553, 10240, 9728);
         GlStateManager.texParameter(3553, 10242, 10496);
         GlStateManager.texParameter(3553, 10243, 10496);
         GlStateManager.texParameter(3553, 34892, 0);
         GlStateManager.texImage2D(3553, 0, 6402, this.framebufferTextureWidth, this.framebufferTextureHeight, 0, 6402, 5126, (IntBuffer)null);
      }

      this.setFramebufferFilter(9728);
      GlStateManager.bindTexture(this.framebufferTexture);
      GlStateManager.texImage2D(3553, 0, 32856, this.framebufferTextureWidth, this.framebufferTextureHeight, 0, 6408, 5121, (IntBuffer)null);
      GlStateManager.bindFramebuffer(FramebufferConstants.GL_FRAMEBUFFER, this.framebufferObject);
      GlStateManager.framebufferTexture2D(FramebufferConstants.GL_FRAMEBUFFER, FramebufferConstants.GL_COLOR_ATTACHMENT0, 3553, this.framebufferTexture, 0);
      if (this.useDepth) {
         GlStateManager.framebufferTexture2D(FramebufferConstants.GL_FRAMEBUFFER, FramebufferConstants.GL_DEPTH_ATTACHMENT, 3553, this.depthBuffer, 0);
      }

      this.checkFramebufferComplete();
      this.framebufferClear(var3);
      this.unbindFramebufferTexture();
   }

   public void setFramebufferFilter(int var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.framebufferFilter = var1;
      GlStateManager.bindTexture(this.framebufferTexture);
      GlStateManager.texParameter(3553, 10241, var1);
      GlStateManager.texParameter(3553, 10240, var1);
      GlStateManager.texParameter(3553, 10242, 10496);
      GlStateManager.texParameter(3553, 10243, 10496);
      GlStateManager.bindTexture(0);
   }

   public void checkFramebufferComplete() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      int var3 = GlStateManager.setFramebufferFilter(FramebufferConstants.GL_FRAMEBUFFER);
      if (var3 != FramebufferConstants.GL_FRAMEBUFFER_COMPLETE) {
         if (var3 != FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT) {
            if (var3 != FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT) {
               if (var3 != FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER) {
                  if (var3 != FramebufferConstants.GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER) {
                     throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + var3);
                  } else {
                     throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
                  }
               } else {
                  throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
               }
            } else {
               throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
            }
         } else {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
         }
      }
   }

   public void bindFramebufferTexture() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GlStateManager.bindTexture(this.framebufferTexture);
   }

   public void unbindFramebufferTexture() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GlStateManager.bindTexture(0);
   }

   public void bindFramebuffer(boolean setViewportIn) {
      if (!RenderSystem.isOnRenderThread())
      {
         RenderSystem.recordRenderCall(() ->
         {
            this.bindFramebufferRaw(setViewportIn);
         });
      }
      else
      {
         this.bindFramebufferRaw(setViewportIn);
      }
   }

   private void bindFramebufferRaw(boolean setViewportIn) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      GlStateManager.bindFramebuffer(FramebufferConstants.GL_FRAMEBUFFER, this.framebufferObject);

      if (setViewportIn)
      {
         GlStateManager.viewport(0, 0, this.framebufferWidth, this.framebufferHeight);
      }
   }

   public void unbindFramebuffer() {
      if (RenderSystem.isOnRenderThread()) {
         GlStateManager.bindFramebuffer(FramebufferConstants.GL_FRAMEBUFFER, 0);
      } else {
         RenderSystem.recordRenderCall(() -> GlStateManager.bindFramebuffer(FramebufferConstants.GL_FRAMEBUFFER, 0));
      }
   }

   public void setFramebufferColor(float var1, float var2, float var3, float var4) {
      this.framebufferColor[0] = var1;
      this.framebufferColor[1] = var2;
      this.framebufferColor[2] = var3;
      this.framebufferColor[3] = var4;
   }

   public void framebufferRender(int var1, int var2) {
      this.framebufferRenderExt(var1, var2, true);
   }

   public void framebufferRenderExt(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
      if (RenderSystem.isInInitPhase()) {
         this.framebufferRenderExtRaw(var1, var2, var3);
      } else {
         RenderSystem.recordRenderCall(() -> this.framebufferRenderExtRaw(var1, var2, var3));
      }
   }

   private void framebufferRenderExtRaw(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GlStateManager.colorMask(true, true, true, false);
      GlStateManager.disableDepthTest();
      GlStateManager.depthMask(false);
      GlStateManager.matrixMode(5889);
      GlStateManager.loadIdentity();
      GlStateManager.ortho(0.0, (double)var1, (double)var2, 0.0, 1000.0, 3000.0);
      GlStateManager.matrixMode(5888);
      GlStateManager.loadIdentity();
      GlStateManager.translatef(0.0F, 0.0F, -2000.0F);
      GlStateManager.viewport(0, 0, var1, var2);
      GlStateManager.enableTexture();
      GlStateManager.disableLighting();
      GlStateManager.disableAlphaTest();
      if (var3) {
         GlStateManager.disableBlend();
         GlStateManager.enableColorMaterial();
      }

      GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.bindFramebufferTexture();
      float var6 = (float)var1;
      float var7 = (float)var2;
      float var8 = (float)this.framebufferWidth / (float)this.framebufferTextureWidth;
      float var9 = (float)this.framebufferHeight / (float)this.framebufferTextureHeight;
      Tessellator tessellator = RenderSystem.renderThreadTesselator();
      BufferBuilder bufferbuilder = tessellator.getBuffer();
      bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
      bufferbuilder.pos(0.0, (double)var7, 0.0).tex(0.0F, 0.0F).color(255, 255, 255, 255).endVertex();
      bufferbuilder.pos((double)var6, (double)var7, 0.0).tex(var8, 0.0F).color(255, 255, 255, 255).endVertex();
      bufferbuilder.pos((double)var6, 0.0, 0.0).tex(var8, var9).color(255, 255, 255, 255).endVertex();
      bufferbuilder.pos(0.0, 0.0, 0.0).tex(0.0F, var9).color(255, 255, 255, 255).endVertex();
      tessellator.draw();
      this.unbindFramebufferTexture();
      GlStateManager.depthMask(true);
      GlStateManager.colorMask(true, true, true, true);
   }

   public void framebufferClear(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.bindFramebuffer(true);
      GlStateManager.clearColor(this.framebufferColor[0], this.framebufferColor[1], this.framebufferColor[2], this.framebufferColor[3]);
      short var4 = 16384;
      if (this.useDepth) {
         GlStateManager.clearDepth(1.0);
         var4 |= 256;
      }

      GlStateManager.clear(var4, var1);
      this.unbindFramebuffer();
   }

   public int getFramebufferTexture() {
      return this.framebufferTexture;
   }

   public int getDepthBuffer() {
      return this.depthBuffer;
   }
}
