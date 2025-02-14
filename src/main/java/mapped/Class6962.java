package mapped;

import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class6962 {
   private static String[] field30163;
   public static final int[] field30164;
   public static final int[] field30165 = new int[Mirror.values().length];

   static {
      try {
         field30165[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field30165[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      field30164 = new int[Rotation.values().length];

      try {
         field30164[Rotation.CLOCKWISE_180.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field30164[Rotation.COUNTERCLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field30164[Rotation.CLOCKWISE_90.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
