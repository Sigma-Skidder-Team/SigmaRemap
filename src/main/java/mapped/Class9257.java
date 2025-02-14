package mapped;

import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9257 {
   private static String[] field42564;
   public static final int[] field42565;
   public static final int[] field42566 = new int[Mirror.values().length];

   static {
      try {
         field42566[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field42566[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      field42565 = new int[Rotation.values().length];

      try {
         field42565[Rotation.CLOCKWISE_180.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field42565[Rotation.COUNTERCLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field42565[Rotation.CLOCKWISE_90.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
