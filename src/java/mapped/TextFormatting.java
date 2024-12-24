package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum TextFormatting {
   BLACK('0', "black"),
   DARK_BLUE('1', "dark_blue"),
   DARK_GREEN('2', "dark_green"),
   DARK_AQUA('3', "dark_aqua"),
   DARK_RED('4', "dark_red"),
   DARK_PURPLE('5', "dark_purple"),
   GOLD('6', "gold"),
   GRAY('7', "gray"),
   DARK_GRAY('8', "dark_gray"),
   BLUE('9', "blue"),
   GREEN('a', "green"),
   AQUA('b', "aqua"),
   RED('c', "red"),
   LIGHT_PURPLE('d', "light_purple"),
   YELLOW('e', "yellow"),
   WHITE('f', "white"),
   OBFUSCATED('k', "obfuscated"),
   BOLD('l', "bold"),
   STRIKETHROUGH('m', "strikethrough"),
   UNDERLINE('n', "underline"),
   ITALIC('o', "italic"),
   RESET('r', "reset");

   public static final char beginSymbol = '§';
   public static final String ASCII_ALL_CASE_LETTERS_AND_NUMBERS = "0123456789AaBbCcDdEeFfKkLlMmNnOoRr";
   public static final Pattern field15791 = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
   private static final Map<Character, TextFormatting> field15792 = new HashMap<Character, TextFormatting>();
   private final char field15793;
   private final String field15794;
   private final String field15795;
   private static final TextFormatting[] FORMATTING_BY_NAME = new TextFormatting[]{
           BLACK,
           DARK_BLUE,
           DARK_GREEN,
           DARK_AQUA,
           DARK_RED,
           DARK_PURPLE,
           GOLD,
           GRAY,
           DARK_GRAY,
           BLUE,
           GREEN,
           AQUA,
           RED,
           LIGHT_PURPLE,
           YELLOW,
           WHITE,
           OBFUSCATED,
           BOLD,
           STRIKETHROUGH,
           UNDERLINE,
           ITALIC,
           RESET
   };

   private TextFormatting(char var3, String var4) {
      this.field15793 = var3;
      this.field15795 = var4;
      this.field15794 = new String(new char[]{'§', var3});
   }

   @Override
   public String toString() {
      return this.field15794;
   }

   public static String method9077(String var0) {
      return var0 != null ? field15791.matcher(var0).replaceAll("") : null;
   }

   public static String method9078(char var0, String var1) {
      char[] var4 = var1.toCharArray();

      for (int var5 = 0; var5 < var4.length - 1; var5++) {
         if (var4[var5] == var0 && ASCII_ALL_CASE_LETTERS_AND_NUMBERS.indexOf(var4[var5 + 1]) > -1) {
            var4[var5] = 167;
            var4[var5 + 1] = Character.toLowerCase(var4[var5 + 1]);
         }
      }

      return new String(var4);
   }

   public static TextFormatting getChatFormatting(char var0) {
      return field15792.get(var0);
   }

   public String method9080() {
      return this.field15795;
   }

   static {
      for (TextFormatting var9 : values()) {
         field15792.put(var9.field15793, var9);
      }
   }
}
