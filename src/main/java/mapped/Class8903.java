package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class8903 {
   private static String[] field40296;
   public static final int[] field40297 = new int[Direction.values().length];

   static {
      try {
         field40297[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field40297[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field40297[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
