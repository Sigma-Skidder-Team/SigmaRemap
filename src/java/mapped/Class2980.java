package mapped;

import com.google.gson.JsonElement;

public class Class2980 {
   private static String[] field18091;
   private static final Class7080 field18092 = new Class7081();

   public static String method11392(String var0, Class2307 var1, boolean var2) {
      Class7630 var5 = new Class7630();
      Class7630 var6 = new Class7630();
      StringBuilder var7 = new StringBuilder();
      if (var2) {
         var5.method25019(Boolean.valueOf(false));
      }

      for (int var8 = 0; var8 < var0.length(); var8++) {
         char var9 = var0.charAt(var8);
         if (var9 != 167) {
            var7.append(var9);
         } else {
            if (++var8 >= var0.length()) {
               break;
            }

            var9 = var0.charAt(var8);
            if (var9 >= 'A' && var9 <= 'Z') {
               var9 = (char)(var9 + ' ');
            }

            Class2307 var10 = Class2307.method9079(var9);
            if (var10 != null) {
               if (var7.length() > 0) {
                  Class7630 var11 = var6;
                  var6 = new Class7630(var6);
                  var11.method25045(var7.toString());
                  var7 = new StringBuilder();
                  var5.method25012(var11);
               }

               if (!Class2307.field15784.equals(var10)) {
                  if (!Class2307.field15787.equals(var10)) {
                     if (!Class2307.field15786.equals(var10)) {
                        if (!Class2307.field15785.equals(var10)) {
                           if (!Class2307.field15783.equals(var10)) {
                              if (!Class2307.field15788.equals(var10)) {
                                 var6 = new Class7630();
                                 var6.method25017(var10);
                              } else {
                                 var6 = new Class7630();
                                 var6.method25017(var1);
                              }
                           } else {
                              var6.method25022(Boolean.valueOf(true));
                           }
                        } else {
                           var6.method25021(Boolean.valueOf(true));
                        }
                     } else {
                        var6.method25020(Boolean.valueOf(true));
                     }
                  } else {
                     var6.method25019(Boolean.valueOf(true));
                  }
               } else {
                  var6.method25018(Boolean.valueOf(true));
               }
            }
         }
      }

      var6.method25045(var7.toString());
      var5.method25012(var6);
      return Class2577.toString(var5);
   }

   public static JsonElement method11393(String var0, Class2307 var1) {
      return Class9610.method37359().parse(method11392(var0, var1, false));
   }

   public static JsonElement method11394(String var0) {
      return method11393(var0, Class2307.field15782);
   }

   public static String method11395(String var0) {
      return method11392(var0, Class2307.field15782, false);
   }

   public static String method11396(String var0) {
      return Class7630.method24996(Class2577.method10772(var0));
   }

   public static void method11397(JsonElement var0) {
      field18092.method21999(var0);
   }
}
