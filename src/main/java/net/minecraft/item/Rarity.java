package net.minecraft.item;

import net.minecraft.util.text.TextFormatting;

public enum Rarity {
   COMMON(TextFormatting.WHITE),
   UNCOMMON(TextFormatting.YELLOW),
   RARE(TextFormatting.AQUA),
   EPIC(TextFormatting.LIGHT_PURPLE);

   public final TextFormatting color;

   Rarity(TextFormatting color) {
      this.color = color;
   }
}
