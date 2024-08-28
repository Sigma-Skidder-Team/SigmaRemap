package mapped;

import org.json.JSONException;

public class Class6703 {
   private static String method20432(Class7475 var0) throws Class2455 {
      char var3;
      do {
         var3 = var0.method24221();
      } while (var3 == ' ' || var3 == '\t');

      switch (var3) {
         case '\u0000':
            return null;
         case '"':
         case '\'':
            char var4 = var3;
            StringBuffer var5 = new StringBuffer();

            while (true) {
               var3 = var0.method24221();
               if (var3 == var4) {
                  return var5.toString();
               }

               if (var3 == 0 || var3 == '\n' || var3 == '\r') {
                  throw var0.method24230("Missing close quote '" + var4 + "'.");
               }

               var5.append(var3);
            }
         case ',':
            var0.method24217();
            return "";
         default:
            var0.method24217();
            return var0.method24226(',');
      }
   }

   public static Class2344 method20433(Class7475 var0) throws Class2455 {
      Class2344 var3 = new Class2344();

      while (true) {
         String var4 = method20432(var0);
         char var5 = var0.method24221();
         if (var4 == null || var3.method9134() == 0 && var4.length() == 0 && var5 != ',') {
            return null;
         }

         var3.method9158(var4);

         while (var5 != ',') {
            if (var5 != ' ') {
               if (var5 != '\n' && var5 != '\r' && var5 != 0) {
                  throw var0.method24230("Bad character '" + var5 + "' (" + var5 + ").");
               }

               return var3;
            }

            var5 = var0.method24221();
         }
      }
   }

   public static JSONObject method20434(Class2344 var0, Class7475 var1) throws Class2455 {
      Class2344 var4 = method20433(var1);
      return var4 == null ? null : var4.method9168(var0);
   }

   public static String method20435(Class2344 var0) {
      StringBuilder var3 = new StringBuilder();

      for (int var4 = 0; var4 < var0.method9134(); var4++) {
         if (var4 > 0) {
            var3.append(',');
         }

         Object var5 = var0.method9135(var4);
         if (var5 != null) {
            String var6 = var5.toString();
            if (var6.length() > 0 && (var6.indexOf(44) >= 0 || var6.indexOf(10) >= 0 || var6.indexOf(13) >= 0 || var6.indexOf(0) >= 0 || var6.charAt(0) == '"')
               )
             {
               var3.append('"');
               int var7 = var6.length();

               for (int var8 = 0; var8 < var7; var8++) {
                  char var9 = var6.charAt(var8);
                  if (var9 >= ' ' && var9 != '"') {
                     var3.append(var9);
                  }
               }

               var3.append('"');
            } else {
               var3.append(var6);
            }
         }
      }

      var3.append('\n');
      return var3.toString();
   }

   public static Class2344 method20436(String var0) throws Class2455 {
      return method20437(new Class7475(var0));
   }

   public static Class2344 method20437(Class7475 var0) throws Class2455 {
      return method20439(method20433(var0), var0);
   }

   public static Class2344 method20438(Class2344 var0, String var1) throws Class2455 {
      return method20439(var0, new Class7475(var1));
   }

   public static Class2344 method20439(Class2344 var0, Class7475 var1) throws Class2455 {
      if (var0 != null && var0.method9134() != 0) {
         Class2344 var4 = new Class2344();

         while (true) {
            JSONObject var5 = method20434(var0, var1);
            if (var5 == null) {
               return var4.method9134() != 0 ? var4 : null;
            }

            var4.method9158(var5);
         }
      } else {
         return null;
      }
   }

   public static String toString(Class2344 var0) throws Class2455 {
      JSONObject var3 = var0.method9147(0);
      if (var3 != null) {
         Class2344 var4 = var3.method21780();
         if (var4 != null) {
            return method20435(var4) + toString(var4, var0);
         }
      }

      return null;
   }

   public static String toString(Class2344 var0, Class2344 var1) throws Class2455 {
      if (var0 != null && var0.method9134() != 0) {
         StringBuffer var4 = new StringBuffer();

         for (int var5 = 0; var5 < var1.method9134(); var5++) {
            JSONObject var6 = var1.method9147(var5);
            if (var6 != null) {
               var4.append(method20435(var6.method21815(var0)));
            }
         }

         return var4.toString();
      } else {
         return null;
      }
   }
}
