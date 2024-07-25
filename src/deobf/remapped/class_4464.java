package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class class_4464 {
   private static final String field_21756 = "([^ \"=]*)";
   private static final String field_21754 = "\"([^\"]*)\"";
   private static final Pattern field_21755 = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

   private class_4464() {
   }

   public static long method_20718(class_7839 var0) {
      return method_20719(var0.method_35479());
   }

   public static long method_20719(class_8121 var0) {
      return method_20714(var0.method_36955("Content-Length"));
   }

   private static long method_20714(String var0) {
      if (var0 == null) {
         return -1L;
      } else {
         try {
            return Long.parseLong(var0);
         } catch (NumberFormatException var4) {
            return -1L;
         }
      }
   }

   public static boolean method_20703(class_7839 var0, class_8121 var1, class_3918 var2) {
      for (String var6 : method_20704(var0)) {
         if (!class_8515.method_39214(var1.values(var6), var2.method_18139(var6))) {
            return false;
         }
      }

      return true;
   }

   public static boolean method_20707(class_7839 var0) {
      return method_20708(var0.method_35479());
   }

   public static boolean method_20708(class_8121 var0) {
      return method_20705(var0).contains("*");
   }

   private static Set<String> method_20704(class_7839 var0) {
      return method_20705(var0.method_35479());
   }

   public static Set<String> method_20705(class_8121 var0) {
      Object var3 = Collections.emptySet();
      int var4 = 0;

      for (int var5 = var0.method_36948(); var4 < var5; var4++) {
         if ("Vary".equalsIgnoreCase(var0.method_36954(var4))) {
            String var6 = var0.method_36953(var4);
            if (var3.isEmpty()) {
               var3 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
            }

            for (String var10 : var6.split(",")) {
               var3.add(var10.trim());
            }
         }
      }

      return (Set<String>)var3;
   }

   public static class_8121 method_20716(class_7839 var0) {
      class_8121 var3 = var0.method_35484().method_35474().method_18138();
      class_8121 var4 = var0.method_35479();
      return method_20717(var3, var4);
   }

   public static class_8121 method_20717(class_8121 var0, class_8121 var1) {
      Set var4 = method_20705(var1);
      if (!var4.isEmpty()) {
         class_7414 var5 = new class_7414();
         int var6 = 0;

         for (int var7 = var0.method_36948(); var6 < var7; var6++) {
            String var8 = var0.method_36954(var6);
            if (var4.contains(var8)) {
               var5.method_33778(var8, var0.method_36953(var6));
            }
         }

         return var5.method_33781();
      } else {
         return new class_7414().method_33781();
      }
   }

   public static List<class_9814> method_20713(class_8121 var0, String var1) {
      ArrayList var4 = new ArrayList();

      for (String var7 : var0.values(var1)) {
         int var8 = var7.indexOf(32);
         if (var8 != -1) {
            Matcher var9 = field_21755.matcher(var7);

            for (int var10 = var8; var9.find(var10); var10 = var9.end()) {
               if (var7.regionMatches(true, var9.start(1), "realm", 0, 5)) {
                  String var11 = var7.substring(0, var8);
                  String var12 = var9.group(3);
                  if (var12 != null) {
                     var4.add(new class_9814(var11, var12));
                     break;
                  }
               }
            }
         }
      }

      return var4;
   }

   public static void method_20711(class_9207 var0, class_1672 var1, class_8121 var2) {
      if (var0 != class_9207.field_47101) {
         List var5 = class_8460.method_38922(var1, var2);
         if (!var5.isEmpty()) {
            var0.method_42481(var1, var5);
         }
      }
   }

   public static boolean method_20709(class_7839 var0) {
      if (var0.method_35474().method_18137().equals("HEAD")) {
         return false;
      } else {
         int var3 = var0.method_35490();
         return (var3 < 100 || var3 >= 200) && var3 != 204 && var3 != 304
            ? true
            : method_20718(var0) != -1L || "chunked".equalsIgnoreCase(var0.method_35472("Transfer-Encoding"));
      }
   }

   public static int method_20712(String var0, int var1, String var2) {
      while (var1 < var0.length() && var2.indexOf(var0.charAt(var1)) == -1) {
         var1++;
      }

      return var1;
   }

   public static int method_20706(String var0, int var1) {
      while (var1 < var0.length()) {
         char var4 = var0.charAt(var1);
         if (var4 != ' ' && var4 != '\t') {
            break;
         }

         var1++;
      }

      return var1;
   }

   public static int method_20710(String var0, int var1) {
      try {
         long var4 = Long.parseLong(var0);
         if (var4 > 2147483647L) {
            return Integer.MAX_VALUE;
         } else {
            return var4 < 0L ? 0 : (int)var4;
         }
      } catch (NumberFormatException var7) {
         return var1;
      }
   }
}
