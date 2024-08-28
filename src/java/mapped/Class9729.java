package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class9729 {
   @VisibleForTesting
   public static List<String> method38111(String var0) {
      return Arrays.<String>asList(var0.split("\\n"));
   }

   public static List<Class8081> method38112(String var0, Class6102... var1) {
      return method38113(var0, Arrays.<Class6102>asList(var1));
   }

   private static List<Class8081> method38113(String var0, List<Class6102> var1) {
      List var4 = method38111(var0);
      return method38114(var4, var1);
   }

   private static List<Class8081> method38114(List<String> var0, List<Class6102> var1) {
      int var4 = 0;
      ArrayList var5 = Lists.newArrayList();

      for (String var7 : var0) {
         ArrayList var8 = Lists.newArrayList();

         for (String var10 : method38115(var7, "%link")) {
            if (!"%link".equals(var10)) {
               var8.add(Class6102.method18868(var10));
            } else {
               var8.add(var1.get(var4++));
            }
         }

         var5.add(new Class8081(var8));
      }

      return var5;
   }

   public static List<String> method38115(String var0, String var1) {
      if (!var1.isEmpty()) {
         ArrayList var4 = Lists.newArrayList();
         int var5 = 0;

         int var6;
         while ((var6 = var0.indexOf(var1, var5)) != -1) {
            if (var6 > var5) {
               var4.add(var0.substring(var5, var6));
            }

            var4.add(var1);
            var5 = var6 + var1.length();
         }

         if (var5 < var0.length()) {
            var4.add(var0.substring(var5));
         }

         return var4;
      } else {
         throw new IllegalArgumentException("Delimiter cannot be the empty string");
      }
   }
}
