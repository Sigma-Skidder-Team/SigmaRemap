package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.LanguageMap;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TextPropertiesManager;

public class Class6885 {
   private static String[] field29838;
   private static final Class9125 field29839 = Class9125.method34037(32, Style.EMPTY);

   private static String method20970(String var0) {
      return !Minecraft.getInstance().gameSettings.field44612 ? TextFormatting.getTextWithoutFormattingCodes(var0) : var0;
   }

   public static List<Class9125> method20971(ITextProperties var0, int var1, FontRenderer var2) {
      TextPropertiesManager var5 = new TextPropertiesManager();
      var0.func_230439_a_((var1x, var2x) -> {
         var5.func_238155_a_(ITextProperties.func_240653_a_(method20970(var2x), var1x));
         return Optional.empty();
      }, Style.EMPTY);
      ArrayList var6 = Lists.newArrayList();
      var2.method38830().func_243242_a(var5.func_238156_b_(), var1, Style.EMPTY, (var1x, var2x) -> {
         Class9125 var5x = LanguageMap.getInstance().func_241870_a(var1x);
         var6.add(!var2x ? var5x : Class9125.method34041(field29839, var5x));
      });
      return !var6.isEmpty() ? var6 : Lists.newArrayList(new Class9125[]{Class9125.field41930});
   }
}
