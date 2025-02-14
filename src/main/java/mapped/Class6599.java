package mapped;

import com.mojang.brigadier.arguments.StringArgumentType.StringType;

// $VF: synthetic class
public class Class6599 {
   private static String[] field29035;
   public static final int[] field29036 = new int[StringType.values().length];

   static {
      try {
         field29036[StringType.SINGLE_WORD.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field29036[StringType.QUOTABLE_PHRASE.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field29036[StringType.GREEDY_PHRASE.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
