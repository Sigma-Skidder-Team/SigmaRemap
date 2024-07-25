package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_1736 {
   field_8940(new TranslationTextComponent("options.mainHand.left")),
   field_8943(new TranslationTextComponent("options.mainHand.right"));

   private final ITextComponent field_8941;

   private class_1736(ITextComponent var3) {
      this.field_8941 = var3;
   }

   public class_1736 method_7745() {
      return this != field_8940 ? field_8940 : field_8943;
   }

   @Override
   public String toString() {
      return this.field_8941.getString();
   }

   public ITextComponent method_7747() {
      return this.field_8941;
   }
}
