package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_7742 {
   field_39260(0, "cape"),
   field_39258(1, "jacket"),
   field_39264(2, "left_sleeve"),
   field_39256(3, "right_sleeve"),
   field_39266(4, "left_pants_leg"),
   field_39255(5, "right_pants_leg"),
   field_39259(6, "hat");

   private final int field_39267;
   private final int field_39261;
   private final String field_39257;
   private final ITextComponent field_39263;

   private class_7742(int var3, String var4) {
      this.field_39267 = var3;
      this.field_39261 = 1 << var3;
      this.field_39257 = var4;
      this.field_39263 = new TranslationTextComponent("options.modelPart." + var4);
   }

   public int method_35037() {
      return this.field_39261;
   }

   public String method_35039() {
      return this.field_39257;
   }

   public ITextComponent method_35040() {
      return this.field_39263;
   }
}
