package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_6931 {
   field_35608("enabled"),
   field_35604("disabled"),
   field_35609("prompt");

   private final ITextComponent field_35606;

   private class_6931(String var3) {
      this.field_35606 = new TranslationTextComponent("addServer.resourcePack." + var3);
   }

   public ITextComponent method_31697() {
      return this.field_35606;
   }
}
