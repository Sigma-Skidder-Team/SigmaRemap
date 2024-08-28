package mapped;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class Class9001 {
   private static final Pattern field41157 = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

   public static String method33254(int var0) {
      int var3 = var0 / 20;
      int var4 = var3 / 60;
      var3 %= 60;
      return var3 >= 10 ? var4 + ":" + var3 : var4 + ":0" + var3;
   }

   public static String method33255(String var0) {
      return field41157.matcher(var0).replaceAll("");
   }

   public static boolean method33256(String var0) {
      return StringUtils.isEmpty(var0);
   }
}
