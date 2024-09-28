package mapped;

import net.minecraft.state.properties.AttachFace;

// $VF: synthetic class
public class Class7785 {
   private static String[] field33409;
   public static final int[] field33410 = new int[AttachFace.values().length];

   static {
      try {
         field33410[AttachFace.field315.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field33410[AttachFace.field313.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
