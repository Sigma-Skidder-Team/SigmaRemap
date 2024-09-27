package mapped;

import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9257 {
   private static String[] field42564;
   public static final int[] field42565;
   public static final int[] field42566 = new int[Class2089.values().length];

   static {
      try {
         field42566[Class2089.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field42566[Class2089.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      field42565 = new int[Rotation.values().length];

      try {
         field42565[Rotation.field187.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field42565[Rotation.field188.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field42565[Rotation.field186.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
