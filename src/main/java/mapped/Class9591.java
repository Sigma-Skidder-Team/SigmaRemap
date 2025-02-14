package mapped;

import net.minecraft.item.Rarity;

// $VF: synthetic class
public class Class9591 {
   private static String[] field44866;
   public static final int[] field44867 = new int[Rarity.values().length];

   static {
      try {
         field44867[Rarity.COMMON.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field44867[Rarity.UNCOMMON.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field44867[Rarity.RARE.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field44867[Rarity.EPIC.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
