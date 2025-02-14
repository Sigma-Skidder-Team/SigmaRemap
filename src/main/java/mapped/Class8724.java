package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class8724 {
   private static String[] field39362;
   public static final int[] field39363 = new int[Direction.Axis.values().length];

   static {
      try {
         field39363[Direction.Axis.X.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field39363[Direction.Axis.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field39363[Direction.Axis.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
