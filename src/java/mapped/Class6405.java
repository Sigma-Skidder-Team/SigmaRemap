package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class6405 {
   private static String[] field28025;
   public static final int[] field28026 = new int[Direction.values().length];

   static {
      try {
         field28026[Direction.DOWN.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field28026[Direction.field673.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field28026[Direction.NORTH.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field28026[Direction.SOUTH.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field28026[Direction.WEST.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field28026[Direction.EAST.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
