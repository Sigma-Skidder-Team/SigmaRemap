package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_589 implements class_4530 {
   field_3417("save"),
   field_3414("load"),
   field_3418("corner"),
   field_3411("data");

   private final String field_3415;
   private final ITextComponent field_3413;

   private class_589(String var3) {
      this.field_3415 = var3;
      this.field_3413 = new TranslationTextComponent("structure_block.mode_info." + var3);
   }

   @Override
   public String method_21049() {
      return this.field_3415;
   }

   public ITextComponent method_2762() {
      return this.field_3413;
   }
}
