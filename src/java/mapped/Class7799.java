package mapped;

import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class7799 {
   private static String[] field33492;
   public static final int[] field33493;
   public static final int[] field33494 = new int[Rotation.values().length];

   static {
      try {
         field33494[Rotation.CLOCKWISE_90.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field33494[Rotation.CLOCKWISE_180.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field33494[Rotation.COUNTERCLOCKWISE_90.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      field33493 = new int[Mirror.values().length];

      try {
         field33493[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field33493[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
