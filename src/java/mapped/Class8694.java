package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class8694 {
   private static String[] field39237;
   public static final int[] field39238 = new int[Direction.Axis.values().length];

   static {
      try {
         field39238[Direction.Axis.X.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field39238[Direction.Axis.Z.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field39238[Direction.Axis.Y.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
