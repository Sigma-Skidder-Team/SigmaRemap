package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9111 {
   private static String[] field41871;
   public static final int[] field41872;
   public static final int[] field41873 = new int[Rotation.values().length];

   static {
      try {
         field41873[Rotation.COUNTERCLOCKWISE_90.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field41873[Rotation.CLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      field41872 = new int[Direction.Axis.values().length];

      try {
         field41872[Direction.Axis.Z.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field41872[Direction.Axis.X.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
