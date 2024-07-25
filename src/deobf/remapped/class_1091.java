package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.LanguageMap;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TextPropertiesManager;

public class class_1091 {
   private static String[] field_6019;
   private static final class_7107 field_6020 = class_7107.method_32666(32, Style.EMPTY);

   private static String method_4785(String var0) {
      return !class_1893.method_8510().field_9577.field_45554 ? TextFormatting.getTextWithoutFormattingCodes(var0) : var0;
   }

   public static List<class_7107> method_4783(ITextProperties var0, int var1, class_9854 var2) {
      TextPropertiesManager var5 = new TextPropertiesManager();
      var0.func_230439_a_((var1x, var2x) -> {
         var5.func_238155_a_(ITextProperties.func_240653_a_(method_4785(var2x), var1x));
         return Optional.empty();
      }, Style.EMPTY);
      ArrayList var6 = Lists.newArrayList();
      var2.method_45381().func_243242_a(var5.func_238156_b_(), var1, Style.EMPTY, (var1x, var2x) -> {
         class_7107 var5x = LanguageMap.getInstance().func_241870_a(var1x);
         var6.add(!var2x ? var5x : class_7107.method_32659(field_6020, var5x));
      });
      return !var6.isEmpty() ? var6 : Lists.newArrayList(new class_7107[]{class_7107.field_36653});
   }
}
