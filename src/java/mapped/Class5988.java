package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class5988 {
   private static String[] field26124;
   public static final int[] field26125;
   public static final int[] field26126 = new int[Class1947.values().length];

   static {
      try {
         field26126[Class1947.field12614.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field26126[Class1947.field12615.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field26126[Class1947.field12616.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }

      field26125 = new int[Direction.values().length];

      try {
         field26125[Direction.EAST.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field26125[Direction.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field26125[Direction.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field26125[Direction.NORTH.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
