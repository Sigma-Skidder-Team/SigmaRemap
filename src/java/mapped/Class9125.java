package mapped;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextProcessing;

@FunctionalInterface
public interface Class9125 {
   Class9125 field41930 = var0 -> true;

   boolean method34036(Class2545 var1);

   static Class9125 method34037(int var0, Style var1) {
      return var2 -> var2.method10739(0, var1, var0);
   }

   static Class9125 method34038(String var0, Style var1) {
      return !var0.isEmpty() ? var2 -> TextProcessing.func_238341_a_(var0, var1, var2) : field41930;
   }

   static Class9125 method34039(String var0, Style var1, Int2IntFunction var2) {
      return !var0.isEmpty() ? var3 -> TextProcessing.func_238345_b_(var0, var1, method34040(var3, var2)) : field41930;
   }

   static Class2545 method34040(Class2545 var0, Int2IntFunction var1) {
      return (var2, var3, var4) -> var0.method10739(var2, var3, (Integer)var1.apply(var4));
   }

   static Class9125 method34041(Class9125 var0, Class9125 var1) {
      return method34043(var0, var1);
   }

   static Class9125 method34042(List<Class9125> var0) {
      int var3 = var0.size();
      switch (var3) {
         case 0:
            return field41930;
         case 1:
            return (Class9125)var0.get(0);
         case 2:
            return method34043((Class9125)var0.get(0), (Class9125)var0.get(1));
         default:
            return method34044(ImmutableList.copyOf(var0));
      }
   }

   static Class9125 method34043(Class9125 var0, Class9125 var1) {
      return var2 -> var0.method34036(var2) && var1.method34036(var2);
   }

   static Class9125 method34044(List<Class9125> var0) {
      return var1 -> {
         for (Class9125 var5 : var0) {
            if (!var5.method34036(var1)) {
               return false;
            }
         }

         return true;
      };
   }
}
