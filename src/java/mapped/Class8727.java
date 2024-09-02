package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class8727 {
   private static String[] field39365;
   public static final int[] field39366 = new int[Direction.values().length];

   static {
      try {
         field39366[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field39366[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field39366[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field39366[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
