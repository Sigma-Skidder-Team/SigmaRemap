package mapped;

import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class9607 {
   private static String[] field44928;
   public static final int[] field44929 = new int[Direction.Axis.values().length];

   static {
      try {
         field44929[Direction.Axis.X.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field44929[Direction.Axis.Z.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field44929[Direction.Axis.Y.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
