package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class9128 {
   private static String[] field41939;
   public static final int[] field41940 = new int[Direction.Axis.values().length];

   static {
      try {
         field41940[Direction.Axis.X.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field41940[Direction.Axis.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field41940[Direction.Axis.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
