package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_8614 {
   field_44185,
   field_44187(new TranslationTextComponent("block.minecraft.bed.no_sleep")),
   field_44181(new TranslationTextComponent("block.minecraft.bed.too_far_away")),
   field_44180(new TranslationTextComponent("block.minecraft.bed.obstructed")),
   field_44186,
   field_44184(new TranslationTextComponent("block.minecraft.bed.not_safe"));

   private final ITextComponent field_44179;

   private class_8614() {
      this.field_44179 = null;
   }

   private class_8614(ITextComponent var3) {
      this.field_44179 = var3;
   }

   @Nullable
   public ITextComponent method_39593() {
      return this.field_44179;
   }
}
