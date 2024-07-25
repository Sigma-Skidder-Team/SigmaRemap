package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum class_2909 {
   field_14209('0', "black"),
   field_14189('1', "dark_blue"),
   field_14210('2', "dark_green"),
   field_14188('3', "dark_aqua"),
   field_14196('4', "dark_red"),
   field_14204('5', "dark_purple"),
   field_14212('6', "gold"),
   field_14216('7', "gray"),
   field_14198('8', "dark_gray"),
   field_14213('9', "blue"),
   field_14205('a', "green"),
   field_14203('b', "aqua"),
   field_14207('c', "red"),
   field_14194('d', "light_purple"),
   field_14215('e', "yellow"),
   field_14206('f', "white"),
   field_14190('k', "obfuscated"),
   field_14199('l', "bold"),
   field_14193('m', "strikethrough"),
   field_14202('n', "underline"),
   field_14211('o', "italic"),
   field_14192('r', "reset");

   public static final char field_14197 = '§';
   public static final String field_14208 = "0123456789AaBbCcDdEeFfKkLlMmNnOoRr";
   public static final Pattern field_14200 = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
   private static final Map<Character, class_2909> field_14214 = new HashMap<Character, class_2909>();
   private final char field_14191;
   private final String field_14195;
   private final String field_14187;

   private class_2909(char var3, String var4) {
      this.field_14191 = var3;
      this.field_14187 = var4;
      this.field_14195 = new String(new char[]{'§', var3});
   }

   @Override
   public String toString() {
      return this.field_14195;
   }

   public static String method_13309(String var0) {
      return var0 != null ? field_14200.matcher(var0).replaceAll("") : null;
   }

   public static String method_13307(char var0, String var1) {
      char[] var4 = var1.toCharArray();

      for (int var5 = 0; var5 < var4.length - 1; var5++) {
         if (var4[var5] == var0 && "0123456789AaBbCcDdEeFfKkLlMmNnOoRr".indexOf(var4[var5 + 1]) > -1) {
            var4[var5] = 167;
            var4[var5 + 1] = Character.toLowerCase(var4[var5 + 1]);
         }
      }

      return new String(var4);
   }

   public static class_2909 method_13308(char var0) {
      return field_14214.get(var0);
   }

   public String method_13311() {
      return this.field_14187;
   }

   static {
      for (class_2909 var9 : values()) {
         field_14214.put(var9.field_14191, var9);
      }
   }
}
