package mapped;

import net.minecraft.item.UseAction;

// $VF: synthetic class
public class Class6063 {
   private static String[] field26303;
   public static final int[] field26304 = new int[UseAction.values().length];

   static {
      try {
         field26304[UseAction.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field26304[UseAction.EAT.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field26304[UseAction.DRINK.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field26304[UseAction.BLOCK.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field26304[UseAction.BOW.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field26304[UseAction.SPEAR.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
