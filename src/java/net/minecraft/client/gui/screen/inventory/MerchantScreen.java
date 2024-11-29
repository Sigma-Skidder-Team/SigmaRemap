package net.minecraft.client.gui.screen.inventory;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CSelectTradePacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class MerchantScreen extends ContainerScreen<Class5826> {
   private static final ResourceLocation field4786 = new ResourceLocation("textures/gui/container/villager2.png");
   private static final ITextComponent field4787 = new TranslationTextComponent("merchant.trades");
   private static final ITextComponent field4788 = new StringTextComponent(" - ");
   private static final ITextComponent field4789 = new TranslationTextComponent("merchant.deprecated");
   private int field4790;
   private final Class1207[] field4791 = new Class1207[7];
   private int field4792;
   private boolean field4793;

   public MerchantScreen(Class5826 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.xSize = 276;
      this.field4725 = 107;
   }

   private void method2661() {
      this.field4727.method18204(this.field4790);
      this.field4727.method18213(this.field4790);
      this.mc.getConnection().sendPacket(new CSelectTradePacket(this.field4790));
   }

   @Override
   public void init() {
      super.init();
      int var3 = (this.width - this.xSize) / 2;
      int var4 = (this.height - this.ySize) / 2;
      int var5 = var4 + 16 + 2;

      for (int var6 = 0; var6 < 7; var6++) {
         this.field4791[var6] = this.<Class1207>addButton(new Class1207(this, var3 + 5, var5, var6, var1 -> {
            if (var1 instanceof Class1207) {
               this.field4790 = ((Class1207)var1).method5765() + this.field4792;
               this.method2661();
            }
         }));
         var5 += 20;
      }
   }

   @Override
   public void method2617(MatrixStack var1, int var2, int var3) {
      int var6 = this.field4727.method18208();
      if (var6 > 0 && var6 <= 5 && this.field4727.method18218()) {
         IFormattableTextComponent var7 = this.title.deepCopy().append(field4788).append(new TranslationTextComponent("merchant.level." + var6));
         int var8 = this.font.method38821(var7);
         int var9 = 49 + this.xSize / 2 - var8 / 2;
         this.font.func_243248_b(var1, var7, (float)var9, 6.0F, 4210752);
      } else {
         this.font.func_243248_b(var1, this.title, (float)(49 + this.xSize / 2 - this.font.method38821(this.title) / 2), 6.0F, 4210752);
      }

      this.font.func_243248_b(var1, this.field4728.getDisplayName(), (float)this.field4725, (float)this.playerInventoryTitleY, 4210752);
      int var10 = this.font.method38821(field4787);
      this.font.func_243248_b(var1, field4787, (float)(5 - var10 / 2 + 48), 6.0F, 4210752);
   }

   @Override
   public void drawGuiContainerBackgroundLayer(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field4786);
      int var7 = (this.width - this.xSize) / 2;
      int var8 = (this.height - this.ySize) / 2;
      method5697(var1, var7, var8, this.method5702(), 0.0F, 0.0F, this.xSize, this.ySize, 256, 512);
      Class46 var9 = this.field4727.method18217();
      if (!var9.isEmpty()) {
         int var10 = this.field4790;
         if (var10 < 0 || var10 >= var9.size()) {
            return;
         }

         Class9346 var11 = var9.get(var10);
         if (var11.method35382()) {
            this.mc.getTextureManager().bindTexture(field4786);
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            method5697(var1, this.field4734 + 83 + 99, this.field4735 + 35, this.method5702(), 311.0F, 0.0F, 28, 21, 256, 512);
         }
      }
   }

   private void method2662(MatrixStack var1, int var2, int var3, Class9346 var4) {
      this.mc.getTextureManager().bindTexture(field4786);
      int var7 = this.field4727.method18208();
      int var8 = this.field4727.method18205();
      if (var7 < 5) {
         method5697(var1, var2 + 136, var3 + 16, this.method5702(), 0.0F, 186.0F, 102, 5, 256, 512);
         int var9 = Class7921.method26576(var7);
         if (var8 >= var9 && Class7921.method26578(var7)) {
            float var11 = 100.0F / (float)(Class7921.method26577(var7) - var9);
            int var12 = Math.min(MathHelper.floor(var11 * (float)(var8 - var9)), 100);
            method5697(var1, var2 + 136, var3 + 16, this.method5702(), 0.0F, 191.0F, var12 + 1, 5, 256, 512);
            int var13 = this.field4727.method18206();
            if (var13 > 0) {
               int var14 = Math.min(MathHelper.floor((float)var13 * var11), 100 - var12);
               method5697(var1, var2 + 136 + var12 + 1, var3 + 16 + 1, this.method5702(), 2.0F, 182.0F, var14, 3, 256, 512);
            }
         }
      }
   }

   private void method2663(MatrixStack var1, int var2, int var3, Class46 var4) {
      int var7 = var4.size() + 1 - 7;
      if (var7 <= 1) {
         method5697(var1, var2 + 94, var3 + 18, this.method5702(), 6.0F, 199.0F, 6, 27, 256, 512);
      } else {
         int var8 = 139 - (27 + (var7 - 1) * 139 / var7);
         int var9 = 1 + var8 / var7 + 139 / var7;
         int var11 = Math.min(113, this.field4792 * var9);
         if (this.field4792 == var7 - 1) {
            var11 = 113;
         }

         method5697(var1, var2 + 94, var3 + 18 + var11, this.method5702(), 0.0F, 199.0F, 6, 27, 256, 512);
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      super.render(var1, var2, var3, var4);
      Class46 var7 = this.field4727.method18217();
      if (!var7.isEmpty()) {
         int var8 = (this.width - this.xSize) / 2;
         int var9 = (this.height - this.ySize) / 2;
         int var10 = var9 + 16 + 1;
         int var11 = var8 + 5 + 5;
         RenderSystem.pushMatrix();
         RenderSystem.enableRescaleNormal();
         this.mc.getTextureManager().bindTexture(field4786);
         this.method2663(var1, var8, var9, var7);
         int var12 = 0;

         for (Class9346 var14 : var7) {
            if (!this.method2666(var7.size()) || var12 >= this.field4792 && var12 < 7 + this.field4792) {
               ItemStack var15 = var14.method35365();
               ItemStack var16 = var14.method35366();
               ItemStack var17 = var14.method35367();
               ItemStack var18 = var14.method35368();
               this.field4563.field847 = 100.0F;
               int var19 = var10 + 2;
               this.method2665(var1, var16, var15, var11, var19);
               if (!var17.isEmpty()) {
                  this.field4563.method794(var17, var8 + 5 + 35, var19);
                  this.field4563.method797(this.font, var17, var8 + 5 + 35, var19);
               }

               this.method2664(var1, var14, var8, var19);
               this.field4563.method794(var18, var8 + 5 + 68, var19);
               this.field4563.method797(this.font, var18, var8 + 5 + 68, var19);
               this.field4563.field847 = 0.0F;
               var10 += 20;
               var12++;
            } else {
               var12++;
            }
         }

         int var20 = this.field4790;
         Class9346 var21 = var7.get(var20);
         if (this.field4727.method18218()) {
            this.method2662(var1, var8, var9, var21);
         }

         if (var21.method35382() && this.method2625(186, 35, 22, 21, (double)var2, (double)var3) && this.field4727.method18211()) {
            this.method2459(var1, field4789, var2, var3);
         }

         for (Class1207 var25 : this.field4791) {
            if (var25.isHovered()) {
               var25.renderToolTip(var1, var2, var3);
            }

            var25.visible = var25.field6516 < this.field4727.method18217().size();
         }

         RenderSystem.popMatrix();
         RenderSystem.enableDepthTest();
      }

      this.renderHoveredTooltip(var1, var2, var3);
   }

   private void method2664(MatrixStack var1, Class9346 var2, int var3, int var4) {
      RenderSystem.enableBlend();
      this.mc.getTextureManager().bindTexture(field4786);
      if (!var2.method35382()) {
         method5697(var1, var3 + 5 + 35 + 20, var4 + 3, this.method5702(), 15.0F, 171.0F, 10, 9, 256, 512);
      } else {
         method5697(var1, var3 + 5 + 35 + 20, var4 + 3, this.method5702(), 25.0F, 171.0F, 10, 9, 256, 512);
      }
   }

   private void method2665(MatrixStack var1, ItemStack var2, ItemStack var3, int var4, int var5) {
      this.field4563.method794(var2, var4, var5);
      if (var3.getCount() != var2.getCount()) {
         this.field4563.method798(this.font, var3, var4, var5, var3.getCount() != 1 ? null : "1");
         this.field4563.method798(this.font, var2, var4 + 14, var5, var2.getCount() != 1 ? null : "1");
         this.mc.getTextureManager().bindTexture(field4786);
         this.method5703(this.method5702() + 300);
         method5697(var1, var4 + 7, var5 + 12, this.method5702(), 0.0F, 176.0F, 9, 2, 256, 512);
         this.method5703(this.method5702() - 300);
      } else {
         this.field4563.method797(this.font, var2, var4, var5);
      }
   }

   private boolean method2666(int var1) {
      return var1 > 7;
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      int var9 = this.field4727.method18217().size();
      if (this.method2666(var9)) {
         int var10 = var9 - 7;
         this.field4792 = (int)((double)this.field4792 - var5);
         this.field4792 = MathHelper.clamp(this.field4792, 0, var10);
      }

      return true;
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      int var12 = this.field4727.method18217().size();
      if (!this.field4793) {
         return super.mouseDragged(var1, var3, var5, var6, var8);
      } else {
         int var13 = this.field4735 + 18;
         int var14 = var13 + 139;
         int var15 = var12 - 7;
         float var16 = ((float)var3 - (float)var13 - 13.5F) / ((float)(var14 - var13) - 27.0F);
         var16 = var16 * (float)var15 + 0.5F;
         this.field4792 = MathHelper.clamp((int)var16, 0, var15);
         return true;
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      this.field4793 = false;
      int var8 = (this.width - this.xSize) / 2;
      int var9 = (this.height - this.ySize) / 2;
      if (this.method2666(this.field4727.method18217().size())
         && var1 > (double)(var8 + 94)
         && var1 < (double)(var8 + 94 + 6)
         && var3 > (double)(var9 + 18)
         && var3 <= (double)(var9 + 18 + 139 + 1)) {
         this.field4793 = true;
      }

      return super.mouseClicked(var1, var3, var5);
   }

   // $VF: synthetic method
   public static int method2668(MerchantScreen var0) {
      return var0.field4792;
   }

   // $VF: synthetic method
   public static void method2669(MerchantScreen var0, MatrixStack var1, ItemStack var2, int var3, int var4) {
      var0.method2457(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static void method2670(MerchantScreen var0, MatrixStack var1, ItemStack var2, int var3, int var4) {
      var0.method2457(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static void method2671(MerchantScreen var0, MatrixStack var1, ItemStack var2, int var3, int var4) {
      var0.method2457(var1, var2, var3, var4);
   }
}
