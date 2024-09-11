package mapped;

import java.nio.IntBuffer;

public class Framebuffer {
   public int field35730;
   public int field35731;
   public int field35732;
   public int field35733;
   public final boolean field35734;
   public int field35735;
   private int field35736;
   public int field35737;
   public final float[] field35738;
   public int field35739;

   public Framebuffer(int var1, int var2, boolean var3, boolean var4) {
      RenderSystem.assertThread(RenderSystem::method27804);
      this.field35734 = var3;
      this.field35735 = -1;
      this.field35736 = -1;
      this.field35737 = -1;
      this.field35738 = new float[4];
      this.field35738[0] = 1.0F;
      this.field35738[1] = 1.0F;
      this.field35738[2] = 1.0F;
      this.field35738[3] = 0.0F;
      this.resize(var1, var2, var4);
   }

   public void resize(int var1, int var2, boolean var3) {
      if (RenderSystem.isOnRenderThread()) {
         this.method29104(var1, var2, var3);
      } else {
         RenderSystem.method27810(() -> this.method29104(var1, var2, var3));
      }
   }

   private void method29104(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::method27804);
      GlStateManager.method23711();
      if (this.field35735 >= 0) {
         this.method29105();
      }

      this.method29107(var1, var2, var3);
      GlStateManager.method23751(Class8821.field39775, 0);
   }

   public void method29105() {
      RenderSystem.assertThread(RenderSystem::method27804);
      this.method29111();
      this.unbindFramebuffer();
      if (this.field35737 > -1) {
         Class8535.method30367(this.field35737);
         this.field35737 = -1;
      }

      if (this.field35736 > -1) {
         Class8535.method30367(this.field35736);
         this.field35736 = -1;
      }

      if (this.field35735 > -1) {
         GlStateManager.method23751(Class8821.field39775, 0);
         GlStateManager.method23754(this.field35735);
         this.field35735 = -1;
      }
   }

   public void method29106(Framebuffer var1) {
      RenderSystem.assertThread(RenderSystem::method27804);
      if (!GlStateManager.method23862()) {
         GlStateManager.method23751(Class8821.field39775, this.field35735);
         int var4 = GlStateManager.method23752();
         if (var4 != 0) {
            int var5 = GlStateManager.method23758();
            GlStateManager.method23814(var4);
            GlStateManager.method23751(Class8821.field39775, var1.field35735);
            GlStateManager.method23750(3553, 0, 0, 0, 0, 0, Math.min(this.field35730, var1.field35730), Math.min(this.field35731, var1.field35731));
            GlStateManager.method23814(var5);
         }
      } else {
         GlStateManager.method23751(36008, var1.field35735);
         GlStateManager.method23751(36009, this.field35735);
         GlStateManager.method23753(0, 0, var1.field35730, var1.field35731, 0, 0, this.field35730, this.field35731, 256, 9728);
      }

      GlStateManager.method23751(Class8821.field39775, 0);
   }

   public void method29107(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::method27804);
      this.field35732 = var1;
      this.field35733 = var2;
      this.field35730 = var1;
      this.field35731 = var2;
      this.field35735 = GlStateManager.method23755();
      this.field35736 = Class8535.method30366();
      if (this.field35734) {
         this.field35737 = Class8535.method30366();
         GlStateManager.method23814(this.field35737);
         GlStateManager.method23808(3553, 10241, 9728);
         GlStateManager.method23808(3553, 10240, 9728);
         GlStateManager.method23808(3553, 10242, 10496);
         GlStateManager.method23808(3553, 10243, 10496);
         GlStateManager.method23808(3553, 34892, 0);
         GlStateManager.method23815(3553, 0, 6402, this.field35730, this.field35731, 0, 6402, 5126, (IntBuffer)null);
      }

      this.method29108(9728);
      GlStateManager.method23814(this.field35736);
      GlStateManager.method23815(3553, 0, 32856, this.field35730, this.field35731, 0, 6408, 5121, (IntBuffer)null);
      GlStateManager.method23751(Class8821.field39775, this.field35735);
      GlStateManager.method23757(Class8821.field39775, Class8821.field39777, 3553, this.field35736, 0);
      if (this.field35734) {
         GlStateManager.method23757(Class8821.field39775, Class8821.field39778, 3553, this.field35737, 0);
      }

      this.method29109();
      this.method29119(var3);
      this.method29111();
   }

   public void method29108(int var1) {
      RenderSystem.assertThread(RenderSystem::method27804);
      this.field35739 = var1;
      GlStateManager.method23814(this.field35736);
      GlStateManager.method23808(3553, 10241, var1);
      GlStateManager.method23808(3553, 10240, var1);
      GlStateManager.method23808(3553, 10242, 10496);
      GlStateManager.method23808(3553, 10243, 10496);
      GlStateManager.method23814(0);
   }

   public void method29109() {
      RenderSystem.assertThread(RenderSystem::method27804);
      int var3 = GlStateManager.method23756(Class8821.field39775);
      if (var3 != Class8821.field39779) {
         if (var3 != Class8821.field39780) {
            if (var3 != Class8821.field39781) {
               if (var3 != Class8821.field39782) {
                  if (var3 != Class8821.field39783) {
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

   public void method29110() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GlStateManager.method23814(this.field35736);
   }

   public void method29111() {
      RenderSystem.assertThread(RenderSystem::method27804);
      GlStateManager.method23814(0);
   }

   public void bindFramebuffer(boolean var1) {
      if (RenderSystem.isOnRenderThread()) {
         this.method29113(var1);
      } else {
         RenderSystem.method27810(() -> this.method29113(var1));
      }
   }

   private void method29113(boolean var1) {
      RenderSystem.assertThread(RenderSystem::method27804);
      GlStateManager.method23751(Class8821.field39775, this.field35735);
      if (var1) {
         GlStateManager.method23821(0, 0, this.field35732, this.field35733);
      }
   }

   public void unbindFramebuffer() {
      if (RenderSystem.isOnRenderThread()) {
         GlStateManager.method23751(Class8821.field39775, 0);
      } else {
         RenderSystem.method27810(() -> GlStateManager.method23751(Class8821.field39775, 0));
      }
   }

   public void setFramebufferColor(float var1, float var2, float var3, float var4) {
      this.field35738[0] = var1;
      this.field35738[1] = var2;
      this.field35738[2] = var3;
      this.field35738[3] = var4;
   }

   public void framebufferRender(int var1, int var2) {
      this.method29117(var1, var2, true);
   }

   public void method29117(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::method27807);
      if (RenderSystem.isInInitPhase()) {
         this.method29118(var1, var2, var3);
      } else {
         RenderSystem.method27810(() -> this.method29118(var1, var2, var3));
      }
   }

   private void method29118(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GlStateManager.method23822(true, true, true, false);
      GlStateManager.method23710();
      GlStateManager.method23713(false);
      GlStateManager.method23830(5889);
      GlStateManager.method23831();
      GlStateManager.method23835(0.0, (double)var1, (double)var2, 0.0, 1000.0, 3000.0);
      GlStateManager.method23830(5888);
      GlStateManager.method23831();
      GlStateManager.method23839(0.0F, 0.0F, -2000.0F);
      GlStateManager.method23821(0, 0, var1, var2);
      GlStateManager.method23804();
      GlStateManager.method23699();
      GlStateManager.disableAlphaTest();
      if (var3) {
         GlStateManager.method23714();
         GlStateManager.method23701();
      }

      GlStateManager.method23843(1.0F, 1.0F, 1.0F, 1.0F);
      this.method29110();
      float var6 = (float)var1;
      float var7 = (float)var2;
      float var8 = (float)this.field35732 / (float)this.field35730;
      float var9 = (float)this.field35733 / (float)this.field35731;
      Tessellator var10 = RenderSystem.method27937();
      BufferBuilder var11 = var10.getBuffer();
      var11.begin(7, DefaultVertexFormats.field43346);
      var11.pos(0.0, (double)var7, 0.0).tex(0.0F, 0.0F).color(255, 255, 255, 255).endVertex();
      var11.pos((double)var6, (double)var7, 0.0).tex(var8, 0.0F).color(255, 255, 255, 255).endVertex();
      var11.pos((double)var6, 0.0, 0.0).tex(var8, var9).color(255, 255, 255, 255).endVertex();
      var11.pos(0.0, 0.0, 0.0).tex(0.0F, var9).color(255, 255, 255, 255).endVertex();
      var10.draw();
      this.method29111();
      GlStateManager.method23713(true);
      GlStateManager.method23822(true, true, true, true);
   }

   public void method29119(boolean var1) {
      RenderSystem.assertThread(RenderSystem::method27804);
      this.bindFramebuffer(true);
      GlStateManager.method23827(this.field35738[0], this.field35738[1], this.field35738[2], this.field35738[3]);
      short var4 = 16384;
      if (this.field35734) {
         GlStateManager.method23826(1.0);
         var4 |= 256;
      }

      GlStateManager.method23829(var4, var1);
      this.unbindFramebuffer();
   }

   public int method29120() {
      return this.field35736;
   }

   public int method29121() {
      return this.field35737;
   }
}
