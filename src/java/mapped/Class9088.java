package mapped;

import java.util.IllegalFormatException;
import net.minecraft.util.text.LanguageMap;

public class Class9088 {
   private static volatile LanguageMap field41601 = LanguageMap.getInstance();

   public static void method33882(LanguageMap var0) {
      field41601 = var0;
   }

   public static String method33883(String var0, Object... var1) {
      String var4 = field41601.func_230503_a_(var0);

      try {
         return String.format(var4, var1);
      } catch (IllegalFormatException var6) {
         return "Format error: " + var4;
      }
   }

   public static boolean method33884(String var0) {
      return field41601.func_230506_b_(var0);
   }
}
