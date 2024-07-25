package net.minecraft.util.text;

import java.util.Optional;
import remapped.Unit;
import remapped.class_4981;
import remapped.class_5255;
import remapped.SigmaMainClass;

public class TextProcessing {
   private static final Optional<Object> field_238336_a_ = Optional.<Object>of(Unit.INSTANCE);

   private static boolean func_238344_a_(Style p_238344_0_, class_5255 p_238344_1_, int p_238344_2_, char p_238344_3_) {
      return Character.isSurrogate(p_238344_3_)
         ? p_238344_1_.method_24020(p_238344_2_, p_238344_0_, 65533)
         : p_238344_1_.method_24020(p_238344_2_, p_238344_0_, p_238344_3_);
   }

   public static boolean func_238341_a_(String p_238341_0_, Style p_238341_1_, class_5255 p_238341_2_) {
      int j = p_238341_0_.length();

      for (int c0 = 0; c0 < j; c0++) {
         char c1 = p_238341_0_.charAt(c0);
         if (Character.isHighSurrogate(c1)) {
            if (c0 + 1 >= j) {
               if (!p_238341_2_.method_24020(c0, p_238341_1_, 65533)) {
                  return false;
               }
               break;
            }

            char var8 = p_238341_0_.charAt(c0 + 1);
            if (Character.isLowSurrogate(var8)) {
               if (!p_238341_2_.method_24020(c0, p_238341_1_, Character.toCodePoint(c1, var8))) {
                  return false;
               }

               c0++;
            } else if (!p_238341_2_.method_24020(c0, p_238341_1_, 65533)) {
               return false;
            }
         } else if (!func_238344_a_(p_238341_1_, p_238341_2_, c0, c1)) {
            return false;
         }
      }

      return true;
   }

   public static boolean func_238345_b_(String p_238345_0_, Style p_238345_1_, class_5255 p_238345_2_) {
      int j = p_238345_0_.length();

      for (int c0 = j - 1; c0 >= 0; c0--) {
         char c1 = p_238345_0_.charAt(c0);
         if (Character.isLowSurrogate(c1)) {
            if (c0 - 1 < 0) {
               if (!p_238345_2_.method_24020(0, p_238345_1_, 65533)) {
                  return false;
               }
               break;
            }

            char var8 = p_238345_0_.charAt(c0 - 1);
            if (Character.isHighSurrogate(var8)) {
               if (!p_238345_2_.method_24020(--c0, p_238345_1_, Character.toCodePoint(var8, c1))) {
                  return false;
               }
            } else if (!p_238345_2_.method_24020(c0, p_238345_1_, 65533)) {
               return false;
            }
         } else if (!func_238344_a_(p_238345_1_, p_238345_2_, c0, c1)) {
            return false;
         }
      }

      return true;
   }

   public static boolean func_238346_c_(String p_238346_0_, Style p_238346_1_, class_5255 p_238346_2_) {
      return func_238339_a_(p_238346_0_, 0, p_238346_1_, p_238346_2_);
   }

   public static boolean func_238339_a_(String p_238339_0_, int p_238339_1_, Style p_238339_2_, class_5255 p_238339_3_) {
      return func_238340_a_(p_238339_0_, p_238339_1_, p_238339_2_, p_238339_2_, p_238339_3_);
   }

   public static boolean func_238340_a_(String p_238340_0_, int p_238340_1_, Style p_238340_2_, Style p_238340_3_, class_5255 p_238340_4_) {
      class_4981 i = new class_4981(p_238340_0_);
      SigmaMainClass.method_3328().method_3302().method_7914(i);
      p_238340_0_ = i.method_22941();
      int style = p_238340_0_.length();
      Style j = p_238340_2_;

      for (int c0 = p_238340_1_; c0 < style; c0++) {
         char c2 = p_238340_0_.charAt(c0);
         if (c2 == 167) {
            if (c0 + 1 >= style) {
               break;
            }

            char textformatting = p_238340_0_.charAt(c0 + 1);
            TextFormatting var13 = TextFormatting.fromFormattingCode(textformatting);
            if (var13 != null) {
               j = var13 == TextFormatting.RESET ? p_238340_3_ : j.forceFormatting(var13);
            }

            c0++;
         } else if (Character.isHighSurrogate(c2)) {
            if (c0 + 1 >= style) {
               if (!p_238340_4_.method_24020(c0, j, 65533)) {
                  return false;
               }
               break;
            }

            char var15 = p_238340_0_.charAt(c0 + 1);
            if (Character.isLowSurrogate(var15)) {
               if (!p_238340_4_.method_24020(c0, j, Character.toCodePoint(c2, var15))) {
                  return false;
               }

               c0++;
            } else if (!p_238340_4_.method_24020(c0, j, 65533)) {
               return false;
            }
         } else if (!func_238344_a_(j, p_238340_4_, c0, c2)) {
            return false;
         }
      }

      return true;
   }

   public static boolean func_238343_a_(ITextProperties p_238343_0_, Style p_238343_1_, class_5255 p_238343_2_) {
      return !p_238343_0_.func_230439_a_(
            (p_238337_1_, p_238337_2_) -> func_238339_a_(p_238337_2_, 0, p_238337_1_, p_238343_2_) ? Optional.empty() : field_238336_a_, p_238343_1_
         )
         .isPresent();
   }

   public static String func_238338_a_(String p_238338_0_) {
      StringBuilder var3 = new StringBuilder();
      func_238341_a_(p_238338_0_, Style.EMPTY, (p_238342_1_, p_238342_2_, p_238342_3_) -> {
         var3.appendCodePoint(p_238342_3_);
         return true;
      });
      return var3.toString();
   }

   public static String func_244782_a(ITextProperties p_244782_0_) {
      StringBuilder var3 = new StringBuilder();
      func_238343_a_(p_244782_0_, Style.EMPTY, (p_244781_1_, p_244781_2_, p_244781_3_) -> {
         var3.appendCodePoint(p_244781_3_);
         return true;
      });
      return var3.toString();
   }
}
