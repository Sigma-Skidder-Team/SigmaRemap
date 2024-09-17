package mapped;

// $VF: synthetic class
public class Class7747 {
   private static String[] field33264;
   public static final int[] field33265;
   public static final int[] field33266 = new int[Direction.values().length];

   static {
      try {
         field33266[Direction.X.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field33266[Direction.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field33266[Direction.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      field33265 = new int[net.minecraft.util.Direction.values().length];

      try {
         field33265[net.minecraft.util.Direction.DOWN.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field33265[net.minecraft.util.Direction.field673.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field33265[net.minecraft.util.Direction.NORTH.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field33265[net.minecraft.util.Direction.SOUTH.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field33265[net.minecraft.util.Direction.WEST.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field33265[net.minecraft.util.Direction.EAST.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
