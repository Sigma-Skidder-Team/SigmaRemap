package mapped;

import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class8947 {
   private static String[] field40454;
   public static final int[] field40455;
   public static final int[] field40456 = new int[Mirror.values().length];

   static {
      try {
         field40456[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field40456[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      field40455 = new int[Rotation.values().length];

      try {
         field40455[Rotation.field187.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field40455[Rotation.field188.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field40455[Rotation.field186.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
