package mapped;

import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class7246 {
   private static String[] field31109;
   public static final int[] field31110;
   public static final int[] field31111 = new int[Mirror.values().length];

   static {
      try {
         field31111[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field31111[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      field31110 = new int[Rotation.values().length];

      try {
         field31110[Rotation.field187.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field31110[Rotation.field188.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field31110[Rotation.field186.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
