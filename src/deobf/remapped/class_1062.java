package remapped;

import net.minecraft.util.text.TextFormatting;

public enum class_1062 {
   field_5825("pink", TextFormatting.RED),
   field_5829("blue", TextFormatting.BLUE),
   field_5828("red", TextFormatting.DARK_RED),
   field_5827("green", TextFormatting.GREEN),
   field_5826("yellow", TextFormatting.YELLOW),
   field_5821("purple", TextFormatting.DARK_BLUE),
   field_5823("white", TextFormatting.WHITE);

   private final String field_5820;
   private final TextFormatting field_5830;

   private class_1062(String var3, TextFormatting var4) {
      this.field_5820 = var3;
      this.field_5830 = var4;
   }

   public TextFormatting method_4662() {
      return this.field_5830;
   }

   public String method_4665() {
      return this.field_5820;
   }

   public static class_1062 method_4664(String var0) {
      for (class_1062 var6 : values()) {
         if (var6.field_5820.equals(var0)) {
            return var6;
         }
      }

      return field_5823;
   }
}
