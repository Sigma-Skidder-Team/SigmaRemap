package remapped;

import com.mojang.brigadier.arguments.StringArgumentType.StringType;

// $VF: synthetic class
public class class_769 {
   private static String[] field_4159;

   static {
      try {
         field_4158[StringType.SINGLE_WORD.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field_4158[StringType.QUOTABLE_PHRASE.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field_4158[StringType.GREEDY_PHRASE.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
