package mapped;

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

public class Class8064 {
   private static String[] field34603;
   private final String field34604;
   private final List<Style> field34605;
   private final Int2IntFunction field34606;

   private Class8064(String var1, List<Style> var2, Int2IntFunction var3) {
      this.field34604 = var1;
      this.field34605 = ImmutableList.copyOf(var2);
      this.field34606 = var3;
   }

   public String method27700() {
      return this.field34604;
   }

   public List<Class9125> method27701(int var1, int var2, boolean var3) {
      if (var2 != 0) {
         ArrayList var6 = Lists.newArrayList();
         Style var7 = this.field34605.get(var1);
         int var8 = var1;

         for (int var9 = 1; var9 < var2; var9++) {
            int var10 = var1 + var9;
            Style var11 = this.field34605.get(var10);
            if (!var11.equals(var7)) {
               String var12 = this.field34604.substring(var8, var10);
               var6.add(!var3 ? Class9125.method34038(var12, var7) : Class9125.method34039(var12, var7, this.field34606));
               var7 = var11;
               var8 = var10;
            }
         }

         if (var8 < var1 + var2) {
            String var13 = this.field34604.substring(var8, var1 + var2);
            var6.add(!var3 ? Class9125.method34038(var13, var7) : Class9125.method34039(var13, var7, this.field34606));
         }

         return (List<Class9125>)(!var3 ? var6 : Lists.reverse(var6));
      } else {
         return ImmutableList.of();
      }
   }

   public static Class8064 method27702(ITextProperties var0, Int2IntFunction var1, UnaryOperator<String> var2) {
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
      return new Class8064(var2.apply(var5.toString()), var6, var1);
   }
}
