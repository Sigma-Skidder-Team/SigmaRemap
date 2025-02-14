package mapped;

import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9399 {
   private static String[] field43616;
   public static final int[] field43617 = new int[Rotation.values().length];

   static {
      try {
         field43617[Rotation.CLOCKWISE_180.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field43617[Rotation.COUNTERCLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field43617[Rotation.CLOCKWISE_90.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
