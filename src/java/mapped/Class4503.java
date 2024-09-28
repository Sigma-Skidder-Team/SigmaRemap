package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class4503 {
   private static String[] field21729;
   public static final int[] field21730;
   public static final int[] field21731 = new int[Direction.Axis.values().length];

   static {
      try {
         field21731[Direction.Axis.X.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field21731[Direction.Axis.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field21731[Direction.Axis.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }

      field21730 = new int[Rotation.values().length];

      try {
         field21730[Rotation.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field21730[Rotation.CLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field21730[Rotation.CLOCKWISE_180.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field21730[Rotation.COUNTERCLOCKWISE_90.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
