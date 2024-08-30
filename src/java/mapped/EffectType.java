package mapped;

import net.minecraft.util.text.TextFormatting;

public enum EffectType {
   BENEFICIAL(TextFormatting.BLUE),
   HARMFUL(TextFormatting.RED),
   NEUTRAL(TextFormatting.BLUE);

   private final TextFormatting field14041;
   private static final EffectType[] field14042 = new EffectType[]{BENEFICIAL, HARMFUL, NEUTRAL};

   private EffectType(TextFormatting var3) {
      this.field14041 = var3;
   }

   public TextFormatting method8849() {
      return this.field14041;
   }
}
