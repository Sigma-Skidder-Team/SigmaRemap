package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public interface class_2541 {
   class_2541 field_12597 = method_11575();
   class_2541 field_12595 = method_11574("pack.source.builtin");
   class_2541 field_12594 = method_11574("pack.source.world");
   class_2541 field_12596 = method_11574("pack.source.server");

   ITextComponent method_11573(ITextComponent var1);

   static class_2541 method_11575() {
      return var0 -> var0;
   }

   static class_2541 method_11574(String var0) {
      TranslationTextComponent var3 = new TranslationTextComponent(var0);
      return var1 -> new TranslationTextComponent("pack.nameAndSource", var1, var3).mergeStyle(TextFormatting.GRAY);
   }
}
