package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum Class2307 {
   field15767('0', "black"),
   field15768('1', "dark_blue"),
   field15769('2', "dark_green"),
   field15770('3', "dark_aqua"),
   field15771('4', "dark_red"),
   field15772('5', "dark_purple"),
   field15773('6', "gold"),
   field15774('7', "gray"),
   field15775('8', "dark_gray"),
   field15776('9', "blue"),
   field15777('a', "green"),
   field15778('b', "aqua"),
   field15779('c', "red"),
   field15780('d', "light_purple"),
   field15781('e', "yellow"),
   field15782('f', "white"),
   field15783('k', "obfuscated"),
   field15784('l', "bold"),
   field15785('m', "strikethrough"),
   field15786('n', "underline"),
   field15787('o', "italic"),
   field15788('r', "reset");

   public static final char field15789 = '§';
   public static final String field15790 = "0123456789AaBbCcDdEeFfKkLlMmNnOoRr";
   public static final Pattern field15791 = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
   private static final Map<Character, Class2307> field15792 = new HashMap<Character, Class2307>();
   private final char field15793;
   private final String field15794;
   private final String field15795;
   private static final Class2307[] field15796 = new Class2307[]{
      field15767,
      field15768,
      field15769,
      field15770,
      field15771,
      field15772,
      field15773,
      field15774,
      field15775,
      field15776,
      field15777,
      field15778,
      field15779,
      field15780,
      field15781,
      field15782,
      field15783,
      field15784,
      field15785,
      field15786,
      field15787,
      field15788
   };

   private Class2307(char var3, String var4) {
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
         if (var4[var5] == var0 && "0123456789AaBbCcDdEeFfKkLlMmNnOoRr".indexOf(var4[var5 + 1]) > -1) {
            var4[var5] = 167;
            var4[var5 + 1] = Character.toLowerCase(var4[var5 + 1]);
         }
      }

      return new String(var4);
   }

   public static Class2307 method9079(char var0) {
      return field15792.get(var0);
   }

   public String method9080() {
      return this.field15795;
   }

   static {
      for (Class2307 var9 : values()) {
         field15792.put(var9.field15793, var9);
      }
   }
}
