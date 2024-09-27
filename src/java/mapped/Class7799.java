package mapped;

import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class7799 {
   private static String[] field33492;
   public static final int[] field33493;
   public static final int[] field33494 = new int[Rotation.values().length];

   static {
      try {
         field33494[Rotation.field186.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field33494[Rotation.field187.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field33494[Rotation.field188.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      field33493 = new int[Class2089.values().length];

      try {
         field33493[Class2089.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field33493[Class2089.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
