package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public enum Class1965 {
   field12814("task", 0, TextFormatting.GREEN),
   field12815("challenge", 26, TextFormatting.DARK_PURPLE),
   field12816("goal", 52, TextFormatting.GREEN);

   private final String field12817;
   private final int field12818;
   private final TextFormatting field12819;
   private final ITextComponent field12820;
   private static final Class1965[] field12821 = new Class1965[]{field12814, field12815, field12816};

   private Class1965(String var3, int var4, TextFormatting var5) {
      this.field12817 = var3;
      this.field12818 = var4;
      this.field12819 = var5;
      this.field12820 = new TranslationTextComponent("advancements.toast." + var3);
   }

   public String method8241() {
      return this.field12817;
   }

   public int method8242() {
      return this.field12818;
   }

   public static Class1965 method8243(String var0) {
      for (Class1965 var6 : values()) {
         if (var6.field12817.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Unknown frame type '" + var0 + "'");
   }

   public TextFormatting method8244() {
      return this.field12819;
   }

   public ITextComponent method8245() {
      return this.field12820;
   }
}
