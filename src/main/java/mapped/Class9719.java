package mapped;

import net.minecraft.enchantment.Enchantment;

// $VF: synthetic class
public class Class9719 {
   private static String[] field45409;
   public static final int[] field45410 = new int[Enchantment.Rarity.values().length];

   static {
      try {
         field45410[Enchantment.Rarity.COMMON.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field45410[Enchantment.Rarity.UNCOMMON.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45410[Enchantment.Rarity.RARE.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45410[Enchantment.Rarity.VERY_RARE.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
