package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class7528 {
   private static String[] field32313;
   public static final int[] field32314 = new int[Direction.values().length];

   static {
      try {
         field32314[Direction.DOWN.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field32314[Direction.UP.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field32314[Direction.NORTH.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field32314[Direction.SOUTH.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field32314[Direction.WEST.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field32314[Direction.EAST.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
