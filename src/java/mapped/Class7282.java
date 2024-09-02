package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class7282 {
   private static String[] field31236;
   public static final int[] field31237 = new int[Direction.values().length];

   static {
      try {
         field31237[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field31237[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field31237[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field31237[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
