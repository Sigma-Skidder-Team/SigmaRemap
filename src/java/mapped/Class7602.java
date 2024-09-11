package mapped;

import com.google.common.collect.Lists;
import java.util.List;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7602 implements Class7601 {
   private static final ITextComponent field32632 = new TranslationTextComponent("recipe.toast.title");
   private static final ITextComponent field32633 = new TranslationTextComponent("recipe.toast.description");
   private final List<IRecipe<?>> field32634 = Lists.newArrayList();
   private long field32635;
   private boolean field32636;

   public Class7602(IRecipe<?> var1) {
      this.field32634.add(var1);
   }

   @Override
   public Class2139 method24894(MatrixStack var1, ToastGui var2, long var3) {
      if (this.field32636) {
         this.field32635 = var3;
         this.field32636 = false;
      }

      if (!this.field32634.isEmpty()) {
         var2.method5915().getTextureManager().bindTexture(field32630);
         RenderSystem.method27890(1.0F, 1.0F, 1.0F);
         var2.blit(var1, 0, 0, 0, 32, this.method24898(), this.method24899());
         var2.method5915().fontRenderer.func_243248_b(var1, field32632, 30.0F, 7.0F, -11534256);
         var2.method5915().fontRenderer.func_243248_b(var1, field32633, 30.0F, 18.0F, -16777216);
         IRecipe var7 = this.field32634.get((int)(var3 / Math.max(1L, 5000L / (long)this.field32634.size()) % (long)this.field32634.size()));
         ItemStack var8 = var7.method14971();
         RenderSystem.pushMatrix();
         RenderSystem.scalef(0.6F, 0.6F, 1.0F);
         var2.method5915().getItemRenderer().method794(var8, 3, 3);
         RenderSystem.popMatrix();
         var2.method5915().getItemRenderer().method794(var7.getRecipeOutput(), 8, 8);
         return var3 - this.field32635 < 5000L ? Class2139.field14003 : Class2139.field14004;
      } else {
         return Class2139.field14004;
      }
   }

   private void method24900(IRecipe<?> var1) {
      this.field32634.add(var1);
      this.field32636 = true;
   }

   public static void method24901(ToastGui var0, IRecipe<?> var1) {
      Class7602 var4 = var0.<Class7602>method5912(Class7602.class, field32631);
      if (var4 != null) {
         var4.method24900(var1);
      } else {
         var0.method5914(new Class7602(var1));
      }
   }
}
