package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9779 {
   private static String[] field45744;
   public static final int[] field45745;
   public static final int[] field45746 = new int[Rotation.values().length];

   static {
      try {
         field45746[Rotation.COUNTERCLOCKWISE_90.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field45746[Rotation.CLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      field45745 = new int[Direction.Axis.values().length];

      try {
         field45745[Direction.Axis.X.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45745[Direction.Axis.Z.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
