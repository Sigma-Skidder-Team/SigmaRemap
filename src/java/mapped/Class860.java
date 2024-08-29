package mapped;

import com.google.common.collect.Ordering;
import net.minecraft.util.text.ITextComponent;

import java.util.Collection;
import java.util.List;

public abstract class Class860<T extends Class5812> extends Class851<T> {
   public boolean field4772;

   public Class860(T var1, PlayerInventory var2, ITextComponent var3) {
      super((T)var1, var2, var3);
   }

   @Override
   public void method1921() {
      super.method1921();
      this.method2638();
   }

   public void method2638() {
      if (!this.mc.player.method3031().isEmpty()) {
         this.field4734 = 160 + (this.field4564 - this.field4721 - 200) / 2;
         this.field4772 = true;
      } else {
         this.field4734 = (this.field4564 - this.field4721) / 2;
         this.field4772 = false;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      super.method1923(var1, var2, var3, var4);
      if (this.field4772) {
         this.method2639(var1);
      }
   }

   private void method2639(MatrixStack var1) {
      int var4 = this.field4734 - 124;
      Collection var5 = this.mc.player.method3031();
      if (!var5.isEmpty()) {
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
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

   private void method2640(MatrixStack var1, int var2, int var3, Iterable<Class2023> var4) {
      this.mc.getTextureManager().bindTexture(field4720);
      int var7 = this.field4735;

      for (Class2023 var9 : var4) {
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         this.method5696(var1, var2, var7, 0, 166, 140, 32);
         var7 += var3;
      }
   }

   private void method2641(MatrixStack var1, int var2, int var3, Iterable<Class2023> var4) {
      PotionSpriteUploader var7 = this.mc.getPotionSpriteUploader();
      int var8 = this.field4735;

      for (Class2023 var10 : var4) {
         Class7144 var11 = var10.method8627();
         TextureAtlasSprite var12 = var7.method1022(var11);
         this.mc.getTextureManager().bindTexture(var12.method7466().method1100());
         method5695(var1, var2 + 6, var8 + 7, this.method5702(), 18, 18, var12);
         var8 += var3;
      }
   }

   private void method2642(MatrixStack var1, int var2, int var3, Iterable<Class2023> var4) {
      int var7 = this.field4735;

      for (Class2023 var9 : var4) {
         String var10 = I18n.format(var9.method8627().method22294());
         if (var9.method8629() >= 1 && var9.method8629() <= 9) {
            var10 = var10 + ' ' + I18n.format("enchantment.level." + (var9.method8629() + 1));
         }

         this.fontRenderer.drawStringWithShadow(var1, var10, (float)(var2 + 10 + 18), (float)(var7 + 6), 16777215);
         String var11 = Class7182.method22535(var9, 1.0F);
         this.fontRenderer.drawStringWithShadow(var1, var11, (float)(var2 + 10 + 18), (float)(var7 + 6 + 10), 8355711);
         var7 += var3;
      }
   }
}
