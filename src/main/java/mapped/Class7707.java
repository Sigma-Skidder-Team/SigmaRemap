package mapped;

import net.minecraft.state.properties.AttachFace;

// $VF: synthetic class
public class Class7707 {
   private static String[] field33092;
   public static final int[] field33093 = new int[AttachFace.values().length];

   static {
      try {
         field33093[AttachFace.field313.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field33093[AttachFace.field314.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field33093[AttachFace.field315.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
