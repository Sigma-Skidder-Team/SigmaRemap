package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_2057 {
   field_10391("old"),
   field_10394("new"),
   field_10393("compatible");

   private final ITextComponent field_10392;
   private final ITextComponent field_10390;

   private class_2057(String var3) {
      this.field_10392 = new TranslationTextComponent("pack.incompatible." + var3).mergeStyle(TextFormatting.GRAY);
      this.field_10390 = new TranslationTextComponent("pack.incompatible.confirm." + var3);
   }

   public boolean method_9602() {
      return this == field_10393;
   }

   public static class_2057 method_9601(int var0) {
      if (var0 >= class_7665.method_34674().getPackVersion()) {
         return var0 <= class_7665.method_34674().getPackVersion() ? field_10393 : field_10394;
      } else {
         return field_10391;
      }
   }

   public ITextComponent method_9603() {
      return this.field_10392;
   }

   public ITextComponent method_9605() {
      return this.field_10390;
   }
}
