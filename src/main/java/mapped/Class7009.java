package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class7009 {
   private static String[] field30295;
   public static final int[] field30296 = new int[Direction.values().length];

   static {
      try {
         field30296[Direction.DOWN.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field30296[Direction.UP.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field30296[Direction.NORTH.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field30296[Direction.SOUTH.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field30296[Direction.WEST.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field30296[Direction.EAST.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
