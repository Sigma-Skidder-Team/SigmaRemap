package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class8636 {
   private static String[] field38873;
   public static final int[] field38874 = new int[Direction.values().length];

   static {
      try {
         field38874[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field38874[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field38874[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
