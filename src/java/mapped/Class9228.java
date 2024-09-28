package mapped;

import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9228 {
   private static String[] field42476;
   public static final int[] field42477;
   public static final int[] field42478 = new int[Mirror.values().length];

   static {
      try {
         field42478[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field42478[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      field42477 = new int[Rotation.values().length];

      try {
         field42477[Rotation.field187.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field42477[Rotation.field188.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field42477[Rotation.field186.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
