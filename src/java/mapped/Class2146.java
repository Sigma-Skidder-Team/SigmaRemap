package mapped;

import net.minecraft.util.text.TextFormatting;

public enum Class2146 {
   field14038(TextFormatting.BLUE),
   field14039(TextFormatting.RED),
   field14040(TextFormatting.BLUE);

   private final TextFormatting field14041;
   private static final Class2146[] field14042 = new Class2146[]{field14038, field14039, field14040};

   private Class2146(TextFormatting var3) {
      this.field14041 = var3;
   }

   public TextFormatting method8849() {
      return this.field14041;
   }
}
