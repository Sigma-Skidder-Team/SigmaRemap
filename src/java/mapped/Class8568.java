package mapped;

import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class8568 {
   private static String[] field38524;
   public static final int[] field38525 = new int[Rotation.values().length];

   static {
      try {
         field38525[Rotation.field185.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field38525[Rotation.field186.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field38525[Rotation.field187.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field38525[Rotation.field188.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
