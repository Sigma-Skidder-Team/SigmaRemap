package mapped;

// $VF: synthetic class
public class Class8024 {
   private static String[] field34485;
   public static final int[] field34486;
   public static final int[] field34487 = new int[net.minecraft.util.Direction.values().length];

   static {
      try {
         field34487[net.minecraft.util.Direction.EAST.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field34487[net.minecraft.util.Direction.WEST.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field34487[net.minecraft.util.Direction.field673.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field34487[net.minecraft.util.Direction.DOWN.ordinal()] = 4;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field34487[net.minecraft.util.Direction.SOUTH.ordinal()] = 5;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field34487[net.minecraft.util.Direction.NORTH.ordinal()] = 6;
      } catch (NoSuchFieldError var6) {
      }

      field34486 = new int[Direction.values().length];

      try {
         field34486[Direction.X.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field34486[Direction.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field34486[Direction.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
