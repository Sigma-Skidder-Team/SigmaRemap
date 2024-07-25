package remapped;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextProcessing;

@FunctionalInterface
public interface class_7107 {
   class_7107 field_36653 = var0 -> true;

   boolean method_32665(class_5255 var1);

   static class_7107 method_32666(int var0, Style var1) {
      return var2 -> var2.method_24020(0, var1, var0);
   }

   static class_7107 method_32662(String var0, Style var1) {
      return !var0.isEmpty() ? var2 -> TextProcessing.func_238341_a_(var0, var1, var2) : field_36653;
   }

   static class_7107 method_32658(String var0, Style var1, Int2IntFunction var2) {
      return !var0.isEmpty() ? var3 -> TextProcessing.func_238345_b_(var0, var1, method_32664(var3, var2)) : field_36653;
   }

   static class_5255 method_32664(class_5255 var0, Int2IntFunction var1) {
      return (var2, var3, var4) -> var0.method_24020(var2, var3, (Integer)var1.apply(var4));
   }

   static class_7107 method_32659(class_7107 var0, class_7107 var1) {
      return method_32661(var0, var1);
   }

   static class_7107 method_32660(List<class_7107> var0) {
      int var3 = var0.size();
      switch (var3) {
         case 0:
            return field_36653;
         case 1:
            return (class_7107)var0.get(0);
         case 2:
            return method_32661((class_7107)var0.get(0), (class_7107)var0.get(1));
         default:
            return method_32663(ImmutableList.copyOf(var0));
      }
   }

   static class_7107 method_32661(class_7107 var0, class_7107 var1) {
      return var2 -> var0.method_32665(var2) && var1.method_32665(var2);
   }

   static class_7107 method_32663(List<class_7107> var0) {
      return var1 -> {
         for (class_7107 var5 : var0) {
            if (!var5.method_32665(var1)) {
               return false;
            }
         }

         return true;
      };
   }
}
