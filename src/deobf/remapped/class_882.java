package remapped;

import org.json.JSONException;

public class class_882 {
   private static String method_3795(class_3734 var0) throws JSONException {
      char var3;
      do {
         var3 = var0.method_17289();
      } while (var3 == ' ' || var3 == '\t');

      switch (var3) {
         case '\u0000':
            return null;
         case '"':
         case '\'':
            char var4 = var3;
            StringBuffer var5 = new StringBuffer();

            while (true) {
               var3 = var0.method_17289();
               if (var3 == var4) {
                  return var5.toString();
               }

               if (var3 == 0 || var3 == '\n' || var3 == '\r') {
                  throw var0.method_17292("Missing close quote '" + var4 + "'.");
               }

               var5.append(var3);
            }
         case ',':
            var0.method_17299();
            return "";
         default:
            var0.method_17299();
            return var0.method_17297(',');
      }
   }

   public static JSONArray method_3793(class_3734 var0) throws JSONException {
      JSONArray var3 = new JSONArray();

      while (true) {
         String var4 = method_3795(var0);
         char var5 = var0.method_17289();
         if (var4 == null || var3.method_6142() == 0 && var4.length() == 0 && var5 != ',') {
            return null;
         }

         var3.method_6159(var4);

         while (var5 != ',') {
            if (var5 != ' ') {
               if (var5 != '\n' && var5 != '\r' && var5 != 0) {
                  throw var0.method_17292("Bad character '" + var5 + "' (" + var5 + ").");
               }

               return var3;
            }

            var5 = var0.method_17289();
         }
      }
   }

   public static JSONObjectImpl method_3796(JSONArray var0, class_3734 var1) throws JSONException {
      JSONArray var4 = method_3793(var1);
      return var4 == null ? null : var4.method_6132(var0);
   }

   public static String method_3794(JSONArray var0) {
      StringBuilder var3 = new StringBuilder();

      for (int var4 = 0; var4 < var0.method_6142(); var4++) {
         if (var4 > 0) {
            var3.append(',');
         }

         Object var5 = var0.method_6135(var4);
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

   public static JSONArray method_3788(String var0) throws JSONException {
      return method_3791(new class_3734(var0));
   }

   public static JSONArray method_3791(class_3734 var0) throws JSONException {
      return method_3790(method_3793(var0), var0);
   }

   public static JSONArray method_3789(JSONArray var0, String var1) throws JSONException {
      return method_3790(var0, new class_3734(var1));
   }

   public static JSONArray method_3790(JSONArray var0, class_3734 var1) throws JSONException {
      if (var0 != null && var0.method_6142() != 0) {
         JSONArray var4 = new JSONArray();

         while (true) {
            JSONObjectImpl var5 = method_3796(var0, var1);
            if (var5 == null) {
               return var4.method_6142() != 0 ? var4 : null;
            }

            var4.method_6159(var5);
         }
      } else {
         return null;
      }
   }

   public static String toString(JSONArray var0) throws JSONException {
      JSONObjectImpl var3 = var0.method_6164(0);
      if (var3 != null) {
         JSONArray var4 = var3.method_5815();
         if (var4 != null) {
            return method_3794(var4) + toString(var4, var0);
         }
      }

      return null;
   }

   public static String toString(JSONArray var0, JSONArray var1) throws JSONException {
      if (var0 != null && var0.method_6142() != 0) {
         StringBuffer var4 = new StringBuffer();

         for (int var5 = 0; var5 < var1.method_6142(); var5++) {
            JSONObjectImpl var6 = var1.method_6164(var5);
            if (var6 != null) {
               var4.append(method_3794(var6.method_5864(var0)));
            }
         }

         return var4.toString();
      } else {
         return null;
      }
   }
}
