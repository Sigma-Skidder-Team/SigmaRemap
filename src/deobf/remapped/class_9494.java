package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class class_9494 {
   @VisibleForTesting
   public static List<String> method_43850(String var0) {
      return Arrays.<String>asList(var0.split("\\n"));
   }

   public static List<class_3557> method_43852(String var0, class_468... var1) {
      return method_43851(var0, Arrays.<class_468>asList(var1));
   }

   private static List<class_3557> method_43851(String var0, List<class_468> var1) {
      List var4 = method_43850(var0);
      return method_43853(var4, var1);
   }

   private static List<class_3557> method_43853(List<String> var0, List<class_468> var1) {
      int var4 = 0;
      ArrayList var5 = Lists.newArrayList();

      for (String var7 : var0) {
         ArrayList var8 = Lists.newArrayList();

         for (String var10 : method_43849(var7, "%link")) {
            if (!"%link".equals(var10)) {
               var8.add(class_468.method_2250(var10));
            } else {
               var8.add(var1.get(var4++));
            }
         }

         var5.add(new class_3557(var8));
      }

      return var5;
   }

   public static List<String> method_43849(String var0, String var1) {
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
