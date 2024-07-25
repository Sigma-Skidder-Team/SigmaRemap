package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_895 extends class_8374<class_6635> {
   private static final class_4639 field_4599 = new class_4639("textures/gui/resource_packs.png");
   private static final ITextComponent field_4602 = new TranslationTextComponent("pack.incompatible");
   private static final ITextComponent field_4603 = new TranslationTextComponent("pack.incompatible.confirm.title");
   private final ITextComponent field_4600;

   public class_895(MinecraftClient var1, int var2, int var3, ITextComponent var4) {
      super(var1, var2, var3, 32, var3 - 55 + 4, 36);
      this.field_4600 = var4;
      this.field_40880 = false;
      this.method_36203(true, 13);
   }

   @Override
   public void method_36196(class_7966 var1, int var2, int var3, class_8042 var4) {
      IFormattableTextComponent var7 = new StringTextComponent("").append(this.field_4600).mergeStyle(TextFormatting.UNDERLINE, TextFormatting.BOLD);
      this.field_40883
         .textRenderer
         .method_45378(
            var1,
            var7,
            (float)(var2 + this.field_40891 / 2 - this.field_40883.textRenderer.method_45379(var7) / 2),
            (float)Math.min(this.field_40876 + 3, var3),
            16777215
         );
   }

   @Override
   public int method_36195() {
      return this.field_40891;
   }

   @Override
   public int method_36191() {
      return this.field_40882 - 6;
   }
}
