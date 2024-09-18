package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public abstract class Class1273<E extends Class1154<E>> extends FocusableGui implements Class1190 {
   public final Minecraft field6782;
   public final int field6783;
   private final List<E> field6784 = new Class26(this);
   public int field6785;
   public int field6786;
   public int field6787;
   public int field6788;
   public int field6789;
   public int field6790;
   public boolean field6791 = true;
   private double field6792;
   private boolean field6793 = true;
   private boolean field6794;
   public int field6795;
   private boolean field6796;
   private E field6797;
   private boolean field6798 = true;
   private boolean field6799 = true;

   public Class1273(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      this.field6782 = var1;
      this.field6785 = var2;
      this.field6786 = var3;
      this.field6787 = var4;
      this.field6788 = var5;
      this.field6783 = var6;
      this.field6790 = 0;
      this.field6789 = var2;
   }

   public void method6020(boolean var1) {
      this.field6793 = var1;
   }

   public void method6021(boolean var1, int var2) {
      this.field6794 = var1;
      this.field6795 = var2;
      if (!var1) {
         this.field6795 = 0;
      }
   }

   public int method6022() {
      return 220;
   }

   @Nullable
   public E method6023() {
      return this.field6797;
   }

   public void method6024(E var1) {
      this.field6797 = (E)var1;
   }

   public void method6025(boolean var1) {
      this.field6798 = var1;
   }

   public void method6026(boolean var1) {
      this.field6799 = var1;
   }

   @Nullable
   public E getListener() {
      return (E)super.getListener();
   }

   @Override
   public final List<E> getEventListeners() {
      return this.field6784;
   }

   public final void method6027() {
      this.field6784.clear();
   }

   public void method6028(Collection<E> var1) {
      this.field6784.clear();
      this.field6784.addAll(var1);
   }

   public E method6029(int var1) {
      return this.getEventListeners().get(var1);
   }

   public int method6030(E var1) {
      this.field6784.add((E)var1);
      return this.field6784.size() - 1;
   }

   public int method6031() {
      return this.getEventListeners().size();
   }

   public boolean method6032(int var1) {
      return Objects.equals(this.method6023(), this.getEventListeners().get(var1));
   }

   @Nullable
   public final E method6033(double var1, double var3) {
      int var7 = this.method6022() / 2;
      int var8 = this.field6790 + this.field6785 / 2;
      int var9 = var8 - var7;
      int var10 = var8 + var7;
      int var11 = MathHelper.floor(var3 - (double)this.field6787) - this.field6795 + (int)this.method6044() - 4;
      int var12 = var11 / this.field6783;
      return var1 < (double)this.method6048() && var1 >= (double)var9 && var1 <= (double)var10 && var12 >= 0 && var11 >= 0 && var12 < this.method6031()
         ? this.getEventListeners().get(var12)
         : null;
   }

   public void method6034(int var1, int var2, int var3, int var4) {
      this.field6785 = var1;
      this.field6786 = var2;
      this.field6787 = var3;
      this.field6788 = var4;
      this.field6790 = 0;
      this.field6789 = var1;
   }

   public void method6035(int var1) {
      this.field6790 = var1;
      this.field6789 = var1 + this.field6785;
   }

   public int method6036() {
      return this.method6031() * this.field6783 + this.field6795;
   }

   public void method6037(int var1, int var2) {
   }

   public void method6038(MatrixStack var1, int var2, int var3, Tessellator var4) {
   }

   public void method6039(MatrixStack var1) {
   }

   public void method6040(MatrixStack var1, int var2, int var3) {
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method6039(var1);
      int var7 = this.method6048();
      int var8 = var7 + 6;
      Tessellator var9 = Tessellator.getInstance();
      BufferBuilder var10 = var9.getBuffer();
      if (this.field6798) {
         this.field6782.getTextureManager().bindTexture(AbstractGui.field6451);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         float var11 = 32.0F;
         var10.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
         var10.pos((double)this.field6790, (double)this.field6788, 0.0)
            .tex((float)this.field6790 / 32.0F, (float)(this.field6788 + (int)this.method6044()) / 32.0F)
            .color(32, 32, 32, 255)
            .endVertex();
         var10.pos((double)this.field6789, (double)this.field6788, 0.0)
            .tex((float)this.field6789 / 32.0F, (float)(this.field6788 + (int)this.method6044()) / 32.0F)
            .color(32, 32, 32, 255)
            .endVertex();
         var10.pos((double)this.field6789, (double)this.field6787, 0.0)
            .tex((float)this.field6789 / 32.0F, (float)(this.field6787 + (int)this.method6044()) / 32.0F)
            .color(32, 32, 32, 255)
            .endVertex();
         var10.pos((double)this.field6790, (double)this.field6787, 0.0)
            .tex((float)this.field6790 / 32.0F, (float)(this.field6787 + (int)this.method6044()) / 32.0F)
            .color(32, 32, 32, 255)
            .endVertex();
         var9.draw();
      }

      int var16 = this.method6053();
      int var12 = this.field6787 + 4 - (int)this.method6044();
      if (this.field6794) {
         this.method6038(var1, var16, var12, var9);
      }

      this.method6052(var1, var16, var12, var2, var3, var4);
      if (this.field6799) {
         this.field6782.getTextureManager().bindTexture(AbstractGui.field6451);
         RenderSystem.enableDepthTest();
         RenderSystem.depthFunc(519);
         float var13 = 32.0F;
         byte var14 = -100;
         var10.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
         var10.pos((double)this.field6790, (double)this.field6787, -100.0)
            .tex(0.0F, (float)this.field6787 / 32.0F)
            .color(64, 64, 64, 255)
            .endVertex();
         var10.pos((double)(this.field6790 + this.field6785), (double)this.field6787, -100.0)
            .tex((float)this.field6785 / 32.0F, (float)this.field6787 / 32.0F)
            .color(64, 64, 64, 255)
            .endVertex();
         var10.pos((double)(this.field6790 + this.field6785), 0.0, -100.0)
            .tex((float)this.field6785 / 32.0F, 0.0F)
            .color(64, 64, 64, 255)
            .endVertex();
         var10.pos((double)this.field6790, 0.0, -100.0).tex(0.0F, 0.0F).color(64, 64, 64, 255).endVertex();
         var10.pos((double)this.field6790, (double)this.field6786, -100.0)
            .tex(0.0F, (float)this.field6786 / 32.0F)
            .color(64, 64, 64, 255)
            .endVertex();
         var10.pos((double)(this.field6790 + this.field6785), (double)this.field6786, -100.0)
            .tex((float)this.field6785 / 32.0F, (float)this.field6786 / 32.0F)
            .color(64, 64, 64, 255)
            .endVertex();
         var10.pos((double)(this.field6790 + this.field6785), (double)this.field6788, -100.0)
            .tex((float)this.field6785 / 32.0F, (float)this.field6788 / 32.0F)
            .color(64, 64, 64, 255)
            .endVertex();
         var10.pos((double)this.field6790, (double)this.field6788, -100.0)
            .tex(0.0F, (float)this.field6788 / 32.0F)
            .color(64, 64, 64, 255)
            .endVertex();
         var9.draw();
         RenderSystem.depthFunc(515);
         RenderSystem.disableDepthTest();
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.field15997, DestFactor.field12932, GlStateManager.SourceFactor.field16000, DestFactor.field12927);
         RenderSystem.method27817();
         RenderSystem.method27866(7425);
         RenderSystem.disableTexture();
         byte var15 = 4;
         var10.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
         var10.pos((double)this.field6790, (double)(this.field6787 + 4), 0.0).tex(0.0F, 1.0F).color(0, 0, 0, 0).endVertex();
         var10.pos((double)this.field6789, (double)(this.field6787 + 4), 0.0).tex(1.0F, 1.0F).color(0, 0, 0, 0).endVertex();
         var10.pos((double)this.field6789, (double)this.field6787, 0.0).tex(1.0F, 0.0F).color(0, 0, 0, 255).endVertex();
         var10.pos((double)this.field6790, (double)this.field6787, 0.0).tex(0.0F, 0.0F).color(0, 0, 0, 255).endVertex();
         var10.pos((double)this.field6790, (double)this.field6788, 0.0).tex(0.0F, 1.0F).color(0, 0, 0, 255).endVertex();
         var10.pos((double)this.field6789, (double)this.field6788, 0.0).tex(1.0F, 1.0F).color(0, 0, 0, 255).endVertex();
         var10.pos((double)this.field6789, (double)(this.field6788 - 4), 0.0).tex(1.0F, 0.0F).color(0, 0, 0, 0).endVertex();
         var10.pos((double)this.field6790, (double)(this.field6788 - 4), 0.0).tex(0.0F, 0.0F).color(0, 0, 0, 0).endVertex();
         var9.draw();
      }

      int var17 = this.method6046();
      if (var17 > 0) {
         RenderSystem.disableTexture();
         int var18 = (int)((float)((this.field6788 - this.field6787) * (this.field6788 - this.field6787)) / (float)this.method6036());
         var18 = MathHelper.method37775(var18, 32, this.field6788 - this.field6787 - 8);
         int var20 = (int)this.method6044() * (this.field6788 - this.field6787 - var18) / var17 + this.field6787;
         if (var20 < this.field6787) {
            var20 = this.field6787;
         }

         var10.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
         var10.pos((double)var7, (double)this.field6788, 0.0).tex(0.0F, 1.0F).color(0, 0, 0, 255).endVertex();
         var10.pos((double)var8, (double)this.field6788, 0.0).tex(1.0F, 1.0F).color(0, 0, 0, 255).endVertex();
         var10.pos((double)var8, (double)this.field6787, 0.0).tex(1.0F, 0.0F).color(0, 0, 0, 255).endVertex();
         var10.pos((double)var7, (double)this.field6787, 0.0).tex(0.0F, 0.0F).color(0, 0, 0, 255).endVertex();
         var10.pos((double)var7, (double)(var20 + var18), 0.0).tex(0.0F, 1.0F).color(128, 128, 128, 255).endVertex();
         var10.pos((double)var8, (double)(var20 + var18), 0.0).tex(1.0F, 1.0F).color(128, 128, 128, 255).endVertex();
         var10.pos((double)var8, (double)var20, 0.0).tex(1.0F, 0.0F).color(128, 128, 128, 255).endVertex();
         var10.pos((double)var7, (double)var20, 0.0).tex(0.0F, 0.0F).color(128, 128, 128, 255).endVertex();
         var10.pos((double)var7, (double)(var20 + var18 - 1), 0.0).tex(0.0F, 1.0F).color(192, 192, 192, 255).endVertex();
         var10.pos((double)(var8 - 1), (double)(var20 + var18 - 1), 0.0).tex(1.0F, 1.0F).color(192, 192, 192, 255).endVertex();
         var10.pos((double)(var8 - 1), (double)var20, 0.0).tex(1.0F, 0.0F).color(192, 192, 192, 255).endVertex();
         var10.pos((double)var7, (double)var20, 0.0).tex(0.0F, 0.0F).color(192, 192, 192, 255).endVertex();
         var9.draw();
      }

      this.method6040(var1, var2, var3);
      RenderSystem.enableTexture();
      RenderSystem.method27866(7424);
      RenderSystem.disableAlphaTest();
      RenderSystem.disableBlend();
   }

   public void method6041(E var1) {
      this.method6045((double)(this.getEventListeners().indexOf(var1) * this.field6783 + this.field6783 / 2 - (this.field6788 - this.field6787) / 2));
   }

   public void method6042(E var1) {
      int var4 = this.method6055(this.getEventListeners().indexOf(var1));
      int var5 = var4 - this.field6787 - 4 - this.field6783;
      if (var5 < 0) {
         this.method6043(var5);
      }

      int var6 = this.field6788 - var4 - this.field6783 - this.field6783;
      if (var6 < 0) {
         this.method6043(-var6);
      }
   }

   private void method6043(int var1) {
      this.method6045(this.method6044() + (double)var1);
   }

   public double method6044() {
      return this.field6792;
   }

   public void method6045(double var1) {
      this.field6792 = MathHelper.clamp(var1, 0.0, (double)this.method6046());
   }

   public int method6046() {
      return Math.max(0, this.method6036() - (this.field6788 - this.field6787 - 4));
   }

   public void method6047(double var1, double var3, int var5) {
      this.field6796 = var5 == 0 && var1 >= (double)this.method6048() && var1 < (double)(this.method6048() + 6);
   }

   public int method6048() {
      return this.field6785 / 2 + 124;
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      this.method6047(var1, var3, var5);
      if (this.isMouseOver(var1, var3)) {
         Class1154 var8 = this.method6033(var1, var3);
         if (var8 == null) {
            if (var5 == 0) {
               this.method6037(
                  (int)(var1 - (double)(this.field6790 + this.field6785 / 2 - this.method6022() / 2)),
                  (int)(var3 - (double)this.field6787) + (int)this.method6044() - 4
               );
               return true;
            }
         } else if (var8.mouseClicked(var1, var3, var5)) {
            this.setListener(var8);
            this.setDragging(true);
            return true;
         }

         return this.field6796;
      } else {
         return false;
      }
   }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
      if (this.getListener() != null) {
         this.getListener().mouseReleased(var1, var3, var5);
      }

      return false;
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      if (!super.mouseDragged(var1, var3, var5, var6, var8)) {
         if (var5 == 0 && this.field6796) {
            if (!(var3 < (double)this.field6787)) {
               if (!(var3 > (double)this.field6788)) {
                  double var12 = (double)Math.max(1, this.method6046());
                  int var14 = this.field6788 - this.field6787;
                  int var15 = MathHelper.method37775((int)((float)(var14 * var14) / (float)this.method6036()), 32, var14 - 8);
                  double var16 = Math.max(1.0, var12 / (double)(var14 - var15));
                  this.method6045(this.method6044() + var8 * var16);
               } else {
                  this.method6045((double)this.method6046());
               }
            } else {
               this.method6045(0.0);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      this.method6045(this.method6044() - var5 * (double)this.field6783 / 2.0);
      return true;
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!super.keyPressed(var1, var2, var3)) {
         if (var1 != 264) {
            if (var1 != 265) {
               return false;
            } else {
               this.method6049(Class2220.field14503);
               return true;
            }
         } else {
            this.method6049(Class2220.field14504);
            return true;
         }
      } else {
         return true;
      }
   }

   public void method6049(Class2220 var1) {
      this.method6051(var1, var0 -> true);
   }

   public void method6050() {
      Class1154 var3 = this.method6023();
      if (var3 != null) {
         this.method6024((E)var3);
         this.method6042((E)var3);
      }
   }

   public void method6051(Class2220 var1, Predicate<E> var2) {
      int var5 = var1 != Class2220.field14503 ? 1 : -1;
      if (!this.getEventListeners().isEmpty()) {
         int var6 = this.getEventListeners().indexOf(this.method6023());

         while (true) {
            int var7 = MathHelper.method37775(var6 + var5, 0, this.method6031() - 1);
            if (var6 == var7) {
               break;
            }

            E var8 = this.getEventListeners().get(var7);
            if (var2.test(var8)) {
               this.method6024(var8);
               this.method6042(var8);
               break;
            }

            var6 = var7;
         }
      }
   }

   @Override
   public boolean isMouseOver(double var1, double var3) {
      return var3 >= (double)this.field6787 && var3 <= (double)this.field6788 && var1 >= (double)this.field6790 && var1 <= (double)this.field6789;
   }

   public void method6052(MatrixStack var1, int var2, int var3, int var4, int var5, float var6) {
      int var9 = this.method6031();
      Tessellator var10 = Tessellator.getInstance();
      BufferBuilder var11 = var10.getBuffer();

      for (int var12 = 0; var12 < var9; var12++) {
         int var13 = this.method6055(var12);
         int var14 = this.method6056(var12);
         if (var14 >= this.field6787 && var13 <= this.field6788) {
            int var15 = var3 + var12 * this.field6783 + this.field6795;
            int var16 = this.field6783 - 4;
            Class1154 var17 = this.method6029(var12);
            int var18 = this.method6022();
            if (this.field6793 && this.method6032(var12)) {
               int var19 = this.field6790 + this.field6785 / 2 - var18 / 2;
               int var20 = this.field6790 + this.field6785 / 2 + var18 / 2;
               RenderSystem.disableTexture();
               float var21 = !this.method6057() ? 0.5F : 1.0F;
               RenderSystem.color4f(var21, var21, var21, 1.0F);
               var11.begin(7, DefaultVertexFormats.field43341);
               var11.pos((double)var19, (double)(var15 + var16 + 2), 0.0).endVertex();
               var11.pos((double)var20, (double)(var15 + var16 + 2), 0.0).endVertex();
               var11.pos((double)var20, (double)(var15 - 2), 0.0).endVertex();
               var11.pos((double)var19, (double)(var15 - 2), 0.0).endVertex();
               var10.draw();
               RenderSystem.color4f(0.0F, 0.0F, 0.0F, 1.0F);
               var11.begin(7, DefaultVertexFormats.field43341);
               var11.pos((double)(var19 + 1), (double)(var15 + var16 + 1), 0.0).endVertex();
               var11.pos((double)(var20 - 1), (double)(var15 + var16 + 1), 0.0).endVertex();
               var11.pos((double)(var20 - 1), (double)(var15 - 1), 0.0).endVertex();
               var11.pos((double)(var19 + 1), (double)(var15 - 1), 0.0).endVertex();
               var10.draw();
               RenderSystem.enableTexture();
            }

            int var22 = this.method6053();
            var17.method5544(
               var1,
               var12,
               var13,
               var22,
               var18,
               var16,
               var4,
               var5,
               this.isMouseOver((double)var4, (double)var5) && Objects.equals(this.method6033((double)var4, (double)var5), var17),
               var6
            );
         }
      }
   }

   public int method6053() {
      return this.field6790 + this.field6785 / 2 - this.method6022() / 2 + 2;
   }

   public int method6054() {
      return this.method6053() + this.method6022();
   }

   public int method6055(int var1) {
      return this.field6787 + 4 - (int)this.method6044() + var1 * this.field6783 + this.field6795;
   }

   private int method6056(int var1) {
      return this.method6055(var1) + this.field6783;
   }

   public boolean method6057() {
      return false;
   }

   public E method6058(int var1) {
      Class1154 var4 = this.field6784.get(var1);
      return (E)(!this.method6059(this.field6784.get(var1)) ? null : var4);
   }

   public boolean method6059(E var1) {
      boolean var4 = this.field6784.remove(var1);
      if (var4 && var1 == this.method6023()) {
         this.method6024(null);
      }

      return var4;
   }

   private void method6060(Class1154<E> var1) {
      Class1154.method5545(var1, this);
   }

   // $VF: synthetic method
   public static void method6062(Class1273 var0, Class1154 var1) {
      var0.method6060(var1);
   }
}
