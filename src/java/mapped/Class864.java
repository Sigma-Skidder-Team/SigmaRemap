package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class864 extends ContainerScreen<Class5811> {
   private static final ResourceLocation field4796 = new ResourceLocation("textures/gui/container/stonecutter.png");
   private float field4797;
   private boolean field4798;
   private int field4799;
   private boolean field4800;

   public Class864(Class5811 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
      var1.method18110(this::method2676);
      this.field4724--;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      super.render(var1, var2, var3, var4);
      this.renderHoveredTooltip(var1, var2, var3);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      this.renderBackground(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field4796);
      int var7 = this.field4734;
      int var8 = this.field4735;
      this.blit(var1, var7, var8, 0, 0, this.xSize, this.ySize);
      int var9 = (int)(41.0F * this.field4797);
      this.blit(var1, var7 + 119, var8 + 15 + var9, 176 + (!this.method2674() ? 12 : 0), 0, 12, 15);
      int var10 = this.field4734 + 52;
      int var11 = this.field4735 + 14;
      int var12 = this.field4799 + 12;
      this.method2672(var1, var3, var4, var10, var11, var12);
      this.method2673(var10, var11, var12);
   }

   @Override
   public void renderHoveredTooltip(MatrixStack var1, int var2, int var3) {
      super.renderHoveredTooltip(var1, var2, var3);
      if (this.field4800) {
         int var6 = this.field4734 + 52;
         int var7 = this.field4735 + 14;
         int var8 = this.field4799 + 12;
         List var9 = this.field4727.method18100();

         for (int var10 = this.field4799; var10 < var8 && var10 < this.field4727.method18101(); var10++) {
            int var11 = var10 - this.field4799;
            int var12 = var6 + var11 % 4 * 16;
            int var13 = var7 + var11 / 4 * 18 + 2;
            if (var2 >= var12 && var2 < var12 + 16 && var3 >= var13 && var3 < var13 + 18) {
               this.method2457(var1, ((Class4845)var9.get(var10)).getRecipeOutput(), var2, var3);
            }
         }
      }
   }

   private void method2672(MatrixStack var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var9 = this.field4799; var9 < var6 && var9 < this.field4727.method18101(); var9++) {
         int var10 = var9 - this.field4799;
         int var11 = var4 + var10 % 4 * 16;
         int var12 = var10 / 4;
         int var13 = var5 + var12 * 18 + 2;
         int var14 = this.ySize;
         if (var9 != this.field4727.method18099()) {
            if (var2 >= var11 && var3 >= var13 && var2 < var11 + 16 && var3 < var13 + 18) {
               var14 += 36;
            }
         } else {
            var14 += 18;
         }

         this.blit(var1, var11, var13 - 1, 0, var14, 16, 18);
      }
   }

   private void method2673(int var1, int var2, int var3) {
      List var6 = this.field4727.method18100();

      for (int var7 = this.field4799; var7 < var3 && var7 < this.field4727.method18101(); var7++) {
         int var8 = var7 - this.field4799;
         int var9 = var1 + var8 % 4 * 16;
         int var10 = var8 / 4;
         int var11 = var2 + var10 * 18 + 2;
         this.mc.getItemRenderer().method793(((Class4845)var6.get(var7)).getRecipeOutput(), var9, var11);
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      this.field4798 = false;
      if (this.field4800) {
         int var8 = this.field4734 + 52;
         int var9 = this.field4735 + 14;
         int var10 = this.field4799 + 12;

         for (int var11 = this.field4799; var11 < var10; var11++) {
            int var12 = var11 - this.field4799;
            double var13 = var1 - (double)(var8 + var12 % 4 * 16);
            double var15 = var3 - (double)(var9 + var12 / 4 * 18);
            if (var13 >= 0.0 && var15 >= 0.0 && var13 < 16.0 && var15 < 18.0 && this.field4727.enchantItem(this.mc.player, var11)) {
               Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(SoundEvents.field27181, 1.0F));
               this.mc.playerController.sendEnchantPacket(this.field4727.field25471, var11);
               return true;
            }
         }

         var8 = this.field4734 + 119;
         var9 = this.field4735 + 9;
         if (var1 >= (double)var8 && var1 < (double)(var8 + 12) && var3 >= (double)var9 && var3 < (double)(var9 + 54)) {
            this.field4798 = true;
         }
      }

      return super.mouseClicked(var1, var3, var5);
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      if (this.field4798 && this.method2674()) {
         int var12 = this.field4735 + 14;
         int var13 = var12 + 54;
         this.field4797 = ((float)var3 - (float)var12 - 7.5F) / ((float)(var13 - var12) - 15.0F);
         this.field4797 = MathHelper.clamp(this.field4797, 0.0F, 1.0F);
         this.field4799 = (int)((double)(this.field4797 * (float)this.method2675()) + 0.5) * 4;
         return true;
      } else {
         return super.mouseDragged(var1, var3, var5, var6, var8);
      }
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      if (this.method2674()) {
         int var9 = this.method2675();
         this.field4797 = (float)((double)this.field4797 - var5 / (double)var9);
         this.field4797 = MathHelper.clamp(this.field4797, 0.0F, 1.0F);
         this.field4799 = (int)((double)(this.field4797 * (float)var9) + 0.5) * 4;
      }

      return true;
   }

   private boolean method2674() {
      return this.field4800 && this.field4727.method18101() > 12;
   }

   public int method2675() {
      return (this.field4727.method18101() + 4 - 1) / 4 - 3;
   }

   private void method2676() {
      this.field4800 = this.field4727.method18102();
      if (!this.field4800) {
         this.field4797 = 0.0F;
         this.field4799 = 0;
      }
   }
}
