package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public enum class_3361 {
   field_16556("task", 0, TextFormatting.GREEN),
   field_16559("challenge", 26, TextFormatting.DARK_PURPLE),
   field_16561("goal", 52, TextFormatting.GREEN);

   private final String field_16560;
   private final int field_16563;
   private final TextFormatting field_16557;
   private final ITextComponent field_16555;

   private class_3361(String var3, int var4, TextFormatting var5) {
      this.field_16560 = var3;
      this.field_16563 = var4;
      this.field_16557 = var5;
      this.field_16555 = new TranslationTextComponent("advancements.toast." + var3);
   }

   public String method_15385() {
      return this.field_16560;
   }

   public int method_15382() {
      return this.field_16563;
   }

   public static class_3361 method_15387(String var0) {
      for (class_3361 var6 : values()) {
         if (var6.field_16560.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Unknown frame type '" + var0 + "'");
   }

   public TextFormatting method_15386() {
      return this.field_16557;
   }

   public ITextComponent method_15384() {
      return this.field_16555;
   }
}
