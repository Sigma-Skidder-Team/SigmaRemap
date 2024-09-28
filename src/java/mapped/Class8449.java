package mapped;

import net.minecraft.util.Mirror;

// $VF: synthetic class
public class Class8449 {
   private static String[] field36254;
   public static final int[] field36255 = new int[Mirror.values().length];

   static {
      try {
         field36255[Mirror.field13616.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field36255[Mirror.field13615.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
