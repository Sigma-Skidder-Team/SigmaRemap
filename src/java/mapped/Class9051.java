package mapped;

import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9051 {
   private static String[] field41435;
   public static final int[] field41436;
   public static final int[] field41437 = new int[Mirror.values().length];

   static {
      try {
         field41437[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field41437[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field41437[Mirror.field13614.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }

      field41436 = new int[Rotation.values().length];

      try {
         field41436[Rotation.field188.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field41436[Rotation.field186.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field41436[Rotation.field187.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field41436[Rotation.field185.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
