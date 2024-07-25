package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4678 implements class_6406 {
   private static final ITextComponent field_22802 = new TranslationTextComponent("recipe.toast.title");
   private static final ITextComponent field_22803 = new TranslationTextComponent("recipe.toast.description");
   private final List<class_8932<?>> field_22800 = Lists.newArrayList();
   private long field_22798;
   private boolean field_22799;

   public class_4678(class_8932<?> var1) {
      this.field_22800.add(var1);
   }

   @Override
   public class_5068 method_29236(class_7966 var1, class_9184 var2, long var3) {
      if (this.field_22799) {
         this.field_22798 = var3;
         this.field_22799 = false;
      }

      if (!this.field_22800.isEmpty()) {
         var2.method_42327().getTextureManager().bindTexture(field_32696);
         RenderSystem.color3f(1.0F, 1.0F, 1.0F);
         var2.method_9781(var1, 0, 0, 0, 32, this.method_29239(), this.method_29238());
         var2.method_42327().textRenderer.method_45378(var1, field_22802, 30.0F, 7.0F, -11534256);
         var2.method_42327().textRenderer.method_45378(var1, field_22803, 30.0F, 18.0F, -16777216);
         class_8932 var7 = this.field_22800.get((int)(var3 / Math.max(1L, 5000L / (long)this.field_22800.size()) % (long)this.field_22800.size()));
         ItemStack var8 = var7.method_41049();
         RenderSystem.method_16438();
         RenderSystem.method_16403(0.6F, 0.6F, 1.0F);
         var2.method_42327().method_8511().method_40284(var8, 3, 3);
         RenderSystem.method_16489();
         var2.method_42327().method_8511().method_40284(var7.method_41044(), 8, 8);
         return var3 - this.field_22798 < 5000L ? class_5068.field_26192 : class_5068.field_26190;
      } else {
         return class_5068.field_26190;
      }
   }

   private void method_21629(class_8932<?> var1) {
      this.field_22800.add(var1);
      this.field_22799 = true;
   }

   public static void method_21628(class_9184 var0, class_8932<?> var1) {
      class_4678 var4 = var0.<class_4678>method_42328(class_4678.class, field_32695);
      if (var4 != null) {
         var4.method_21629(var1);
      } else {
         var0.method_42329(new class_4678(var1));
      }
   }
}
