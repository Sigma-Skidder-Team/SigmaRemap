package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

public class Class1195 extends AbstractGui implements Class1196 {
   private static final ResourceLocation field6469 = new ResourceLocation("textures/gui/widgets.png");
   public static final ResourceLocation field6470 = new ResourceLocation("textures/gui/spectator_widgets.png");
   private final Minecraft field6471;
   private long field6472;
   private Class8036 field6473;

   public Class1195(Minecraft var1) {
      this.field6471 = var1;
   }

   public void onHotbarSelected(int var1) {
      this.field6472 = Util.milliTime();
      if (this.field6473 == null) {
         this.field6473 = new Class8036(this);
      } else {
         this.field6473.method27571(var1);
      }
   }

   private float method5719() {
      long var3 = this.field6472 - Util.milliTime() + 5000L;
      return MathHelper.clamp((float)var3 / 2000.0F, 0.0F, 1.0F);
   }

   public void method5720(MatrixStack var1, float var2) {
      if (this.field6473 != null) {
         float var5 = this.method5719();
         if (!(var5 <= 0.0F)) {
            int var6 = this.field6471.getMainWindow().getScaledWidth() / 2;
            int var7 = this.method5702();
            this.method5703(-90);
            int var8 = MathHelper.method37767((float)this.field6471.getMainWindow().getScaledHeight() - 22.0F * var5);
            Class8548 var9 = this.field6473.method27575();
            this.method5721(var1, var5, var6, var8, var9);
            this.method5703(var7);
         } else {
            this.field6473.method27572();
         }
      }
   }

   public void method5721(MatrixStack var1, float var2, int var3, int var4, Class8548 var5) {
      RenderSystem.enableRescaleNormal();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var2);
      this.field6471.getTextureManager().bindTexture(field6469);
      this.blit(var1, var3 - 91, var4, 0, 0, 182, 22);
      if (var5.method30462() >= 0) {
         this.blit(var1, var3 - 91 - 1 + var5.method30462() * 20, var4 - 1, 0, 22, 24, 22);
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method5722(var1, var8, this.field6471.getMainWindow().getScaledWidth() / 2 - 90 + var8 * 20 + 2, (float)(var4 + 3), var2, var5.method30461(var8));
      }

      RenderSystem.method27868();
      RenderSystem.disableBlend();
   }

   private void method5722(MatrixStack var1, int var2, int var3, float var4, float var5, Class7222 var6) {
      this.field6471.getTextureManager().bindTexture(field6470);
      if (var6 != Class8036.field34536) {
         int var9 = (int)(var5 * 255.0F);
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)var3, var4, 0.0F);
         float var10 = !var6.method22700() ? 0.25F : 1.0F;
         RenderSystem.color4f(var10, var10, var10, var5);
         var6.method22699(var1, var10, var9);
         RenderSystem.popMatrix();
         if (var9 > 3 && var6.method22700()) {
            ITextComponent var11 = this.field6471.gameSettings.keyBindsHotbar[var2].func_238171_j_();
            this.field6471
               .fontRenderer
               .method38803(var1, var11, (float)(var3 + 19 - 2 - this.field6471.fontRenderer.method38821(var11)), var4 + 6.0F + 3.0F, 16777215 + (var9 << 24));
         }
      }
   }

   public void method5723(MatrixStack var1) {
      int var4 = (int)(this.method5719() * 255.0F);
      if (var4 > 3 && this.field6473 != null) {
         Class7222 var5 = this.field6473.method27569();
         ITextComponent var6 = var5 != Class8036.field34536 ? var5.method22698() : this.field6473.method27570().method22702();
         if (var6 != null) {
            int var7 = (this.field6471.getMainWindow().getScaledWidth() - this.field6471.fontRenderer.method38821(var6)) / 2;
            int var8 = this.field6471.getMainWindow().getScaledHeight() - 35;
            RenderSystem.pushMatrix();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            this.field6471.fontRenderer.method38803(var1, var6, (float)var7, (float)var8, 16777215 + (var4 << 24));
            RenderSystem.disableBlend();
            RenderSystem.popMatrix();
         }
      }
   }

   @Override
   public void method5724(Class8036 var1) {
      this.field6473 = null;
      this.field6472 = 0L;
   }

   public boolean method5725() {
      return this.field6473 != null;
   }

   public void method5726(double var1) {
      int var5 = this.field6473.method27573() + (int)var1;

      while (var5 >= 0 && var5 <= 8 && (this.field6473.method27567(var5) == Class8036.field34536 || !this.field6473.method27567(var5).method22700())) {
         var5 = (int)((double)var5 + var1);
      }

      if (var5 >= 0 && var5 <= 8) {
         this.field6473.method27571(var5);
         this.field6472 = Util.milliTime();
      }
   }

   public void method5727() {
      this.field6472 = Util.milliTime();
      if (!this.method5725()) {
         this.field6473 = new Class8036(this);
      } else {
         int var3 = this.field6473.method27573();
         if (var3 != -1) {
            this.field6473.method27571(var3);
         }
      }
   }
}
