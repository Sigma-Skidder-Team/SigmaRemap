package mapped;

import net.minecraft.entity.ai.attributes.AttributeModifier;

// $VF: synthetic class
public class Class8163 {
   private static String[] field35136;
   public static final int[] field35137 = new int[AttributeModifier.Operation.values().length];

   static {
      try {
         field35137[AttributeModifier.Operation.ADDITION.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field35137[AttributeModifier.Operation.field13353.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field35137[AttributeModifier.Operation.MULTIPLY_TOTAL.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
