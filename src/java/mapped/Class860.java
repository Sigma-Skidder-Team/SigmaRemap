package mapped;

import com.google.common.collect.Ordering;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.ITextComponent;

import java.util.Collection;
import java.util.List;

public abstract class Class860<T extends Container> extends ContainerScreen<T> {
   public boolean field4772;

   public Class860(T var1, PlayerInventory var2, ITextComponent var3) {
      super((T)var1, var2, var3);
   }

   @Override
   public void init() {
      super.init();
      this.method2638();
   }

   public void method2638() {
      if (!this.mc.player.getActivePotionEffects().isEmpty()) {
         this.field4734 = 160 + (this.width - this.xSize - 200) / 2;
         this.field4772 = true;
      } else {
         this.field4734 = (this.width - this.xSize) / 2;
         this.field4772 = false;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      super.render(var1, var2, var3, var4);
      if (this.field4772) {
         this.method2639(var1);
      }
   }

   private void method2639(MatrixStack var1) {
      int var4 = this.field4734 - 124;
      Collection var5 = this.mc.player.getActivePotionEffects();
      if (!var5.isEmpty()) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var6 = 33;
         if (var5.size() > 5) {
            var6 = 132 / (var5.size() - 1);
         }

         List var7 = Ordering.natural().sortedCopy(var5);
         this.method2640(var1, var4, var6, var7);
         this.method2641(var1, var4, var6, var7);
         this.method2642(var1, var4, var6, var7);
      }
   }

   private void method2640(MatrixStack var1, int var2, int var3, Iterable<EffectInstance> var4) {
      this.mc.getTextureManager().bindTexture(field4720);
      int var7 = this.field4735;

      for (EffectInstance var9 : var4) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.blit(var1, var2, var7, 0, 166, 140, 32);
         var7 += var3;
      }
   }

   private void method2641(MatrixStack var1, int var2, int var3, Iterable<EffectInstance> var4) {
      PotionSpriteUploader var7 = this.mc.getPotionSpriteUploader();
      int var8 = this.field4735;

      for (EffectInstance var10 : var4) {
         Effect var11 = var10.getPotion();
         TextureAtlasSprite var12 = var7.method1022(var11);
         this.mc.getTextureManager().bindTexture(var12.getAtlasTexture().getTextureLocation());
         method5695(var1, var2 + 6, var8 + 7, this.method5702(), 18, 18, var12);
         var8 += var3;
      }
   }

   private void method2642(MatrixStack var1, int var2, int var3, Iterable<EffectInstance> var4) {
      int var7 = this.field4735;

      for (EffectInstance var9 : var4) {
         String var10 = I18n.format(var9.getPotion().getName());
         if (var9.method8629() >= 1 && var9.method8629() <= 9) {
            var10 = var10 + ' ' + I18n.format("enchantment.level." + (var9.method8629() + 1));
         }

         this.font.drawStringWithShadow(var1, var10, (float)(var2 + 10 + 18), (float)(var7 + 6), 16777215);
         String var11 = Class7182.method22535(var9, 1.0F);
         this.font.drawStringWithShadow(var1, var11, (float)(var2 + 10 + 18), (float)(var7 + 6 + 10), 8355711);
         var7 += var3;
      }
   }
}
