package mapped;

import net.minecraft.state.properties.AttachFace;
import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class6596 {
   private static String[] field29023;
   public static final int[] field29024;
   public static final int[] field29025;
   public static final int[] field29026 = new int[AttachFace.values().length];

   static {
      try {
         field29026[AttachFace.field313.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field29026[AttachFace.field314.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field29026[AttachFace.field315.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      field29025 = new int[Direction.values().length];

      try {
         field29025[Direction.EAST.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field29025[Direction.WEST.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field29025[Direction.SOUTH.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field29025[Direction.NORTH.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      field29024 = new int[Direction.Axis.values().length];

      try {
         field29024[Direction.Axis.X.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field29024[Direction.Axis.Z.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
