package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class9811 {
   private static String[] field45857;
   public static final int[] field45858 = new int[Direction.Axis.values().length];

   static {
      try {
         field45858[Direction.Axis.X.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45858[Direction.Axis.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45858[Direction.Axis.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
