package remapped;

import java.util.IllegalFormatException;
import net.minecraft.util.text.LanguageMap;

public class class_6956 {
   private static volatile LanguageMap field_35761 = LanguageMap.getInstance();

   public static void method_31806(LanguageMap var0) {
      field_35761 = var0;
   }

   public static String method_31803(String var0, Object... var1) {
      String var4 = field_35761.func_230503_a_(var0);

      try {
         return String.format(var4, var1);
      } catch (IllegalFormatException var6) {
         return "Format error: " + var4;
      }
   }

   public static boolean method_31804(String var0) {
      return field_35761.func_230506_b_(var0);
   }
}
