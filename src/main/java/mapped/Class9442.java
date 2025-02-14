package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class9442 {
   private static String[] field43869;
   public static final int[] field43870 = new int[Direction.values().length];

   static {
      try {
         field43870[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field43870[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field43870[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field43870[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
