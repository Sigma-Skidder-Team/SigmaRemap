package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class7441 {
   private static String[] field32014;
   public static final int[] field32015;
   public static final int[] field32016 = new int[Class102.values().length];

   static {
      try {
         field32016[Class102.field307.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field32016[Class102.field308.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      field32015 = new int[Direction.values().length];

      try {
         field32015[Direction.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field32015[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field32015[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field32015[Direction.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
