package mapped;

import net.minecraft.state.properties.BellAttachment;

// $VF: synthetic class
public class Class7106 {
   private static String[] field30621;
   public static final int[] field30622 = new int[BellAttachment.values().length];

   static {
      try {
         field30622[BellAttachment.field212.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field30622[BellAttachment.field214.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field30622[BellAttachment.field215.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field30622[BellAttachment.field213.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
