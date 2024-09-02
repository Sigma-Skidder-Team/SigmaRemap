package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class6012 {
   private static String[] field26197;
   public static final int[] field26198 = new int[Direction.values().length];

   static {
      try {
         field26198[Direction.DOWN.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field26198[Direction.field673.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field26198[Direction.NORTH.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field26198[Direction.SOUTH.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field26198[Direction.WEST.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field26198[Direction.EAST.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
