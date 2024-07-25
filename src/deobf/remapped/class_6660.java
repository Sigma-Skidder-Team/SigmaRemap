package remapped;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class class_6660 {
   private static final Pattern field_34445 = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

   public static String method_30575(int var0) {
      int var3 = var0 / 20;
      int var4 = var3 / 60;
      var3 %= 60;
      return var3 >= 10 ? var4 + ":" + var3 : var4 + ":0" + var3;
   }

   public static String method_30578(String var0) {
      return field_34445.matcher(var0).replaceAll("");
   }

   public static boolean method_30576(String var0) {
      return StringUtils.isEmpty(var0);
   }
}
