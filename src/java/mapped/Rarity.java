package mapped;

import net.minecraft.util.text.TextFormatting;

public enum Rarity {
   field12885(TextFormatting.WHITE),
   field12886(TextFormatting.YELLOW),
   field12887(TextFormatting.AQUA),
   EPIC(TextFormatting.LIGHT_PURPLE);

   public final TextFormatting field12889;
   private static final Rarity[] field12890 = new Rarity[]{field12885, field12886, field12887, EPIC};

   private Rarity(TextFormatting var3) {
      this.field12889 = var3;
   }
}
