package mapped;

import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class8568 {
   private static String[] field38524;
   public static final int[] field38525 = new int[Rotation.values().length];

   static {
      try {
         field38525[Rotation.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field38525[Rotation.CLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field38525[Rotation.CLOCKWISE_180.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field38525[Rotation.COUNTERCLOCKWISE_90.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
