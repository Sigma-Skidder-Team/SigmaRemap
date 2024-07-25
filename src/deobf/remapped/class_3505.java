package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextProcessing;

public class class_3505 {
   private static String[] field_17182;
   private final String field_17180;
   private final List<Style> field_17181;
   private final Int2IntFunction field_17179;

   private class_3505(String var1, List<Style> var2, Int2IntFunction var3) {
      this.field_17180 = var1;
      this.field_17181 = ImmutableList.copyOf(var2);
      this.field_17179 = var3;
   }

   public String method_16119() {
      return this.field_17180;
   }

   public List<class_7107> method_16121(int var1, int var2, boolean var3) {
      if (var2 != 0) {
         ArrayList var6 = Lists.newArrayList();
         Style var7 = this.field_17181.get(var1);
         int var8 = var1;

         for (int var9 = 1; var9 < var2; var9++) {
            int var10 = var1 + var9;
            Style var11 = this.field_17181.get(var10);
            if (!var11.equals(var7)) {
               String var12 = this.field_17180.substring(var8, var10);
               var6.add(!var3 ? class_7107.method_32662(var12, var7) : class_7107.method_32658(var12, var7, this.field_17179));
               var7 = var11;
               var8 = var10;
            }
         }

         if (var8 < var1 + var2) {
            String var13 = this.field_17180.substring(var8, var1 + var2);
            var6.add(!var3 ? class_7107.method_32662(var13, var7) : class_7107.method_32658(var13, var7, this.field_17179));
         }

         return (List<class_7107>)(!var3 ? var6 : Lists.reverse(var6));
      } else {
         return ImmutableList.of();
      }
   }

   public static class_3505 method_16120(ITextProperties var0, Int2IntFunction var1, UnaryOperator<String> var2) {
      StringBuilder var5 = new StringBuilder();
      ArrayList var6 = Lists.newArrayList();
      var0.func_230439_a_((var2x, var3) -> {
         TextProcessing.func_238346_c_(var3, var2x, (var2xx, var3x, var4) -> {
            var5.appendCodePoint(var4);
            int var7 = Character.charCount(var4);

            for (int var8 = 0; var8 < var7; var8++) {
               var6.add(var3x);
            }

            return true;
         });
         return Optional.empty();
      }, Style.EMPTY);
      return new class_3505(var2.apply(var5.toString()), var6, var1);
   }
}
