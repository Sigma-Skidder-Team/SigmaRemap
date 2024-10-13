package mapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Class8394 {
   private static final String field36008 = "([^ \"=]*)";
   private static final String field36009 = "\"([^\"]*)\"";
   private static final Pattern field36010 = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

   private Class8394() {
   }

   public static long method29441(Class1797 var0) {
      return method29442(var0.method7853());
   }

   public static long method29442(Class9371 var0) {
      return method29443(var0.method35544("Content-Length"));
   }

   private static long method29443(String var0) {
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

   public static boolean method29444(Class1797 var0, Class9371 var1, Class8223 var2) {
      return true;
   }

   public static boolean method29445(Class1797 var0) {
      return method29446(var0.method7853());
   }

   public static boolean method29446(Class9371 var0) {
      return method29448(var0).contains("*");
   }

   public static Set<String> method29448(Class9371 var0) {
      Set<String> var3 = Collections.emptySet();
      int var4 = 0;

      for (int var5 = var0.method35546(); var4 < var5; var4++) {
         if ("Vary".equalsIgnoreCase(var0.method35547(var4))) {
            String var6 = var0.method35548(var4);
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

   public static Class9371 method29449(Class1797 var0) {
      Class9371 var3 = var0.method7858().method7844().method28614();
      Class9371 var4 = var0.method7853();
      return method29450(var3, var4);
   }

   public static Class9371 method29450(Class9371 var0, Class9371 var1) {
      Set var4 = method29448(var1);
      if (!var4.isEmpty()) {
         Class9192 var5 = new Class9192();
         int var6 = 0;

         for (int var7 = var0.method35546(); var6 < var7; var6++) {
            String var8 = var0.method35547(var6);
            if (var4.contains(var8)) {
               var5.method34436(var8, var0.method35548(var6));
            }
         }

         return var5.method34442();
      } else {
         return new Class9192().method34442();
      }
   }

   public static List<Class9824> method29451(Class9371 var0, String var1) {
      ArrayList var4 = new ArrayList();

      for (String var7 : var0.values(var1)) {
         int var8 = var7.indexOf(32);
         if (var8 != -1) {
            Matcher var9 = field36010.matcher(var7);

            for (int var10 = var8; var9.find(var10); var10 = var9.end()) {
               if (var7.regionMatches(true, var9.start(1), "realm", 0, 5)) {
                  String var11 = var7.substring(0, var8);
                  String var12 = var9.group(3);
                  if (var12 != null) {
                     var4.add(new Class9824(var11, var12));
                     break;
                  }
               }
            }
         }
      }

      return var4;
   }

   public static void method29452(Class9520 var0, Class7284 var1, Class9371 var2) {
      if (var0 != Class9520.field44322) {
         List var5 = Class9454.method36382(var1, var2);
         if (!var5.isEmpty()) {
            var0.method36785(var1, var5);
         }
      }
   }

   public static boolean method29453(Class1797 var0) {
      if (var0.method7844().method28613().equals("HEAD")) {
         return false;
      } else {
         int var3 = var0.method7846();
         return (var3 < 100 || var3 >= 200) && var3 != 204 && var3 != 304
            ? true
            : method29441(var0) != -1L || "chunked".equalsIgnoreCase(var0.method7851("Transfer-Encoding"));
      }
   }

   public static int method29454(String var0, int var1, String var2) {
      while (var1 < var0.length() && var2.indexOf(var0.charAt(var1)) == -1) {
         var1++;
      }

      return var1;
   }

   public static int method29455(String var0, int var1) {
      while (var1 < var0.length()) {
         char var4 = var0.charAt(var1);
         if (var4 != ' ' && var4 != '\t') {
            break;
         }

         var1++;
      }

      return var1;
   }

   public static int method29456(String var0, int var1) {
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
